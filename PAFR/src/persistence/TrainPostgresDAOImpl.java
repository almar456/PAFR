package persistence;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

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

}
