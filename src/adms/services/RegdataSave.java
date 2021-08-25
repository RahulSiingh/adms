package adms.services;
import java.sql.*;
import adms.dao.DBConnection;
public class RegdataSave {
	public int saveRegData(String name,String email,String mobile,String course)
	{
		int i,r=0;
		int id=new java.util.Date().getYear()+1900;

		try{  
			Connection con=new DBConnection().getConnection();
			PreparedStatement ps1=con.prepareStatement("select id from user_info order by id desc");
			ResultSet rs=ps1.executeQuery();
			if(rs.next())
			{
				i=rs.getInt(1)+1;
			}
			else
				i=id*100+1;
			PreparedStatement ps=con.prepareStatement("insert into user_info values(?,?,?,?,?,?)");
			ps.setInt(1,i);
			ps.setString(2,name);
			ps.setString(3,email);
			ps.setString(4,mobile);
			ps.setString(5,course);
			ps.setString(6,"1");
			r=ps.executeUpdate();
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return r;
	}

}
