import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.      
        Locale INDIA = new Locale("en", "IN");  
        Locale US = Locale.US;  
        Locale CHINA = Locale.CHINA;  
        Locale FRANCE = Locale.FRANCE;  

        NumberFormat formatterUs = NumberFormat.getCurrencyInstance(US);
        NumberFormat formatterIndia = NumberFormat.getCurrencyInstance(INDIA);
        NumberFormat formatterChina = NumberFormat.getCurrencyInstance(CHINA);
        NumberFormat formatterFrance = NumberFormat.getCurrencyInstance(FRANCE);

        String us = formatterUs.format(payment);
        String en = formatterIndia.format(payment);
        String china = formatterChina.format(payment); 
        String france = formatterFrance.format(payment);

        if(payment > 0 || payment <= (10^9)){
            System.out.println("US: " + us);
            System.out.println("India: " + en);
            System.out.println("China: " + china);
            System.out.println("France: " + france);
        }else{
            payment = scanner.nextDouble();
            scanner.close();
        }
    }
}