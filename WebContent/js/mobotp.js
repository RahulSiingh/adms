/**
 * 
 */
var request;
     function sendmessage()
     {
    	 var mob=document.regform.m.value;
    	 var nm=document.regform.n.value;
    	 
    	 alert("Check your OTP in "+mob);
    	 var url="sendotp.jsp?m="+mob+"&n="+nm;  
    	  
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
