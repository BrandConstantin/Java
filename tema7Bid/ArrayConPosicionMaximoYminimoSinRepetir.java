/*
 * Modifica el programa anterior de tal forma que no se repita ningún número en
 * el array.
 * 
 * @author costy
 */
public class ArrayConPosicionMaximoYminimoSinRepetir {
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
    boolean repetido;
    
    System.out.println("Sacar minimo y maximo de un array con números aleatorios:");
    System.out.println("===========================================================================");
   
    // sacar numeros aleatoriamente
    for(fila = 0; fila < 6; fila++){
        for(columna = 0; columna < 10; columna++){
            do{
                numero[fila][columna] = (int)(Math.random() * 1001);
                
                repetido = false;
                for(int i = 0; i < 10 * fila + columna; i++){
                   if(numero[fila][columna] == numero[i / 10][i % 10]){
                       repetido = true;
                   }
                }
            }while(repetido);
    
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
    for(fila = 0; fila < 6; fila++){
        int sumaFila = 0;
        for(columna = 0; columna < 10; columna++){
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
    for(columna = 0; columna < 10; columna++){
        int sumaColumna = 0;
        for(fila = 0; fila < 6; fila++){
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
