/*
 * Realiza un programa que rellene un array de 6 filas por 10 columnas con 
 * números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A 
 * continuación, el programa deberá dar la posición tanto del máximo como del mínimo.
 * 
 * @author costy
 */
public class ArrayConPosicionMaximoYminimo {
  public static void main(String[] args)
    throws InterruptedException {
    
    int[][] numero = new int[6][10];  
    int fila;
    int columna;
    String rojo = "\033[31m";
    String verde = "\033[32m";
    String morado = "\033[35m";
    int min = 1000;
    int max = 0;
    
    System.out.println("Sacar minimo y maximo de un array con números aleatorios:");
    System.out.println("===========================================================================");
   
    // sacar numeros aleatoriamente
    for(fila = 0; fila < 4; fila++){
        for(columna = 0; columna < 5; columna++){
            numero[fila][columna] = (int)(Math.random() * 1001);
    
            if (numero[fila][columna] < min){
              min = numero[fila][columna];
            } 
            if (numero[fila][columna] > max){
              max = numero[fila][columna];
            }
        }
    }
    
    System.out.println(" ");
    System.out.println("===========================================================================");
   
    //muestra los numeros y suma las filas 
    int totalFila = 0;
    for(fila = 0; fila < 4; fila++){
        int sumaFila = 0;
        for(columna = 0; columna < 5; columna++){
            System.out.print(morado);  
            System.out.printf("%5d", numero[fila][columna]);
            Thread.sleep(800);
            sumaFila += numero[fila][columna];
        }
        System.out.print("   " + verde +  sumaFila);       
        totalFila += sumaFila;
        System.out.println();           
    }
 
    //suma las columnas
    int totalColumna = 0;
    for(columna = 0; columna < 5; columna++){
        int sumaColumna = 0;
        for(fila = 0; fila < 4; fila++){
            sumaColumna += numero[fila][columna];
        }
        totalColumna += sumaColumna; 
        System.out.print(" " + verde + sumaColumna );
    }
    
    int total;
    total = totalColumna + totalFila;
    System.out.println("\t" + rojo + total);
    
    System.out.println("==================================================");

    System.out.println("Número máximo " + max);
    System.out.println("Número minimo " + min);
  }  
}
