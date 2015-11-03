/**
 * Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos) 
 * separados por espacios. Muestra también el máximo, el mínimo y la media de 
 * esos números.
 * 
 * @author costy
 */

public class Ejer05 {
  public static void main(String[] args) {
    
    System.out.println("50 numeros aleatorios");
    int min = 200;
    int max = 0;
    int suma = 0;
    
    for (int i = 1; i <= 50; i++) {
      int numeros = (int)(Math.random()*100) + 100;
      System.out.print(numeros + " "); 
      
      suma += numeros;
      if (numeros<min){
        min=numeros;
      } 
      if (numeros>max){
        max=numeros;
      }
    } 
    System.out.println("\nLa media es " + (suma/50) + "\nEl numero minimo es " + 
                  min + "\nEl numero maximo es" +  max); 
  }
}
