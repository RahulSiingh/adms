package com.trident.service;

import com.trident.DAO.StudentAcademicDaoImpl;
import com.trident.pojo.StudentAcademicDetails;
import com.trident.pojo.StudentFileInfo;

public class StudentAcademyServiceImpl implements StudentAcademicService{

	StudentAcademicDaoImpl studentDao=new StudentAcademicDaoImpl();
	public void save(StudentAcademicDetails s1) {
		//transfer to DAO
		studentDao.save(s1);
		
	}
	@Override
	public void save(StudentFileInfo s) {
		// TODO Auto-generated method stub
		studentDao.save(s);
	}
         
}
