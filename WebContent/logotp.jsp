
<%@page import="adms.services.Otp"%>
<%@page import="adms.otp.SendOtp"%>
<%@page import="adms.services.CheckUser"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
   String otp=new Otp().getOtp();
   String mobile=request.getParameter("m");
   String res=new CheckUser().checkMobile(mobile);
   System.out.println(res);
 if(res!=null)
 {
		 session.setAttribute("log"+mobile, otp+"_"+res);
		 new SendOtp().sendmessage("", mobile, otp);
	 
 }
   System.out.println(otp);
  
%>

</body>
</html>