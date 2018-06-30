/*
 * Realiza un programa que sea capaz de rotar todos los elementos de una matriz
 * cuadrada una posición en el sentido de las agujas del reloj. La matriz debe 
 * tener 12 filas por 12 columnas y debe contener números generados al azar 
 * entre 0 y 100. Se debe mostrar tanto la matriz original como la matriz 
 * resultado, ambas con los números convenientemente alineados.
 * 
 * @author costy
 */
import java.util.Scanner;

public class RotarMatrizAgujasReloj {
  
  public static void main(String[] args) {
      
    Scanner tecla = new Scanner(System.in);
    
    int[][] n = new int[12][12];  
    int x;
    int y;
    int capa;
    int aux1;
    int aux2;
    String rojo = "\033[31m";
    String verde = "\033[32m";
    String morado = "\033[35m";

    
    System.out.println("Rotar Matriz:");
    System.out.println("===========================================================================");
   
    //generar el array y mostrarlo
    for(x = 0; x < 12; x++){
        for(y = 0; y < 12; y++){
            n[x][y] = (int)(Math.random() * 101);
            System.out.printf("%5d", n[x][y]);
        }
        System.out.println();
    }
    
    //rotar array
    for(capa = 0; capa < 6; capa++){
       //rotar por arriba
        aux1 = n[capa][11 - capa];
        for(x = 11 - capa; x > capa; x--){
        n[capa][x] = n[capa][x - 1];
         }
        
        //rotar por la derecha
        aux2 = n[11 - capa][11 - capa];
        for(x = 11 - capa; x > capa + 1; x--){
            n[x][11 - capa] = n[x - 1][11 - capa];
        }
        n[capa + 1][11 - capa] = aux1;
        
        //rotar por abajo
        aux1 = n[11 - capa][capa];
        for(x = capa; x < 11 - capa - 1; x++){
        n[11 - capa][x] = n[11 - capa][x + 1];
        }
        n[11 - capa][11 - capa - 1] = aux2;
        
        //rotar por la izquierda
        for(x = capa; x < 11 - capa - 1; x++){
            n[x][capa] = n[x + 1][capa];
        }
        n[11 - capa - 1][capa] = aux1;
    }

    System.out.println("==================================================");
    //generar el array y mostrarlo
    for(x = 0; x < 12; x++){
        for(y = 0; y < 12; y++){
            System.out.printf("%5d", n[x][y]);
        }
        System.out.println();
    }
  }  
}
