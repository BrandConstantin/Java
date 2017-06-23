/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema01;

/**
 *
 * @author BrandConstantin
 */
public class salidaFormateada {
    public static void main(String[] args){
        //número sin decimales
        System.out.printf("Este número %d no tiene decimales\n", 21);
        //número con decimales
        System.out.printf("Este número %f tiene decimales\n", 21.0);
        //número con 2 decimales
        System.out.printf("Este número %.2f tiene 2 decimales\n", 21.0);
        //número con 3 decimales
        System.out.printf("Este número %.3f tiene 3 decimales", 21.0);
    }
}
