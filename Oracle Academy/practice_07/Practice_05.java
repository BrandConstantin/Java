package practice_07;

public class Practice_05 {
	public static void main(String[] args){	
		int[][] num = {{3,3,3},{2,2,2}};
		int[] array = {4,3,2};
		
		for(int i = 0; i < 3; i++){
			num[1][i] = num[0][i]+array[i];
		}
		
		for(int i = 0; i < 2; i++){
			for(int j = 0; j < 3; j++){
				System.out.print(num[i][j]);
			}
			
			System.out.println();
		}
	}
}
