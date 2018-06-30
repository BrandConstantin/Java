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
import java.util.Scanner;

public class class1
{
        private int a;

        public class1() {
            a = 2;
        }
        
        public class1(int p) {
            a = p;
        }
        
        public void fun( ) {
            System.out.println(a);
        }
        
        public void fun(int p, int q) {
            q = p / a;
            System.out.println(a + p + q);
        }
        
        public void fun(int p, double q) {
            q = a / p;
            System.out.println(a + p - q);
        }
        
        public static void main(String[ ] args) {
           class1 c1 = new class1( 5 );
            c1.fun(1, 10.0 );
        }
}