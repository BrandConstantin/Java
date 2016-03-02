/*
 * Modifica el programa anterior de tal forma que las sumas parciales y la suma 
 * total aparezcan en la pantalla con un pequeño retardo, dando la impresión de 
 * que el ordenadorse queda “pensando” antes de mostrar los números.
 * 
 * 
 * @Costy 
 */


public class ArrayAleatorioEnHojaCalculoConRetardo {
  public static void main(String[] args)
    throws InterruptedException {
    
    int[][] numero = new int[4][5];  
    int fila;
    int columna;
    String rojo = "\033[31m";
    String verde = "\033[32m";
    String morado = "\033[35m";
    
    System.out.println("Numeros aleatorios en una hoja de calculo:");
    System.out.println("===========================================================================");
   
    // sacar numeros aleatoriamente
    for(fila = 0; fila < 4; fila++){
        for(columna = 0; columna < 5; columna++){
            numero[fila][columna] = (int)(Math.random() * 900) + 100;
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
  }
}
