/**
 * Escribe un programa que muestre tres apuestas de la quiniela en tres columnas
 * para los 14 partidos y el pleno al quince (15 filas).
 * 
 * @author costy
 */

public class TresApuestasQuiniela {
  public static void main(String[] args) {
    
    int apuestas = 0;
    int columnas;
    int filas;
    
    System.out.println("APUESTAS QUINIELA");
    
    for (filas = 1; filas < 14; filas++){
        System.out.printf("%4d.", filas);
      
      for (columnas = 0; columnas < 3; columnas++){
        apuestas = ((int)(Math.random() * 3) + 1);
        
        switch (apuestas){
          case 1: System.out.println("[ |1|  | |  | |]");
            break;
          case 2: System.out.println("[ | |  |X|  |  |]");
            break;
          case 3: System.out.println("[ | |  | |  |2| ]");
            break;
        }
        if (apuestas == 14){
          System.out.println("Pleno al 15");
        } 
      }
        System.out.print(" ");
    }
  }
}
