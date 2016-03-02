/**
 * Realiza un programa que vaya generando números aleatorios pares entre 0 y 
 * 100 y que no termine de generar números hasta que no saque el 24. El 
 * programa deberá decir al final cuántos números se han generado.
 * 
 * @author costy
 */

public class GenerarHastaSacar24 {
  public static void main(String[] args) {
    
    int numero = 0;
    int contador = 0;
    
    System.out.println("Numeros aleatorios hasta encontrar el 24");
    
    do{
        numero = (int)(Math.random() * 50) * 2;
        if (numero % 2 == 0){
            contador++;
        }
    } while (numero != 24);
    System.out.println("Se han generado " + contador + " números");
  }
}
