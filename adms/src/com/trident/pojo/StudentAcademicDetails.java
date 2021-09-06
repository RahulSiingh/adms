package com.trident.pojo;

public class StudentAcademicDetails {
	private int studentId;
	private String examType;
	private Double examRank;
	private long applicationNumber;
	private String choice1;
	private String choice2;
	private String choice3;
	private double tenthMark;
	private int tenthPassingYear;
	private double plus2mark;
	private int plus2passingYear;
	private double diplomaMark;
	private int diplomaPassingYear;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getExamType() {
		return examType;
	}

	public void setExamType(String examType) {
		this.examType = examType;
	}

	public Double getExamRank() {
		return examRank;
	}

	public void setExamRank(Double examRank) {
		this.examRank = examRank;
	}

	public long getApplicationNumber() {
		return applicationNumber;
	}

	public void setApplicationNumber(long applicationNumber) {
		this.applicationNumber = applicationNumber;
	}

	public String getChoice1() {
		return choice1;
	}

	public void setChoice1(String choice1) {
		this.choice1 = choice1;
	}

	public String getChoice2() {
		return choice2;
	}

	public void setChoice2(String choice2) {
		this.choice2 = choice2;
	}

	public String getChoice3() {
		return choice3;
	}

	public void setChoice3(String choice3) {
		this.choice3 = choice3;
	}

	public double getTenthMark() {
		return tenthMark;
	}

	public void setTenthMark(double tenthMark) {
		this.tenthMark = tenthMark;
	}

	public int getTenthPassingYear() {
		return tenthPassingYear;
	}

	public void setTenthPassingYear(int tenthPassingYear) {
		this.tenthPassingYear = tenthPassingYear;
	}

	public double getPlus2mark() {
		return plus2mark;
	}

	public void setPlus2mark(double plus2mark) {
		this.plus2mark = plus2mark;
	}

	public int getPlus2passingYear() {
		return plus2passingYear;
	}

	public void setPlus2passingYear(int plus2passingYear) {
		this.plus2passingYear = plus2passingYear;
	}

	public double getDiplomaMark() {
		return diplomaMark;
	}

	public void setDiplomaMark(double diplomaMark) {
		this.diplomaMark = diplomaMark;
	}

	public int getDiplomaPassingYear() {
		return diplomaPassingYear;
	}

	public void setDiplomaPassingYear(int diplomaPassingYear) {
		this.diplomaPassingYear = diplomaPassingYear;
	}

	@Override
	public String toString() {
		return "StudentAcademicDetails [studentId=" + studentId + ", examType="
				+ examType + ", examRank=" + examRank + ", applicationNumber="
				+ applicationNumber + ", choice1=" + choice1 + ", choice2="
				+ choice2 + ", choice3=" + choice3 + ", tenthMark=" + tenthMark
				+ ", tenthPassingYear=" + tenthPassingYear + ", plus2mark="
				+ plus2mark + ", plus2passingYear=" + plus2passingYear
				+ ", diplomaMark=" + diplomaMark + ", diplomaPassingYear="
				+ diplomaPassingYear + "]";
	}

}
