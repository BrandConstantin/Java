package practice_06;

import java.util.Scanner;

public class Practice_01 {
	public static void main(String[] args){	
		Scanner r = new Scanner(System.in);
		
		int totalNum = 0;
		boolean numCoincide = true;
		int num = 0;
		
		/*System.out.println("Introduce un número: ");
		num = r.nextInt();*/
		
		do {
			if(num == 1 || num == 2 || num == 3 || num == 4
					|| num == 5 || num == 6 || num ==7) {
				
				numCoincide = true;				
			}else {
				numCoincide = false;
				
				//System.out.println("Número no coincidente con la BD del Morse!");
				
				do {
					System.out.println("Introduce un número: ");
					num = r.nextInt();
										
					numCoincide = true;
					switch(num) {
						case 1: 
							System.out.println("D");
							break;
						case 2: 
							System.out.println("W");
							break;
						case 3: 
							System.out.println("E");
							break;
						case 4: 
							System.out.println("L");
							break;
						case 5:
							System.out.println("H");
							break;
						case 6: 
							System.out.println("O");
							break;
						case 7:
							System.out.println("R");
							break;
					}
				}while(totalNum <= 10);	
			}
		}while(numCoincide);
	}
}
