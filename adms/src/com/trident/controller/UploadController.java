package com.trident.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.trident.pojo.StudentAcademicDetails;
import com.trident.pojo.StudentFileInfo;
import com.trident.service.StudentAcademyServiceImpl;


@WebServlet("/UploadController")
public class UploadController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private ServletFileUpload uploader = null;
	StudentAcademyServiceImpl stdentService=new StudentAcademyServiceImpl();
	@Override
	public void init() throws ServletException{
		DiskFileItemFactory fileFactory = new DiskFileItemFactory();
		File filesDir = (File) getServletContext().getAttribute("FILES_DIR_FILE");
		fileFactory.setRepository(filesDir);
		this.uploader = new ServletFileUpload(fileFactory);
	}
	
    
   		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
   			response.setContentType("text/html");
    		PrintWriter out = response.getWriter();
    		
    		out.write("</body></html>");
            
    		if(!ServletFileUpload.isMultipartContent(request)){
    			throw new ServletException("Content type is not multipart/form-data");
    		}
    		
    		
    		try {
    			List<FileItem> fileItemsList = uploader.parseRequest(request);
    			for (FileItem fileItem : fileItemsList) {
					
				}
    			Iterator<FileItem> fileItemsIterator = fileItemsList.iterator();
    			while(fileItemsIterator.hasNext()){
    				FileItem fileItem = fileItemsIterator.next();
    				System.out.println("FieldName="+fileItem.getFieldName());
    				System.out.println("FileName="+fileItem.getName());
    				System.out.println("ContentType="+fileItem.getContentType());
    				System.out.println("Size in bytes="+fileItem.getSize());
    				//fileItem.
    				File file = new File(request.getServletContext().getAttribute("FILES_DIR")+File.separator+fileItem.getName());
    				System.out.println("Absolute Path at server="+file.getAbsolutePath());
    				/*try{
    				fileItem.write(file);
    				out.write("File "+fileItem.getName()+ " uploaded successfully.");
    				}catch(Exception e)
    				{
    					System.out.println("some problem");
    				}
    				*//*out.write("<br>");
    				out.write("<a href=\"UploadDownloadFileServlet?fileName="+fileItem.getName()+"\">Download "+fileItem.getName()+"</a>");*/
    			}
    		} catch (FileUploadException e) {
    			out.write("Exception in uploading file.");
    		} catch (Exception e) {
    			out.write("Exception in uploading file.");
    		}
    		out.write("upload successfully");
    		StudentFileInfo s=new StudentFileInfo();
    		s.setTenthFileName("gfhgf");
    		s.setPlus2FileName("hgf");
    		s.setDiplomaFileNmae("gfdgd");
    		//stdentService.save(s);
   		
   		
   		
   		}	
		}
			
			
		

	


