/*
 * Realiza un programa que genere y muestre por pantalla un array de 5 filas por 8 columnas con
números aleatorios entre 100 y 200. A continuación se deben calcular tanto el máximo como el mínimo
y se deben mostrar las filas donde aparecen éstos. Si el máximo o el mínimo se repiten, son válidas
cualquiera de las filas donde aparecen.
 */
package repesca_2016;

/**
 *
 * @author BrinCo
 */
public class FilasMaximoYminimo {
    public static void main(String[] args) {
    
        int[][] a = new int[5][8];
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                a[i][j] = (int)(Math.random() * 101) + 100;
                System.out.print(a[i][j] + "|");
            }
            System.out.println(" ");
        }
        
        //calcular maximo y minimo
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int filaMaximo = 0;
        int filaMinimo = 0;
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                if(a[i][j] > max){
                    max = a[i][j];
                    filaMaximo = i;
                }
                
                if(a[i][j] < min){
                    min = a[i][j];
                    filaMinimo = i;
                }
            }
        }
        
        System.out.println("----------------------------------------------");
        //pintar filas minimas y maximas
        System.out.println("Minimo: ");
        for (int j = 0; j < 8; j++) {
            System.out.print(a[filaMinimo][j] + "|");
        }
        System.out.println("\n--");
        System.out.println("Maximo: ");
        for (int j = 0; j < 8; j++) {
            System.out.print(a[filaMaximo][j] + "|");
        }
    }
}
