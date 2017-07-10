package practice_07;

public class Practice_02 {
	public static void main(String[] args){	
		//double myArray[][] = new double [10][3];
		
		String myArray[][] = {
				{"a", "Alexandria", "1"},
				{"b", "Barcelona", "7"},
				{"c", "Constanta", "2"},
				{"d", "Dublin", "4"},
				{"e", "Everston", "1"},
				{"f", "Florencia", "5"},
				{"g", "Glesgow", "2"},
				{"h", "Hong Kong", "9"},
				{"i", "Irbun", "1"},
				{"j", "Jakarta", "6"},
		};
		
		for(int i = 0; i < myArray.length; i++) {
			//for(int j = 0; j < myArray.length; j++) {
				//for(int k = 0; k < myArray[i][j].length(); k++) {
					System.out.print(myArray[i][0] + ". " + myArray[i][1] + " " + myArray[i][2]);
				//}
			//}
			
			System.out.println(" ");
		}
	}
}
