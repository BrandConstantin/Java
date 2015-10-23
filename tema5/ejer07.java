/**
 * Realiza el control de acceso a una caja fuerte. La combinación será un número
 * de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no 
 * acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación” 
 * y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
 * Tendremos cuatro oportunidades para abrir la caja fuerte.
 * 
 * los numeros son 8, 13, 2, 10
 * 
 * @author costy
 */

public class ejer07 {
  public static void main(String[] args) {   
    
    System.out.println("Escribe la combinación de 4 cifras para abrir la caja " + 
    "fuerte: ");
    
    System.out.println("Se acceptan solo numeros de 1 a 15");
    
    int intentos = 0;
    int primNum = Integer.parseInt(System.console().readLine());
    int segNum = Integer.parseInt(System.console().readLine());
    int tercerNum = Integer.parseInt(System.console().readLine());
    int cuartoNum = Integer.parseInt(System.console().readLine());
    
    do {
      if ((primNum == 8) && (segNum == 13) && 
          (tercerNum == 2) && (cuartoNum == 10)){
       System.out.println("La caja fuerte se ha abierto");
      } else {
        System.out.println("Esta no es la combinación, lo siento!");
      } 
      intentos++;
    } while (intentos == 4);
  }
}
