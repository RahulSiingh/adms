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
String otp=request.getParameter("o");
String mobile=request.getParameter("m");
String sotp=(String)session.getAttribute("log"+mobile);
if(otp.equals(sotp))
 {
	out.println("Valid user");
    
 }
else
	out.println("Not valid user");
// get reCAPTCHA request param
String gRecaptchaResponse = request.getParameter("g-recaptcha-response");
System.out.println(gRecaptchaResponse);

//boolean verify = admmgmt.VerifyRecaptcha.verify(gRecaptchaResponse);
%>

</body>
</html>