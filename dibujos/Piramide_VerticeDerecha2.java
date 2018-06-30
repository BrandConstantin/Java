/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujos;

/**
 *
 * @author BrandConstantin
 */
public class Piramide_VerticeDerecha2 {
    public static void main(String[] args){
        int altura = 10;
        String caracter = "#";
        int espacios = altura;
        int astericos = 0;
        
        //la parte de arriba
        for(int i = 0; i <= espacios / 2; i++){               
            for(int j = 0; j < astericos; j++){
                System.out.print(caracter);
            }

            for(int k = 0; k < altura; k++){
                System.out.print("");
            }
            System.out.println("");
            astericos++;
        }   
        
        //la parte de abajo
        for(int i = 0; i <= espacios / 2; i++){                                     
            for(int j = 0; j < astericos - 2; j++){
                System.out.print(caracter);
            }

            for(int k = 0; k < altura; k++){
                System.out.print("");
            }
            System.out.println("");
            astericos--; 
        }
    }    
}
