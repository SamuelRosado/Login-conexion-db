package dbconecciones;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbconection {
		
	public static Connection getconnect() {
			
			Connection connect = null;
		 try {
			 Class.forName ("com.mysql.jdbc.Driver");
			 String URL = "jdbc:mysql://localhost:3306/javalogin";
			 String USER = "root";
			 String PASWORD = "goldmaster";
			 
			 connect = DriverManager.getConnection(URL,USER,PASWORD);
			 			 
		} catch (ClassNotFoundException e) {
			System.out.println("Error en el DRIVER");
			
			e.printStackTrace();
			
		} catch (SQLException e) {
			System.out.println("Error con la Base de datos");

			e.printStackTrace();
		} 
		 return connect;
		}
}
