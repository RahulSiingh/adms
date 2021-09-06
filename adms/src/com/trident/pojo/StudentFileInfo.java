package com.trident.pojo;

public class StudentFileInfo {
	private int studentId;
	private String tenthFileName;
	private String plus2FileName;
	private String diplomaFileNmae;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getTenthFileName() {
		return tenthFileName;
	}

	public void setTenthFileName(String tenthFileName) {
		this.tenthFileName = tenthFileName;
	}

	public String getPlus2FileName() {
		return plus2FileName;
	}

	public void setPlus2FileName(String plus2FileName) {
		this.plus2FileName = plus2FileName;
	}

	public String getDiplomaFileNmae() {
		return diplomaFileNmae;
	}

	public void setDiplomaFileNmae(String diplomaFileNmae) {
		this.diplomaFileNmae = diplomaFileNmae;
	}

	@Override
	public String toString() {
		return "StudentFileInfo [studentId=" + studentId + ", tenthFileName="
				+ tenthFileName + ", plus2FileName=" + plus2FileName
				+ ", diplomaFileNmae=" + diplomaFileNmae + "]";
	}
	
	

}
