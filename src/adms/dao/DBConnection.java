package adms.dao;
import java.sql.*;
public class DBConnection {
	Connection con=null;
   public Connection getConnection()
   {
	   try
	   {
		    Class.forName("com.mysql.jdbc.Driver");  
		    con=DriverManager.getConnection("jdbc:mysql://111.93.169.133:3306/admmgmt","admmgmt","Sucess#is#trident");  
		    
	   }
	   catch(Exception e)
	   {
		   System.out.println(e);
	   }
	   return con;
   }
}
