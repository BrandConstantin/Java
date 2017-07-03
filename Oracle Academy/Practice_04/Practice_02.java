package Practice_04;

public class Practice_02 {
	public static void main(String[] args) {
		String s1 = "ABC";
		String s2 = new String("DEF");
		String s3 = "AB" + "C";
		boolean bool = true;
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.equals(s3));
		if(s3 == s1) {
			bool = true;
			System.out.println(bool);
		}else {
			bool = false;
			System.out.println(bool);
		}
		System.out.println(s2.compareTo(s3));
		System.out.println(s3.equals(s1));
	}
}
