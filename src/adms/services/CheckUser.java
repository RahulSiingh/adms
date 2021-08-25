package adms.services;

import java.sql.*;
import adms.dao.DBConnection;
public class CheckUser {
	
	String idmob=null;
	public String checkMobile(String m)
	{
		try{
		  Connection con=new DBConnection().getConnection();
		  PreparedStatement ps=con.prepareStatement("select id,mobile from user_info where mobile=?");
		  ps.setString(1, m);
		  ResultSet rs=ps.executeQuery();
		  if(rs.next())
			  idmob=rs.getString(1)+"_"+rs.getString(2);
		  System.out.println(idmob);
		  con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return idmob;
	}
}
