/**
 * Realiza un programa que llene la pantalla de caracteres aleatorios 
 * (a lo Matrix) con el código ascii entre el 32 y el 126. Puedes hacer casting 
 * con (char) para convertir un entero en un carácter.
 * @author costy
 */

public class Matrix {
  public static void main(String[] args)
    throws InterruptedException{
    
    long repeticion = 0;
    
    System.out.println("\033[32m");
    
    for (long i = 0; i < 10000; i++){
        System.out.print((char)(Math.random() * (126 - 32 + 1) + 32));
        
        if (repeticion == 95){
            repeticion = 0;
            Thread.sleep(150);
            System.out.print("");
        }
    }
  }
}
