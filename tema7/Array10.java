/*
 * Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y 
 * que los almacene en un array. El programa debe ser capaz de pasar todos los
 * números pares a las primeras posiciones del array (del 0 en adelante) y 
 * todos los números impares a las celdas restantes. Utiliza arrays auxiliares 
 * si es necesario.
 * 
 * 
 *@Costy 
 */

public class Array10 {
  public static void main(String[] args) {
    
    int[] numero = new int [20];
    int[] pares = new int [20];
    int[] impares = new int [20];
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String blanco = "\033[37m";
    int contaImpar = 0;
    int contaPar = 0;
    int i;
    
    //muestra los numeros aleatorios
    for (i = 0; i < numero.length; i++) {
      numero[i] = (int)(Math.random() * 101);
      System.out.print(verde + numero[i]);

    //diferenciar pares de impares, contarlos y almacenarlos en un array
      if ((numero[i] % 2) == 0){
        System.out.println(blanco + "\tPAR");
        pares[contaPar++] = numero[i];
      } else{
        System.out.println(naranja + "\tIMPAR");
        impares[contaImpar++] = numero[i];
      }
    }
      
      //Meter los pares primeros y los impares segundos en una lista y mostrarlos
      
          
      for (i = 0; i < pares.length; i++){
        numero[i] = pares[i];
      }
      
      int aux = 0;
      
      for (i = contaPar; i < numero.length; i++){
        numero[i] = impares[aux];
        aux++;
      }
		
      System.out.println("===================================================");
      System.out.print("Array cambiado: ");
      for (i = 0; i < 20; i++ ){
        System.out.print(numero[i]+" ");
      } 
  }
}
