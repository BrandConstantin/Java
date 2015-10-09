/**
 * Escribe un programa que ordene tres números enteros introducidos por teclado.
 * 
 * @author costy
 */

public class Ejer13 {
  public static void main(String[] args) {   
  
    System.out.println("Introduce 3 numeros para ordenarlo ascendentemente\n\n");
    
    System.out.println("PRIMER NUMERO: ");
    int num1 = Integer.parseInt(System.console().readLine());
    
    System.out.println("SEGUNDO NUMERO: ");
    int num2 = Integer.parseInt(System.console().readLine());
    
    System.out.println("TERCER NUMERO: ");
    int num3 = Integer.parseInt(System.console().readLine()); 
    
    int menor, medio, mayor;
    
    if (num1 > num2 && num1 > num3)
      mayor = num1;
    else
    if (num2 > num1 && num2 > num3)
      mayor = num2;
    else 
      mayor = num3;
    if (num1 < num2 && num1 < num3)
      menor = num1;
    else 
    if (num2 < num1 && num2 < num3)
      menor = num2;
    else
      menor = num3;
      medio = (num1 + num2 + num3) - (mayor+menor);
    
    System.out.println("Los numeros son " + menor +"   " + medio + "   " + 
      mayor);

    
  }
}
