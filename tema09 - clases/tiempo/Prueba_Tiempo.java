/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiempo;

/**
 *
 * @author BrinCo
 */
public class Prueba_Tiempo {
    public static void main(String[] args){
        Tiempo t1 = new Tiempo(2, 49, 42);
        Tiempo t2 = new Tiempo(5, 5, 8);
        Tiempo t3 = new Tiempo(0, 23, 7);
        
        System.out.println(t1 + " + " + t2 + " = " + t1.suma(t2));
        System.out.println(t2 + " - " + t3 + " = " + t2.resta(t3));
        System.out.println(t1 + " - " + t3 + " = " + t1.resta(t3));
        System.out.println(t2 + " + " + t3 + " = " + t2.suma(t3));
    }
}
