package com.trident.DAO;

import com.trident.pojo.StudentAcademicDetails;
import com.trident.pojo.StudentFileInfo;



public interface StudentAcademicDao {
	void save(StudentAcademicDetails s);
	void save(StudentFileInfo s);
}
