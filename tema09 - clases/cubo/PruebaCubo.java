/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cubo;

/**
 *
 * @author BrinCo
 */
public class PruebaCubo {
    public static void main(String[] args){
        Cubo cubo1 = new Cubo(2);
        Cubo cubo2 = new Cubo(3);
        Cubo cubo3 = new Cubo(4);
        
        System.out.println("Pintar los cubos");
        System.out.println("--------------------------");
        cubo1.pinta();
        System.out.println("");
        cubo2.pinta();
        System.out.println("");
        cubo3.pinta();
        
        System.out.println("Llenar 2 de los cubos");
        System.out.println("----------------------------");
        cubo1.llena();
        cubo1.pinta();
        System.out.println("");
        cubo2.llena();
        cubo2.pinta();
        System.out.println("");
        cubo3.pinta();
        System.out.println("");
        
        //vaciar el cubo1 en cubo3
        System.out.println("--------------------------------");
        cubo1.vuelca(cubo3);
        cubo1.pinta();
        System.out.println("");
        cubo2.pinta();
        System.out.println("");
        cubo3.pinta();
    }    
}
