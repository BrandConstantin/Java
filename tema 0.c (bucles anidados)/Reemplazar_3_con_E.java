/*
 * Reemplazar 3 con E en un contenedor de 5 digitos
 */
package tema.pkg0.c.bucles.anidados;

/**
 *
 * @author BrinCo
 */
public class Reemplazar_3_con_E {
    public static void main(String[] args) {
        
        System.out.println("Reemplazar 3 con E");
        System.out.println("==================================");
        
        for(int i = 0; i <= 9; i++){
            for(int j = 0; j <= 9; j++){
                for(int k = 0; k <= 9; k++){
                    for(int l = 0; l <= 9; l++){
                        for(int m = 0; m <= 9; m++){
                            if(i == 3){
                                System.out.println("E");
                            }else{
                                System.out.println(i);
                            }
                            
                            if(j == 3){
                                System.out.println("E");
                            }else{
                                System.out.println(j);
                            }
                            
                            if(k == 3){
                                System.out.println("E");
                            }else{
                                System.out.println(k);
                            }
                            
                            if(l == 3){
                                System.out.println("E");
                            }else{
                                System.out.println(l);
                            }
                            
                            if(m == 3){
                                System.out.println("E");
                            }else{
                                System.out.println(m);
                            }
                            
                            System.out.println(" ");
                        }
                    }
                }
            }
        }
    }
}
