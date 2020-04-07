package persistence;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import domain.FreightWagon;
import domain.Train;

public class TrainPostgresDAOImpl extends PostgresBaseDAO implements TrainDAO {
	
private static TrainPostgresDAOImpl mInstance;
	
	private TrainPostgresDAOImpl() {
		
	}
	
	public static TrainPostgresDAOImpl getInstance() {
		if (mInstance == null) {
			mInstance = new TrainPostgresDAOImpl();
		}
		return mInstance;
	}

	@Override
	public void addTrain(double length, double weight, String propulsion,
			double maxSpeed, String company) {
		Connection myConn = super.getConnection();
		Statement stmt;
		try {
			stmt = myConn.createStatement();
			String statement = "INSERT INTO trains (weight, propulsion, topSpeed, constructionyear, status, company, length) "
					+ "VALUES ("+weight+", \'"+propulsion+"\', \'"+maxSpeed+"\', 2020, \'"+"New"+"\'"
							+ ", \'"+company+"\', \'"+length+"\')";
			stmt.execute(statement);
			myConn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Train getTrain(int id) {
		Train tr = new Train();
		try {
			Connection myConn = super.getConnection();
			Statement stm = myConn.createStatement();
			ResultSet rs = stm.executeQuery("SELECT * FROM TrainS WHERE ID = "+ id);
			while(rs.next()) {
				tr.setId(rs.getInt(1));
				tr.setLength(rs.getDouble(8));
				tr.setWeight(rs.getDouble(2));
				tr.setPropulsion(rs.getString(3));
				tr.setCompany(rs.getString(7));
				tr.setConstructionYear(rs.getInt(5));
				tr.setStatus(rs.getString(6));
				tr.setMaxSpeed(rs.getInt(4));
			}
			myConn.close();
		}catch(Exception exc){
			exc.printStackTrace();
		}
		 return tr;
	}

	@Override
	public boolean updateTrain(int id, double length, double weight, String propulsion, double speed, String company,
			String status) {
		Connection myConn = super.getConnection();
		Statement stm;
		try {
			stm = myConn.createStatement();
			stm.execute("UPDATE TRAINS " +
					"SET length = "+length+", " +
					"weight = "+weight+", " +
					"PROPULSION = '"+propulsion+"', " +
					"company = '"+company+"', " +
					"status = '"+status+"', " +
					"topspeed = "+speed+" " +
					"WHERE id = "+id);
			myConn.close();
			return true;
		} catch (SQLException e) {
			return false;
		}
	}

	@Override
	public boolean deleteTrain(int id) {
		Connection myConn = super.getConnection();
		Statement stmt;

		if (this.checkWagons(id)) {
			return false;
		} else {
			try {
				stmt = myConn.createStatement();
				String statement = "DELETE FROM trains WHERE ID = "+id;
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
	public boolean checkWagons(int id) {
		FreightWagonPostgresDAOImpl dao1 = FreightWagonPostgresDAOImpl.getInstance();
		PassengerWagonPostgresDAOImpl dao2 = PassengerWagonPostgresDAOImpl.getInstance();
		
		ArrayList<String> lst1 = dao1.getIdByTrain(id);
		ArrayList<String> lst2 = dao2.getIdByTrain(id);
		
		lst1.addAll(lst2);
		if (lst1.size() != 0) {
			return true;
		} else {
			return false;
		}
	}

}
