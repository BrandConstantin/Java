import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();

        try {
        // the String to int conversion happens here
        int i = Integer.parseInt(S.trim());

        // print out the value after the conversion
        System.out.println(i);
        } catch (NumberFormatException nfe) {
            //System.out.println("NumberFormatException: " + nfe.getMessage());
            System.out.println("Bad String");
        }
    }
}

