package persistence;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class PassengerWagonPostgresDAOImpl extends PostgresBaseDAO implements PassengerWagonDAO{

	@Override
	public void addPassengerWagon(String type, int amountSeats, boolean silent, double length, boolean toilet,
			String company, int constructionYear, double weight) {
		Connection myConn = super.getConnection();
		Statement stmt;
		try {
			stmt = myConn.createStatement();
			String statement = "INSERT INTO passengerWagons (type, amountSeats, silent, length, toilet, company, constructionYear, weight, status) "
					+ "VALUES (\'"+type+"\', "+amountSeats+", \'"+silent+"\', \'"+length+"\', \'"+toilet+"\', \'"+company+"\', \'"+constructionYear+"\'"
							+ ", \'"+weight+"\', \'"+"New"+"\')";
			stmt.execute(statement);
			myConn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
	
}
