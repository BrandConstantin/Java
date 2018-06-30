package StringOperator;

public class StringOperator {
	public static void main(String[] args) {
		String string1 = "Hola";
		String string2 = "Mimi";
		String string3 = " ";
		
		System.out.println("Que tal estas ".concat(string2));
		System.out.println("string3 = " + string3);
		System.out.println("Length string3 = " + string3.length());
		System.out.println("Substring = " + string1.substring(0, 2));
		System.out.println("Upper Case = " + string2.toUpperCase());
		
		String s1 = "Hola Mundo!";
		String s2 = "Que tal estas?";
		System.out.println(s1.compareTo(s2));
		
		String s3 = "Olee ese cantante!";
		String s4 = "OLEE ESE CANTANTE!";
		System.out.println(s3.equals(s4));
		
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
		
		System.out.println(s3.substring(5));
		System.out.println(s4.substring(5, 18));
		System.out.println(s3.charAt(5)); //muestra el cáracter 5
		System.out.println(s3.indexOf("ese")); //muestra la posición de los carácteres indicados
	}
}
