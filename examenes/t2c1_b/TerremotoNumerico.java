/*
 * Escribe el programa terremoto numÃ©rico. En primer lugar, el programa debe generar y mostrar por
pantalla un array de 5 filas por 10 columnas con nÃºmeros aleatorios entre 10 y 99. A continuaciÃ³n se le
preguntarÃ¡ al usuario cÃ³mo serÃ¡ el terremoto: horizontal o vertical. Si el terremoto es horizontal, los
nÃºmeros de la primera fila se desplazan hacia la derecha, los de la segunda fila hacia la izquierda, los
de la tercera fila hacia la derecha, etc. Los nÃºmeros que salen por la derecha o por la izquierda entran
por el lado contrario. Si el terremoto es vertical, los nÃºmeros de la primera columna se desplazan
hacia arriba, los de la segunda columna hacia abajo, los de la tercera hacia arriba, etc. Los nÃºmeros
que salen por arriba o por abajo, entran por el lado contrario.

 */
package t2c1_b;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class TerremotoNumerico {
    public static void main(String[] args) {
        Scanner t = new Scanner (System.in);
        System.out.println("TERREMOTO NÚMERICO");
        System.out.println("-----------------------------------------------------------------------------");
        
        int i;
        int j;
        int[][] array = new int[5][10];
        
        for(i = 0; i < 5; i++) {
            for(j = 0; j < 10; j++) {
                array[i][j] = (int)(Math.random() * 90) + 10;
                System.out.printf("%5d", array[i][j]);
            }
            System.out.println();
        }
        
        System.out.println("-----------------------------------------");
        
        //preguntar al usuario si quiere un terremoto vertical o horizontal
        System.out.println("Indica si quieres un terremoto 'vertical' o 'horizontal'");
        String respuesta = t.nextLine();
        
        if(respuesta.equals("vertical")){
            //rota verticalmente
            i = 0;
            for(j = 0; j < 10; j++){
                if((j % 2) == 0){
                    int aux = array[0][i];
                    for(int k = 0; k < 4; k++){
                        array[k][i] = array[k + 1][i];
                    }
                    
                    array[4][i] = aux;
                }else{
                    int aux = array[4][i];
                    for (int k = 4; k > 0; k--) {
                        array[k][i] = array[k - 1][i];
                    }
                    
                    array[0][i] = aux;
                }
                
                i++;
            }
        }else if(respuesta.equals("horizontal")){
            //rota linea horizontalmente
            int k = 0; 
            for(j = 0; j < 5; j++) {
                if((j % 2) == 0) {
                    int aux = array[k][9];
                    for (i = 9; i > 0; i--) {
                        array[k][i] = array[k][i - 1];
                    }
                    
                    array[k][0] = aux;
                } else {
                    int aux = array[k][0];
                    for (i = 0; i < 9; i++) {
                        array[k][i] = array[k][i + 1];
                    }
                    array[k][9] = aux;
                }
                k++;
            }
        }else{
            System.out.println("Opción incorrecta!");
        }
        
        //resultado
        System.out.println("------------------------------------------");
        for(i = 0; i < 5; i++) {
            for(j = 0; j < 10; j++) {
                System.out.printf("%5d", array[i][j]);
            }
            System.out.println();
        }
    }    
}
