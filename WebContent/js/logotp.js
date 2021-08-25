/**
 * 
 */
var request;
     function sendotp()
     {
    	 var mob=document.logform.m.value;
    	 alert("Check otp in "+mob);
    	 var url="logotp.jsp?m="+mob;  
    	  
    	    if(window.XMLHttpRequest){  
    	     request=new XMLHttpRequest();  
    	    }  
    	    else if(window.ActiveXObject){  
    	    request=new ActiveXObject("Microsoft.XMLHTTP");  
    	    }  
    	  
    	   try{  
    	    request.onreadystatechange=function(){  
    	    if(request.readyState==4){  
    	    var val=request.responseText;
    	 
    	     document.getElementById('res').innerHTML=val; 
    	     
    	    }  
    	    }//end of function  
    	     request.open("GET",url,true);  
    	     request.send();  
    	     }catch(e){alert("Unable to connect to server");}
     }
