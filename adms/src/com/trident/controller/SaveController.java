package com.trident.controller;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;





import com.trident.pojo.StudentAcademicDetails;
import com.trident.service.StudentAcademyServiceImpl;


/**
 * Servlet implementation class SaveController
 */
@WebServlet("/xyz")
public class SaveController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	StudentAcademyServiceImpl stdentService=new StudentAcademyServiceImpl();
	
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		
    		response.setContentType("text/html");
    		PrintWriter out = response.getWriter();
    		
    		//out.write("</body></html>");

    		
    		
    		
    		String examType=request.getParameter("exam");
    		double examRank=Double.parseDouble(request.getParameter("rank"));
    		long applicationNumber=Long.parseLong(request.getParameter("appNo"));
    		String choice1=request.getParameter("choice1");
            String choice2=request.getParameter("choice2");
            String choice3=request.getParameter("choice3");
            double tenthMark=Double.parseDouble(request.getParameter("tenthMark"));
            int tenthPassingYear=Integer.parseInt(request.getParameter("tenthYear"));
            double plus2mark=Double.parseDouble(request.getParameter("plus2mark"));
            int plus2passingYear=Integer.parseInt(request.getParameter("plus2Year"));
            
            double diplomaMark=Double.parseDouble(request.getParameter("diplomaMark"));
            int diplomaPassingYear=Integer.parseInt(request.getParameter("diplomaYear"));
           
    		
    		StudentAcademicDetails student=new StudentAcademicDetails();
    		student.setApplicationNumber(applicationNumber);
    		student.setChoice1(choice1);
    		student.setChoice2(choice2);
    		student.setChoice3(choice3);
    		student.setDiplomaMark(diplomaMark);
    		student.setDiplomaPassingYear(diplomaPassingYear);
    		student.setExamRank(examRank);
    		student.setExamType(examType);
    		student.setPlus2mark(plus2mark);
    		student.setPlus2passingYear(plus2passingYear);
    		student.setTenthMark(tenthMark);
    		student.setTenthPassingYear(tenthPassingYear);
    		System.out.println(student);
    		
    		
    		//transfer to service
    		
    		//stdentService.save(student);
    		out.write(" <a href=upload.html >"+"upload document!"+"</a>");
    		
    	
	
    		
    	}

}
