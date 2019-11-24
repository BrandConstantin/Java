import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        java.util.ArrayList<String> words = new java.util.ArrayList<>();
        //for cada char.length
        for(int i = 0; i <= s.length() - k; i++){
            words.add(s.substring(i, i + k));
        }
        //System.out.println(words);
        smallest = words.get(0);
        largest = words.get(words.size() - 1);
        return largest + "\n" + smallest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}