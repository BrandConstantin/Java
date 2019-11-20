import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner fileReader=new Scanner(System.in);
        int counter = 0;

        while (fileReader.hasNextLine()){
            String line = fileReader.nextLine();
            counter++;
            System.out.println(counter + " " + line);
        }
    }
}