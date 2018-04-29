/*
 * Mejora el juego “Busca el tesoro” de tal forma que si hay una mina a una 
 * casilla de distancia, el programa avise diciendo ¡Cuidado! ¡Hay una mina cerca!
 * 
 * @author costy
 */
import java.util.Scanner;

public class BuscaElTesoro {
  
  static final int VACIO = 0;
  static final int MINA = 1;
  static final int TESORO = 2;
  static final int INTENTO = 3;
  
  public static void main(String[] args) {
      
    Scanner tecla = new Scanner(System.in);
    
    int[][] cuadricula = new int[6][6];  
    int x;
    int y;
    String rojo = "\033[31m";
    String verde = "\033[32m";
    String morado = "\033[35m";

    
    System.out.println("Busca tesoro:");
    System.out.println("===========================================================================");
   
    //inicializar el array
    for(x = 0; x < 5; x++){
        for(y = 0; y < 5; y++){
            cuadricula[x][y] = VACIO;
        }
    }
    
    //coloca la mina
    int minaX = (int)(Math.random() * 5);
    int minaY = (int)(Math.random() * 5);
    cuadricula[minaX][minaY] = MINA;
    
    //coloca el tesoro
    int tesoroX;
    int tesoroY;
    
     do {
         tesoroX = (int)(Math.random() * 5);
         tesoroY = (int)(Math.random() * 5);
     } while ((minaX == tesoroX) && (minaY == tesoroY));
    
    cuadricula[tesoroX][tesoroY] = TESORO;
    
    int oportunidades = 10;
    boolean salir = false;
    String a = "";
    
    //pintar la cuadricula
    do{
        for(y = 5; y >= 0; y--){
            System.out.print(y + "|");
            for(x = 0; x < 6; x++){
                if (cuadricula[x][y] == INTENTO){
                    System.out.print("X ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println(".........................\n  0  1  2  3  4  5\n");
        
        System.out.print("x (en horizontal): ");
        x = tecla.nextInt();
        System.out.print("y (en vertical): ");
        y = tecla.nextInt();
        
        //comparar coordenadas del usuario
        switch(cuadricula[x][y]){
            case VACIO:
                cuadricula[x][y] = INTENTO;
                if ((Math.abs(x - minaX) < 2) && (Math.abs(y - minaY) < 2)) {
                     System.out.println(morado + "Hay una mina cerca!");
                }
                break;
            case MINA:
                System.out.println(rojo + "Has perdido!");
                salir = true;
                break;
            case TESORO:
                System.out.println(verde + "Has encontrado el tesoro!");
        }
    }while(!salir);
    
    System.out.println("======================================================");
    
    //pintar la cuadricula
    for(y = 5; y >= 0; y--){
        System.out.print(y + "|");
        for(x = 0; x < 6; x++){
            switch (cuadricula[x][y]){
                case VACIO:
                    a = "  ";
                    break;
                case MINA:
                    a = rojo + "* ";
                    break;
                case TESORO:
                    a = verde + "€ ";
                    break;
                case INTENTO:
                    a = morado + "X ";
                    break;
            }
            System.out.print(a);
        }
        System.out.println();
    }
    System.out.println(".........................\n  0  1  2  3  4  5\n");
    System.out.println("==================================================");
  }  
}
