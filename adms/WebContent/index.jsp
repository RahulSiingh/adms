<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Trident:Admission Management System</title>
<link rel=”stylesheet” href=”css/bootstrap.css”>
<link rel=”stylesheet” href=”css/bootstrap-responsive.css”>
 <script src="https://www.google.com/recaptcha/api.js" async defer></script>
 <script type="text/javascript">
  var onloadCallback = function() {
    alert("grecaptcha is ready!");
  };
</script>
<style type="text/css">
 #d{border:3px solid gray;width:25%;height:70%;position:absolute; left:60%;top:20%;}
 
</style>
<script>
      function verify()
      {
    	  
      }
</script>
</head>
<body>
<h1>Admission Management System</h1>
<div id=d align=center>
 <h1>Self Registration</h1><hr color=green><br>
 <form action="regaction.jsp" method="POST">
 <table width=80% cellspacing=10>
      <tr><td>Enter Name </td><td>   <input type=text name=n></td></tr>
      <tr><td>Enter Mobile</td><td><input type=text name=m onblur=verify()></td></tr>
      <tr><td colspan=2><input type=text id=ot placeholder="Enter OTP"></td></tr> 
      <tr><td>Enter Email</td><td> <input type=email name=e></td></tr>
      <tr><td>Choose Course</td><td> <select name=c >
       <option>BTech</option>
       <option>MTech</option>
       <option>MBA</option>
       <option>BCA</option>
       <option>BBA</option>
       <option>MSc</option>
       <option>BSc</option>
       <option>MCA</option>    
        </select></td></tr>
      <tr><td colspan=2>
      <div class="g-recaptcha" data-sitekey="6LfhagEcAAAAAJXKE3WO79-M-pOqJG21LZ-gLy5c"></div>
      <td/></tr>
      <tr><td colspan=2 align=right><input type="submit" value="Register"></td></tr>
    </form>
    </div>
</body>
</html>