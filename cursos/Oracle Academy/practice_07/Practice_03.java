package practice_07;

import java.util.Scanner;

public class Practice_03 {
	public static void main(String[] args){	
		Scanner in = new Scanner(System.in);
		
		long myArray[][] = new long [4][3];
		
		for(int i = 0; i < myArray.length; i++) {
			for(int j = 0; j < myArray.length; j++) {
				myArray[i][j] = in.nextInt(5);
			}			
		}
	}
}
