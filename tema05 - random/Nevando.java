/*
 * Haz un programa que imite la nieve cayendo
 */
package tema05;

/**
 *
 * @author BrandConstantin
 */
public class Nevando {
    public static void main(String[] args){
        
        int i;
        int l;
        int nieve = ((int)(Math.random() * 50000));
        
        for (i = 0; i <= nieve; i++){
            System.out.print("*");   
            
            int  espacio = ((int)(Math.random() * 10));
            
            for (l = 0; l <= espacio; l++){

               System.out.print("  ");
            }
        }
    }    
}
