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
public class Piramide_VerticeIzquierda {
    public static void main(String[] args){
        int altura = 6;
        String caracter = "#";
        int espacios = altura;
        int astericos = 0;

        //la parte de arriba
        for(int i = 0; i <= altura; i++){     
            for(int j = 0; j < astericos; j++){
                System.out.print(caracter);
            }

            System.out.println("");
            astericos++;

            for(int j = altura; j > astericos; j--){
                System.out.print(" ");
            }  
        }
        
        //la parte de abajo                  
        for(int i = 0; i <= altura; i++){     
            for(int j = 1; j < astericos; j++){
                System.out.print(caracter);
            }

            System.out.println("");
            astericos--;

            for(int j = altura; j >= astericos; j--){
                System.out.print(" ");
            }  
        }           
    } 
}
