<%@page import="adms.dao.DBConnection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="adms.SendE,adms.UsPs" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ page import="java.sql.*" %>
<%
String otp=request.getParameter("o");
String name=request.getParameter("n");
String email=request.getParameter("e");
String mobile=request.getParameter("m");
String course=request.getParameter("c");
String sotp=(String)session.getAttribute(mobile);
int id=new java.util.Date().getYear()+1900;
if(otp.equals(sotp))
 {SendE ob=new SendE();
  ob.sendEm(UsPs.getEmail(), UsPs.getPass(), email, name,sotp, course);
  out.println("REgistration complete");
 }
// get reCAPTCHA request param
String gRecaptchaResponse = request.getParameter("g-recaptcha-response");
System.out.println(gRecaptchaResponse);
if(sotp!=null)
{
	int i;
	try{  
		//Class.forName("com.mysql.jdbc.Driver");  
		//Connection con=DriverManager.getConnection("jdbc:mysql://111.93.169.133:3306/admmgmt","admmgmt","Sucess#is#trident");  
		Connection con=new DBConnection().getConnection();
		PreparedStatement ps1=con.prepareStatement("select id from user_info order by id desc");
		ResultSet rs=ps1.executeQuery();
		 
		if(rs.next())
		{
			i=rs.getInt(1)*100+1;
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
		ps.executeUpdate();
		con.close();
	}
	catch(Exception e)
	{
		out.println(e);
	}
}
else
	response.sendRedirect("index.html");
//boolean verify = admmgmt.VerifyRecaptcha.verify(gRecaptchaResponse);
%>

</body>
</html>