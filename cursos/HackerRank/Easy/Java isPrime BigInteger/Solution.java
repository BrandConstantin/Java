import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();

        scanner.close();

        // create BigInteger objects
        BigInteger bi1;

        // create Boolean objects
        Boolean result;

        // assign values to bi1
        bi1 = new BigInteger(n);

        // perform isProbablePrime on bi1
        result = bi1.isProbablePrime(1);

        if(result){                
            System.out.print("prime");
        }else{
            System.out.print("not prime");
        }
    }
}
