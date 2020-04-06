package persistence;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class FreightWagonPostgresDAOImpl extends PostgresBaseDAO implements FreightWagonDAO {

	@Override
	public void addFreightWagon(String type, double length, double weight, String cargo,
			String company, int constructionYear) {
		Connection myConn = super.getConnection();
		Statement stmt;
		try {
			stmt = myConn.createStatement();
			String statement = "INSERT INTO freightWagons (type, length, weight, cargo, company, constructionYear, status) "
					+ "VALUES (\'"+type+"\', "+length+", \'"+weight+"\', \'"+cargo+"\', \'"+company+"\', \'"+constructionYear+"\'"
							+ ", \'"+"New"+"\')";
			stmt.execute(statement);
			myConn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
	
}
