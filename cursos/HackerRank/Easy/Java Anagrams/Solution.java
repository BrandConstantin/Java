import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
// Remove all the white space
        a = a.replaceAll("\\s", "");
        b = b.replaceAll("\\s", "");
        
        // Check if both length matches
        if(a.length() != b.length()){
            return false;
        } else {
            // Convert both Strings into lower case and into Character Array
            char[] arr1 = a.toLowerCase().toCharArray();
            char[] arr2 = b.toLowerCase().toCharArray();
            
            // Sort both Character Array
            java.util.Arrays.sort(arr1);
            java.util.Arrays.sort(arr2);
            
            // Check if both arrays are equal
            return (java.util.Arrays.equals(arr1, arr2));
        }
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
