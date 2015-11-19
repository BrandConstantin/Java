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
 
import java.util.Scanner;

public class Array10 {
  public static void main(String[] args) {
    
    Scanner num = new Scanner(System.in);
    
    int[] numero = new int [20];
    String verde = "\033[32m";
    String naranja = "\033[33m";
    //String azul = "\033[34m";
    //String morado = "\033[35m";
    String blanco = "\033[37m";
    int contaImpar = 0;
    int contaPar = 0;
    
    //muestra los numeros aleatorios
    for (int i = 0; i < numero.length; i++) {
      numero[i] = (int)(Math.random() * 101);
      System.out.print(verde + numero[i]);

    //diferenciar pares de impares, contarlos y almacenarlos en un array
      if ((numero[i] % 2) == 0){
        System.out.println(blanco + "\tPAR");
        contaPar++;
      } else{
        System.out.println(naranja + "\tIMPAR");
        contaImpar++;
      }
    
      //System.out.println("===================================================");
      
      int[] pares = new int [20];
      int[] impares = new int [20];
      for (int a = 0; a < (pares.length - 1); a++){
        numero[a] = pares[a];
      }

    
    
      /*		for (int i=0; i<pares.length;i++){
			numeros[i]=pares[i];
		}
		indiceImpares=0;
		
		for (int i=indicePares;i<numeros.length;i++){
			numeros[i]=impares[indiceImpares];
			indiceImpares++;
		}
		System.out.print("Array cambiado: ");
		for (int i:numeros){
			
			System.out.print(i+" ");*/
    } 
  }
}
