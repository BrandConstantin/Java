/**
 * Escribe un programa que dados dos números, uno real (base) y un entero 
 * positivo (exponente), saque por pantalla todas las potencias con base el 
 * numero dado y exponentes entre uno y el exponente introducido. No se deben 
 * utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 
 * 5, se deberán mostrar 2 1 , 2 2 , 2 3 , 2 4 y 2 5 .
 * 
 * @author costy
 */

public class ejer15 {
  public static void main(String[] args) {   
    
    System.out.println("Escribe la base");
    int base = Integer.parseInt(System.console().readLine());
    System.out.println("Escribe el exponente");
    int exponente = Integer.parseInt(System.console().readLine());

    double potencia;
    int expo;  
    
    for (int e = 1; e <= exponente; e++){
      
      potencia = 1;
      expo = e;
      
      for (int i = 0; i < expo; i++){
          potencia = potencia * base; 
      }
      System.out.println(base + "^" + e + "=" + potencia);

    }
    

  }
}
