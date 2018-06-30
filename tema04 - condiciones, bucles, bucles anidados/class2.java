/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema04;

/**
 *
 * @author Vindous
 */
public class class2 {
    public  int countDivisible(int lowerBound, int upperBound){         
        int divisible = lowerBound;
       if(lowerBound <= upperBound){
            for(int i = lowerBound; i < upperBound; i++){
                if(upperBound % i == 0){
                    divisible = i;
                    System.out.println(divisible); 
                }
            }
        } else{
            System.out.println("Error");
        }  
           return divisible; 
    }  
    
    public static void main(String[ ] args) {
        class2 c1 = new class2( );
        c1.countDivisible(3, 9 );
    }
}
