package configuration;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class DBConnector 
	{
	
		public static Connection connect() throws SQLException, ClassNotFoundException{
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Restaurant", "root", "1234");
	    return con;
	}
	
		public static void main(String[] args) {
			try {
				DBConnector.connect();
				System.out.println("Success");
			
				}
			catch(Exception e)
			{
				e.printStackTrace();
			
			}
		
	}

	

}
