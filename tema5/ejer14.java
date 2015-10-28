/**
 * Escribe un programa que pida una base y un exponente (entero positivo) y que 
 * calcule la potencia.
 * 
 * @author costy
 */

public class ejer14 {
  public static void main(String[] args) {   
    
    System.out.println("Escribe el base (numero entero positivo)");
    int base = Integer.parseInt(System.console().readLine());
    System.out.println("Escribe la exponente (numero entero positivo)");
    int expo = Integer.parseInt(System.console().readLine());
    
    int potencia;
    
    if (expo >= 0){
      potencia = 1; 
      
      for (int i = 0; i < expo; i++){
          potencia *= base; 
      }
    }
      System.out.println(base + " ^ " + expo + " = " + potencia);
  }
}
