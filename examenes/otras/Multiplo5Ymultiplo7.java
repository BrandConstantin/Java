/*
 * Escribe un programa que rellene y muestre un array de 20 elementos con números enteros
comprendidos entre 0 y 400 (ambos incluidos). A continuación el programa mostrará el array dos
veces más. Primero debe resaltar los múltiplos de 5 entre corchetes y luego los múltiplos de 7 entre
paréntesis.
 */
package repesca_2016;

/**
 *
 * @author BrinCo
 */
public class Multiplo5Ymultiplo7 {
    public static void main(String[] args) {
        
        int array [] = new int [20];
        
        System.out.println("ARRAY ORIGINAL\n***************");
        for(int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random() * 401);
            System.out.print(array[i] + "|");
        }
        System.out.println();
        
        System.out.println("MULTIPLOS DE 5\n*****************");
        for(int i = 0; i < array.length; i++){
            if((array[i] % 5) == 0){
                System.out.print("[" + array[i] + "]|");
            }else{
                System.out.print(array[i] + "|");
            }
        }
        System.out.println();
        
        System.out.println("MULTIPLOS DE 7\n*****************");
        for(int i = 0; i < array.length; i++){
            if((array[i] % 7) == 0){
                System.out.print("(" + array[i] + ")|");
            }else{
                System.out.print(array[i] + "|");
            }
        }
        
    }
}
