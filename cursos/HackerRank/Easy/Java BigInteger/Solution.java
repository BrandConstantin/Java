import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String input1 = sc.next();
        String input2 = sc.next();

        BigInteger bi = new BigInteger(input1);
        BigInteger big = new BigInteger(input2);

        System.out.println(bi.add(big));
        System.out.println(bi.multiply(big));

    }
}
