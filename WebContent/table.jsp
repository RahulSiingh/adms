<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script>
     var request;
     function sendInfo()
     {
    	  var v=document.vinform.t1.value;
    	  var url="ptable.jsp?val="+v;
    	  if(window.XMLHttpRequest)
    		  {
    		    request=new XMLHttpRequest();
    		  }
    	  else if(window.ActiveXObject)
    		  {
    		   request=new ActiveXObject("Microsoft.XMLHttp");
    		  }
    	  try
    	  {
    		  request.onreadyStateChange=getInfo;
    		  request.open("GET",url,true);
    		  request.send();
    	  }
    	  catch(e)
    	  {
    		  alert("unable to connect");
    	  }
     }
     function getInfo()
     {
    	 if(reqest.readyState==4)
    		 {
    		  var val=request.responseText;
    		  document.getElementById("res").innerHTML=val;
    		 }
     }
</script>
</head>
<body>
<h1>Table using Ajax</h1><hr>
<form name=vinform>
 <input type=text name=t1><br>
 <input type=button value=showtable onclick="sendInfo()">
</form>
<span id=res></span>
</body>
</html>