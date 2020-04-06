package persistence;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TrainPostgresDAOImpl extends PostgresBaseDAO implements TrainDAO {

	@Override
	public void addTrain(String type, double length, double weight, String propulsion,
			double maxSpeed, int constructionYear, String company) {
		Connection myConn = super.getConnection();
		Statement stmt;
		try {
			stmt = myConn.createStatement();
			String statement = "INSERT INTO trains (type, weight, propulsion, topSpeed, constructionYear, status, company, length) "
					+ "VALUES (\'"+type+"\', "+weight+", \'"+propulsion+"\', \'"+maxSpeed+"\', \'"+constructionYear+"\', \'"+"New"+"\'"
							+ ", \'"+company+"\', \'"+length+"\')";
			stmt.execute(statement);
			myConn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
