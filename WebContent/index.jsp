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
 #d{border:3px solid gray;width:25%;height:71%;position:absolute; left:60%;top:20%;border-radius:10px;box-shadow: 5px 5px #888888;}
 #d1{border:3px solid gray;width:25%;height:70%;position:absolute; left:60%;top:20%;border-radius:10px;box-shadow: 5px 5px #888888;visibility:hidden;}
 .l{font-weight:900;}
 .l:hover{color:blue;cursor:pointer;text-decoration:underline;}
</style>
<script>
      function verify()
      {
    	  if(document.getElementById("p").value.length==10)
    		  {
    		    document.getElementById("ot").style.visibility="visible";
	    	    document.getElementById("ot").focus();
    		    document.getElementById("p").readOnly=true;
    		//    document.getElementById("p").disabled=true;
    		    sendmessage();
      		  }
    	  else
    		  document.getElementById("p").focus();
      }
      function hide()
      {
    	  document.getElementById("ot").style.visibility="hidden";
      }
      </script>
<script src=js/mobotp.js></script>
<script src=js/logotp.js></script>
<script>
     function formvisible(n)
     {
    	if(n==1)
    		{
    		   document.getElementById("d").style.visibility="hidden";
    		   document.getElementById("d1").style.visibility="visible";
    		}
    	if(n==2)
		{
		   document.getElementById("d1").style.visibility="hidden";
		   document.getElementById("d").style.visibility="visible";
		}
     }
</script>
<script type="text/javascript">
  function logverify()
  {
	  if(document.getElementById("lp").value.length==10)
		  {
		   document.getElementById("lot").style.visibility="visible";
		    document.getElementById("lot").focus();
  		    document.getElementById("lp").readOnly=true;
  		    sendotp();
  		  // document.getElementById("lp").disabled=true;
   		  }
  	    
  }
</script>
</head>
<body>
<h1>Admission Management System</h1><hr color=blue>
<div id=d align=center>
 <h1>Self Registration</h1><hr color=green><br>
 <form action="master"  name=regform method=post> 
 <table width=80% cellspacing=10 class=table>
      <tr><td>Enter Name </td><td>   <input type=text name=n placeholder="Enter Name.." onfocus=hide() required></td></tr>
      <tr><td>Enter Mobile</td><td><input type=text name=m onblur="verify();" placeholder="Verify Mobile number.." id=p onfocus=hide() pattern="[1-9]{1}[0-9]{9}" maxlength="10" required></td></tr>
      <tr><td></td><td ><input type=text name=o id=ot placeholder="Enter OTP" style="visibility:hidden;" required></td></tr> 
      <tr><td>Enter Email</td><td> <input type=email name=e placeholder="Enter Email.." required></td></tr>
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
      <tr><td onclick="formvisible(1)" class=l>Existing User</td><td align=right><input type="submit" value="Register" name=b></td></tr>
      <tr></tr></table>
    </form>
    </div>
    
<div id=d1 align=center class="container">
 <h1>Login</h1><hr color=blue><br>
 <form action="master"  name=logform method=post>
 <table width=80% cellspacing=10 >
      <tr><td>Enter Mobile</td><td><input type=text id=lp name=m onblur="logverify();" placeholder="Verify Mobile number.." id=p onfocus=hide()></td></tr>
      <tr><td></td><td ><input type=text name=o id=lot placeholder="Enter OTP" style="visibility:hidden;"></td></tr> 
      <tr></tr>
      <tr></tr>
      <tr><td colspan=2>
      <div class="g-recaptcha" data-sitekey="6LfhagEcAAAAAJXKE3WO79-M-pOqJG21LZ-gLy5c"></div>
      <td/></tr>
      <tr><td onclick="formvisible(2)" class=l>Register User</td><td align=right><input type="submit" value="Login" name=b></td></tr>
      <tr></tr>
    </form></table>
    </div>
</body>
</html>