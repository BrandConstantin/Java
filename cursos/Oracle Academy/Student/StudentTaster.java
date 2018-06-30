package Student;

public class StudentTaster{
	public static void main(String[] args) {
		Student s1 = new Student(124, "Mary Smith", "998-234-234", 2.1);
		System.out.println(s1);
		System.out.println("-----------");
		
		Student s2 = new Student();
		s2.setStudentId(234);
		s2.setName("Jony Deeper");
		s2.setSsn("543-565-7665");
		s2.setGpa(6.9);
		System.out.println(s2);
		
		System.out.println("-----------");
		Student s3 = new Student();
		System.out.println(s3);
	}
}
