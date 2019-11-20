import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        
        int lengthString = S.length();

        if(lengthString >= 1 || lengthString <= 100){
            String newString = S.substring(start, end);

            System.out.println(newString);
        }
        
    }
}