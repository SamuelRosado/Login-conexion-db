package mant;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import classes.Users;
import dbconecciones.dbconection;

public class RegisterManage {
	
	public int register(Users user) {
		
		int reg = 0;
		
		String sql = "insert into users values(?,?,?,?,?,?,?)";
		
		try(PreparedStatement pstm = dbconection.getconnect().prepareStatement(sql)){
			
		 pstm.setString(1, user.getUsuarios());
		 pstm.setString(2, user.getClave());
		 pstm.setString(3, user.getConclave());
		 pstm.setString(4, user.getNombre());
		 pstm.setString(5, user.getApellido());
		 pstm.setString(6, user.getNumero_telefono());
		 pstm.setString(7, user.getEmail());
		 
		 reg = pstm.executeUpdate();
		 
		 
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return reg;
	}
	

}
