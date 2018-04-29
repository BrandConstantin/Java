/*
 *Realiza un programa que genere y muestre por pantalla un array bidimensional de números enteros
entre 100 y 200. El número de filas debe ser igual al número de columnas (un número aleatorio entre 4
y 10). A continuación, se deben extraer del array los siguientes datos:
a) La diagonal que va de la esquina superior izquierda a la esquina inferior derecha.
b) La diagonal que va de la esquina superior derecha a la esquina inferior izquierda.
c) La primera fila.
d) La última fila.
e) La primera columna.
f) La última columna.
Ejemplo:
145 192 114 120 125
135 172 124 145 142
132 142 164 123 141
198 145 194 111 118
182 112 168 147 136
Diagonal de la esquina sup. izq. a la esquina inf. der.: 145 172 164 111 136
Diagonal de la esquina sup. der. a la esquina inf. izq.: 125 145 164 145 182
Primera fila: 145 192 114 120 125
Última fila: 182 112 168 147 136
Primera columna: 145 135 132 198 182
Última columna: 125 142 141 118 136
 */
package t2_rec;

/**
 *
 * @author BrinCo
 */
public class DiagonalesFilasYColumnas {
    public static void main(String[] args) {
        
        int t[][] = new int [10][10];
        int i;
        int j;
        
        System.out.println("Array Bidimensional");
        System.out.println("============================================");
        
        for(i = 0; i < t.length; i++){
            for(j = 0; j < t.length; j++){
                t[i][j] = (int)(Math.random() * 101) + 100;
            }
        }
        
        //mostramos array
        for(i = 0; i < t.length; i++){
            System.out.println("");
            for(j = 0; j < t.length; j++){
                System.out.print("\t|_" + t[i][j] + "_|");
            }
        }
        
        System.out.println("\n====================================================");

        //I Fila
        System.out.println("I FILA: ");
        for(i = 0; i < t.length; i++){
            for(j = 0; j < t.length; j++){
                if(i == 0){
                    System.out.print("\t|_" + t[i][j] + "_|");
                }
            }
        }
        
        System.out.println("\n===================================================·");
        
        //I Columna
        System.out.println("\nI COLUMNA: ");
        for(i = 0; i < t.length; i++){
            for(j = 0; j < t.length; j++){    
                if(j == 0){
                    System.out.print("\t|_" + t[i][j] + "_|");
                }
            }
        }
        
        System.out.println("\n=====================================================");
        
        //I Diagonal
        System.out.println("I DIAGONAL");
        for(i = 0; i < t.length; i++){
            for(j = 0; j < t.length; j++){
                if(i == j){
                    System.out.print("\t|_" + t[i][j] + "_|");
                }
            }
        }
        
        System.out.println("\n===================================================");

        //X Fila
        System.out.println("\nULTIMA FILA");
        for(i = 9; i < t.length; i++){
            for(j = 0; j < t.length; j++){  
                if(i == 9){
                    System.out.print("\t|_" + t[i][j] + "_|");
                }
            }
        }               
        
        System.out.println("\n===================================================");               
        
        //X Columna
        System.out.println("\nULTIMA COLUMNA: ");
        for(i = 0; i < t.length; i++){
            for(j = 9; j < t.length; j++){    
                if(j == 9){
                    System.out.print("\t|_" + t[i][j] + "_|");
                }
            }
        }
        
        System.out.println("\n===================================================");
        
        //II Diagonal
        System.out.println("SEGUNDA DIAGONAL :");
        int fila = 0;
        int columna = 9;
        while(fila < 10){
          System.out.print(t[fila][columna] + "|");
          fila++;
          columna--;
        }
        
        //mara meter los números en otro array
          //int resultado[i] = t[fila][columna];
          //i++;
        System.out.println("\n====================================================");
    } 
}
