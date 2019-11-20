import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        System.out.println(A.length()+B.length());

        // comparing str1 and str2
        int retval = A.compareTo(B);
        // prints the return value of the comparison
        if (retval > 0) {
            System.out.println("Yes");
        } else if (retval <= 0){
            System.out.println("No");
        } 

        String outputA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String outputB = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(outputA + " " + outputB);
    }
}