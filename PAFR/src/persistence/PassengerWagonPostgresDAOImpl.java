package persistence;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import domain.FreightWagon;
import domain.PassengerWagon;
import domain.PassengerWagonBuilder;

public class PassengerWagonPostgresDAOImpl extends PostgresBaseDAO implements PassengerWagonDAO{
	
private static PassengerWagonPostgresDAOImpl mInstance;
	
	private PassengerWagonPostgresDAOImpl() {
		
	}
	
	public static PassengerWagonPostgresDAOImpl getInstance() {
		if (mInstance == null) {
			mInstance = new PassengerWagonPostgresDAOImpl();
		}
		return mInstance;
	}

	@Override
	public void addPassengerWagon(int amountSeats, boolean silent, double length, boolean toilet,
			String company, double weight) {
		Connection myConn = super.getConnection();
		Statement stmt;
		try {
			stmt = myConn.createStatement();
			String statement = "INSERT INTO passengerWagons (type, amountSeats, silent, length, toilet, company, constructionYear, weight, status) "
					+ "VALUES (\'Passenger', "+amountSeats+", \'"+silent+"\', \'"+length+"\', \'"+toilet+"\', \'"+company+"\', 2020"
							+ ", \'"+weight+"\', \'"+"New"+"\')";
			stmt.execute(statement);
			myConn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
	
	@Override
	public PassengerWagon getPassengerWagon(int id) {
		PassengerWagon fw = null;
		try {
			Connection myConn = super.getConnection();
			Statement stm = myConn.createStatement();
			ResultSet rs = stm.executeQuery("SELECT * FROM PassengerWAGONS WHERE ID = "+ id);
			PassengerWagonBuilder fwb = new PassengerWagonBuilder();
			while(rs.next()) {
				fwb.setId(rs.getInt(1));
				fwb.setType(rs.getString(2));
				fwb.setLength(rs.getDouble(5));
				fwb.setWeight(rs.getDouble(10));
				fwb.setAmountSeats(Integer.parseInt(rs.getString(3)));
				fwb.setCompany(rs.getString(7));
				fwb.setConstructionYear(rs.getInt(8));
				fwb.setStatus(rs.getString(9));
				fwb.setToilet(rs.getBoolean(6));
				fwb.setSilent(rs.getBoolean(4));
				fwb.setTrainId(rs.getInt(11));
			}
			myConn.close();
			fw = fwb.buildWithId();
		}catch(Exception exc){
			exc.printStackTrace();
		}
		 return fw;
	}
	
	public boolean deletePassengerWagon(int id) {
		Connection myConn = super.getConnection();
		Statement stmt;
		PassengerWagon prw = this.getPassengerWagon(id);
		if (prw.getTrainId() != 0) {
			return false;
		} else {
			try {
				stmt = myConn.createStatement();
				String statement = "DELETE FROM PassengerWagons WHERE ID = "+id;
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
	public boolean updatePassengerWagon(int id, double length, double weight, int seats, boolean silent, boolean toilet, String company, String status) {
	Connection myConn = super.getConnection();
	Statement stm;
	try {
		stm = myConn.createStatement();
		stm.execute("UPDATE PassengerWAGONS " +
				"SET length = "+length+", " +
				"weight = "+weight+", " +
				"amountseats = "+seats+", " +
				"toilet = "+toilet+", " +
				"silent = "+silent+", " +
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
	public boolean disconnectWagon(int id) {
		String statement = ("update passengerwagons set trainid = null where id = " + id);
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
	public boolean connectWagon(int wagonId, int trainId) {
		String statement = ("update passengerwagons set trainid = "+trainId+" where id = " + wagonId);
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
			statement = "SELECT id,type FROM PassengerWAGONS WHERE TRAINID is null";
		} else {
			statement = "SELECT id,type FROM PassengerWAGONS WHERE TRAINID = "+ trainId;
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
