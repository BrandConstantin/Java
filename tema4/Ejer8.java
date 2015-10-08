/**
 * Amplía el programa anterior para que diga la nota del boletín 
 * (insuficiente, suficiente, bien, notable o sobresaliente).
 * 
 * @author costy
 */

public class Ejer8 {
  public static void main(String[] args) {   
  
    System.out.println("Dime las notas que has obtenido en esta asignatura");
    
    double notas1 = Double.parseDouble(System.console().readLine());
    double notas2 = Double.parseDouble(System.console().readLine());
    double notas3 = Double.parseDouble(System.console().readLine());
    
    double notaFinal = (notas1 + notas2 + notas3) / 3;
    
    System.out.println("La media obtenida es: " + notaFinal);
    
    if (notaFinal == 0 && notaFinal <=5){
      System.out.println("Esto es un insuficiente!");
    } else if (notaFinal >5 && notaFinal <=6){
      System.out.println("Esto es un suficiente!");
    } else if (notaFinal >6 && notaFinal <=7){
      System.out.println("Esto es un bien!");
    } else if (notaFinal >7 && notaFinal <=9){
      System.out.println("Esto es un notable!");
    } else if (notaFinal >9 && notaFinal ==10){
      System.out.println("Esto es un sobresaliente!");
    }
  }
}
