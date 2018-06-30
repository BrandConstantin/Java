/*
 * Escribe un programa que, dada una posición en un tablero de ajedrez, nos
 * diga a qué casillas podría saltar un alfil que se encuentra en esa posición.
 * Como se indica en la figura, el alfil se mueve siempre en diagonal. El 
 * tablero cuenta con 64 casillas. Las columnas se indican con las letras de la 
 * “a” a la “h” y las filas se indican del 1 al 8.
 * 
 * @author costy
 */
import java.util.Scanner;

public class MovimientoAlfilAjedrez {
  
  static final String RESET = "\033[0m";
  static final String INVERSO = "\033[32m";
  static final String BLANCA = "  ";
  static final String NEGRA = INVERSO + BLANCA + RESET;
  static final String ALFIL = "♝ ";  // ∆♝۩♗
  static final String MOVIMIENTOBLANCO = "● "; // ●
  //static final String MOVIMIENTONEGRO = "◙█"; // ◘◙◘
  static final String MOVIMIENTONEGRO = INVERSO + MOVIMIENTOBLANCO + RESET;
    
  public static void main(String[] args) {
      
    Scanner tecla = new Scanner(System.in);
    
    String[][] tablero = new String[9][9];
    int fila;
    int columna;
    String casilla;
    
    System.out.println("Movimiento Alfil Ajedrez");
    System.out.println("===========================================================================");
   
    //pintar el tablero vacio
    System.out.println("  ░░░░░░░░░░░░░░");
    casilla = BLANCA;
    for(fila = 8; fila >= 1; fila --){
        System.out.print(fila + " ░░");
        for(columna = 1; columna <= 8; columna++){
            if((fila % 2) == 1){ //fila impar
                if((columna % 2) == 1){ //columna impar
                    casilla = BLANCA;
                } else { //columna par
                    casilla = NEGRA;
                }
            } else { //fila par
                if((columna % 2) == 1){ //columna impar
                    casilla = NEGRA;
                } else { //columna par
                    casilla = BLANCA;
                }
            }
            System.out.print(casilla);
            tablero[fila][columna] = casilla;
        }
        System.out.println("░░");
    }
    System.out.println("  ░░░░░░░░░░░░░░");
    System.out.println("     a b c d e f g h");

    System.out.println("\n==================================================");
    
    //pedir coordenadas
    System.out.println("Introduzca posicion alfil (ejemplo d3)");
    String posicionAlfil = tecla.next();
    int columnaAlfil = (int)(posicionAlfil.charAt(0)) - 96;
    int filaAlfil = (int)(posicionAlfil.charAt(1)) - 48;
        
    //System.out.println(posicionAlfil.charAt(0));
    //System.out.println(columnaAlfil);
    //System.out.println(filaAlfil);
    
    System.out.println("\n=================================================="); 
     
    if((((filaAlfil % 2) + (columnaAlfil % 2)) % 2) == 0){
        tablero[filaAlfil][columnaAlfil] = ALFIL;
    } else {
        tablero[filaAlfil][columnaAlfil] = INVERSO + ALFIL + RESET;
    }
    
    // pintar el alfil y las posiciones donde puede moverse
    System.out.println("  ░░░░░░░░░░░░░░");
    for(fila = 8; fila >= 1; fila --){
        System.out.print(fila + " ░░");
        for(columna = 1; columna <= 8; columna++){
            if((Math.abs(filaAlfil - fila) == Math.abs(columnaAlfil - columna))
                    && (! ((filaAlfil == fila) && (columnaAlfil == columna)))){
                if(tablero[fila][columna] == BLANCA){
                    tablero[fila][columna] = MOVIMIENTOBLANCO;
                } else {
                    tablero[fila][columna] = MOVIMIENTONEGRO;
                }
            }
            System.out.print(tablero[fila][columna]);
        }
        System.out.println("░░");
    }
    System.out.println("  ░░░░░░░░░░░░░░");
    System.out.println("     a b c d e f g h");
  }  
}
