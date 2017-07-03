package StudyPage;
import java.util.Scanner;

public class StudyPage {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		
		System.out.println("Introduce el número de galones: ");
		double galones = t.nextDouble();
		
		double litros = galones * 3.785;
		
		System.out.println("Los " + galones + " transformado en litros son " + litros);
	}
}
