package Student;

public class Student {
	private int studentId;
	private String name;
	private String ssn;
	private double gpa;
	public final int SCHCODE = 323435;
	public Student(int x, String n, String s, double g) {
		studentId = x;
		name = n;
		ssn = s;
		gpa = g;
	}
	
	public Student() {}
	
	public int getStudentId(){
		return studentId;
	}
	
	public void setStudentId(int studentId) {
		studentId = studentId;
	}
	
	// getters
	public String getName() {
		return name;
	}

	public String getSsn() {
		return ssn;
	}

	public double getGpa() {
		return gpa;
	}

	public int getSCHCODE() {
		return SCHCODE;
	}

	//setters
	public void setName(String name) {
		this.name = name;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}	
	
	public String toString() {
		String s1 = "";
		String s2 = "";
		
		s1 = "Student Id: " + getStudentId() + 
				"\nStudent Name: " + getName() + 
				"\nStudent SSN: " + getSsn() + 
				"\nStudent GPA: " + getGpa();
		
		s2 = "Student Id: " + getStudentId() + 
				"Student Name: " + getName() + 
				"Student SSN: " + getSsn() + 
				"Student GPA: " + getGpa();
		return s1;
	}
}
