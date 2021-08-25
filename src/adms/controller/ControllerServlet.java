package adms.controller;

import adms.UsPs;
import adms.SendE;
import adms.services.*;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import adms.services.*;
/**
 * Servlet implementation class ControllerServlet
 */
@WebServlet("/master")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String com=request.getParameter("b");
		HttpSession session=request.getSession();
		
		java.io.PrintWriter pw=response.getWriter();
		if(com.equals("Login"))
		{
			String otp=request.getParameter("o");
			String mobile=request.getParameter("m");
				
			String sotp=(String)session.getAttribute("log"+mobile);
			System.out.println(sotp);
			String res[]=sotp.split("_");
			if(otp.equals(res[0]))
			 {
				new LogInfoSave().saveInfo(res[1]);
				request.setAttribute("id",res[1]);
				request.setAttribute("mob", res[2]);
		    	RequestDispatcher rd=request.getRequestDispatcher("appwelcome.jsp");
				rd.forward(request, response);
			 }
			else
				pw.println("Not valid user");
			// get reCAPTCHA request param
			String gRecaptchaResponse = request.getParameter("g-recaptcha-response");
			System.out.println(gRecaptchaResponse);
			//boolean verify = admmgmt.VerifyRecaptcha.verify(gRecaptchaResponse);
		}
		else if(com.equals("Register"))
		{
		String otp=request.getParameter("o");
		String name=request.getParameter("n");
		String email=request.getParameter("e");
		String mobile=request.getParameter("m");
		String course=request.getParameter("c");
		String res=new CheckUser().checkMobile(mobile);
		 String sotp=(String)session.getAttribute(mobile);
		   
		if(sotp!=null)
		  {
		    if(otp.equals(sotp))
		    {
		    	SendE ob=new SendE();
		     ob.sendEm(UsPs.getEmail(), UsPs.getPass(), email, name,sotp, course);
		      pw.println("REgistration complete");
		      int r=new RegdataSave().saveRegData(name, email, mobile, course);
		       if(r==1)
		    	   response.sendRedirect("index.jsp");
		    }
		   // get reCAPTCHA request param
		   String gRecaptchaResponse = request.getParameter("g-recaptcha-response");
		   System.out.println(gRecaptchaResponse);
            
		  }
				
		}
		
	}

}
