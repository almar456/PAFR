package persistence;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import domain.FreightWagon;
import domain.FreightWagonBuilder;

public class FreightWagonPostgresDAOImpl extends PostgresBaseDAO implements FreightWagonDAO {
	
	private static FreightWagonPostgresDAOImpl mInstance;
	
	private FreightWagonPostgresDAOImpl() {
		
	}
	
	public static FreightWagonPostgresDAOImpl getInstance() {
		if (mInstance == null) {
			mInstance = new FreightWagonPostgresDAOImpl();
		}
		return mInstance;
	}

	@Override
	public void addFreightWagon(double length, double weight, String cargo,
			String company) {
		Connection myConn = super.getConnection();
		Statement stmt;
		try {
			stmt = myConn.createStatement();
			String statement = "INSERT INTO freightWagons (type, length, weight, cargo, company, constructionYear, status) "
					+ "VALUES (\'Freight\', "+length+", \'"+weight+"\', \'"+cargo+"\', \'"+company+"\', 2020"
							+ ", \'"+"New"+"\')";
			stmt.execute(statement);
			myConn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}

	@Override
	public FreightWagon getFreightWagon(int id) {
		FreightWagon fw = null;
		try {
			Connection myConn = super.getConnection();
			Statement stm = myConn.createStatement();
			ResultSet rs = stm.executeQuery("SELECT * FROM FREIGHTWAGONS WHERE ID = "+ id);
			FreightWagonBuilder fwb = new FreightWagonBuilder();
			while(rs.next()) {
				fwb.setId(rs.getInt(1));
				fwb.setType(rs.getString(2));
				fwb.setLength(rs.getDouble(3));
				fwb.setWeight(rs.getDouble(4));
				fwb.setCargo(rs.getString(5));
				fwb.setCompany(rs.getString(6));
				fwb.setConstructionYear(rs.getInt(7));
				fwb.setStatus(rs.getString(8));
				fwb.setTrainId(rs.getInt(9));
			}
			myConn.close();
			fw = fwb.buildWithId();
		}catch(Exception exc){
			exc.printStackTrace();
		}
		 return fw;
	}
	
	@Override
	public boolean deleteFreightWagon(int id) {
		Connection myConn = super.getConnection();
		Statement stmt;
		FreightWagon frw = this.getFreightWagon(id);
		if (frw.getTrainId() != 0) {
			return false;
		} else {
			try {
				stmt = myConn.createStatement();
				String statement = "DELETE FROM freightWagons WHERE ID = "+id;
				stmt.execute(statement);
				myConn.close();
				return true;
			} catch (SQLException e) {
				e.printStackTrace();
				return false;
			}
		}
	}
	
	@Override
	public boolean updateFreightWagon(int id, double length, double weight, String cargo, String company, String status) {
	Connection myConn = super.getConnection();
	Statement stm;
	try {
		stm = myConn.createStatement();
		stm.execute("UPDATE FREIGHTWAGONS " +
				"SET length = "+length+", " +
				"weight = "+weight+", " +
				"cargo = '"+cargo+"', " +
				"company = '"+company+"', " +
				"status = '"+status+"' " +
				"WHERE id = "+id);
		myConn.close();
		return true;
	} catch (SQLException e) {
		return false;
	}
	}
	
	@Override
	public boolean connectWagon(int wagonId, int trainId) {
		String statement = ("update freightwagons set trainid = "+trainId+" where id = " + wagonId);
		Connection myConn = super.getConnection();
		Statement stm;
		try {
			stm = myConn.createStatement();
			stm.execute(statement);
			myConn.close();
			return true;
		} catch (SQLException e) {
			return false;
		}
	}

	@Override
	public boolean disconnectWagon(int id) {
		String statement = ("update freightwagons set trainid = null where id = " + id);
		Connection myConn = super.getConnection();
		Statement stm;
		try {
			stm = myConn.createStatement();
			stm.execute(statement);
			myConn.close();
			return true;
		} catch (SQLException e) {
			return false;
		}
	}

	@Override
	public ArrayList<String> getIdByTrain(int trainId) {
		ArrayList<String> lst = new ArrayList<String>();
		String statement;
		
		if (trainId == 0) {
			statement = "SELECT id,type FROM FREIGHTWAGONS WHERE TRAINID is null";
		} else {
			statement = "SELECT id,type FROM FREIGHTWAGONS WHERE TRAINID = "+ trainId;
		}
		try {
			Connection myConn = super.getConnection();
			Statement stm = myConn.createStatement();
			ResultSet rs = stm.executeQuery(statement);
			while(rs.next()) {
				lst.add(rs.getString(2)+" "+rs.getInt(1));
			}
			myConn.close();
		}catch(Exception exc){
			exc.printStackTrace();
		}
		
		return lst;
	}
}
