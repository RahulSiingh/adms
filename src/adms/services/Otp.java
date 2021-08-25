package adms.services;
import java.util.*;
public class Otp {
	private String otp;
     public String getOtp()
     {
    	 ArrayList <String>list=new ArrayList();
    	 for(int i=0;i<=9;i++)
    		 list.add(i+"");
    	 Collections.shuffle(list);
    	 otp=list.get(0)+list.get(1)+list.get(2)+list.get(3)+list.get(4); 
    	 
    	 return otp;
     }
}
