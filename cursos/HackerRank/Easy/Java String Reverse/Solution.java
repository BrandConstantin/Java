import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String original=sc.next();

        /* Enter your code here. Print output to STDOUT. */
        String reverse = "";
        int leng = original.length();  

        for (int i = leng - 1; i >= 0; i-- ){
            reverse = reverse + original.charAt(i);  
        } 

        if (original.equals(reverse)){  
            System.out.println("Yes");  
        }else{
            System.out.println("No");   
        }
    }
}