/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fraccion;

/**
 *
 * @author BrinCo
 */
public class PruebaFraccion {
    public static void main(String[] args){
        Fraccion f1 = new Fraccion(-7, 9);
        System.out.println(f1 + " X 5 = " + f1.multiplica(7));
        System.out.println(f1 + " ^ - 1 = " + f1.invierte());
        System.out.println("--------------------------------");
        
        Fraccion f2 = new Fraccion(4, 8);
        System.out.println(f1 + " X " + f2 + " = " + f1.multiplica(f2));
        System.out.println(f1 + " : " + f2 + " = " + f1.divide(f2));
        System.out.println("----------------------------------");
        
        Fraccion f3 = new Fraccion(466, -463);
        System.out.println(f3 + " = " + f3.simplificada());
    }
}
