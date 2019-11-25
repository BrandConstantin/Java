import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        smallest = s.substring(0, k);  
        largest = s.substring(0, k);        
        String temp = "";

        for(int i = 0 ; i < s.length() - k + 1 ; i++){
            temp = s.substring(i, i + k);
            if(smallest.compareTo(temp) > 0){
               smallest = temp; 
            } 
            if(largest.compareTo(temp) < 0){
                largest = temp;
            } 
        }

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}