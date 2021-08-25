package adms.services;
import java.sql.*;
public class LogInfoSave {
	public void saveInfo(String id)
	{
		try
		{
			Connection con=new adms.dao.DBConnection().getConnection();
			PreparedStatement ps=con.prepareStatement("insert into login_info values(?,CURRENT_TIMESTAMP)");
			ps.setString(1, id);
			ps.executeUpdate();
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
