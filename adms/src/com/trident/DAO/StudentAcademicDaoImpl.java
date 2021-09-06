package com.trident.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;






import com.trident.commonConnection.CommonConnection;
import com.trident.pojo.StudentAcademicDetails;
import com.trident.pojo.StudentFileInfo;

public class StudentAcademicDaoImpl implements StudentAcademicDao{
	
	@Override
	public void save(StudentAcademicDetails s) {
		Connection connection = CommonConnection.getConnection();
		System.out.println(connection);
		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement("insert into departments values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			stmt.setInt(1, s.getStudentId());
			stmt.setString(2, s.getExamType());
			stmt.setDouble(3,s.getExamRank());
			stmt.setLong(4, s.getApplicationNumber());
			stmt.setString(5, s.getChoice1());
			stmt.setString(6, s.getChoice2());
			stmt.setString(7, s.getChoice3());
			stmt.setDouble(8, s.getTenthMark());
			stmt.setInt(9, s.getTenthPassingYear());
			stmt.setDouble(10, s.getPlus2mark());
			stmt.setInt(11, s.getPlus2passingYear());
			stmt.setDouble(14, s.getDiplomaMark());
			stmt.setInt(15, s.getDiplomaPassingYear());
			//transfer to DB
			int i = stmt.executeUpdate();
			System.out.println(i + " records inserted");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		
	}

	@Override
	public void save(StudentFileInfo s) {
		Connection connection = CommonConnection.getConnection();
		System.out.println(connection);
		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement("update studentAcademicDetails set tenthFile=?,plus2file=?,diplomaFile=?  where studentid=?");
			stmt.setInt(1, s.getStudentId());
			stmt.setString(12, s.getTenthFileName());
    		stmt.setString(13, s.getPlus2FileName());
			stmt.setString(16, s.getDiplomaFileNmae());
			//transfer to DB
			int i = stmt.executeUpdate();
			System.out.println(i + " records inserted");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		

		
	}

}
