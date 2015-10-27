/*
 * Ejemplo operadores asignación
 *
 * @author costy
 */

public class ejemploRelacionales {
  
  public static void main(String[] args) {

    //código aplicación
    String cadena;
    boolean resultado;
    
    System.out.print("Introduce el primer numero:");
    double x =Double.parseDouble(System.console().readLine());
    System.out.print("Introduce el segundo numero:");
    double y =Double.parseDouble(System.console().readLine());
    
    //realizamos la comparaciones de los numeros
    cadena = (x == y)?"iguales":"distintos";
    System.out.printf("Los numeros %d y %d son %s\n ",x,y, cadena);
    
    resultado = (x != y);
    System.out.println("x != y es " + resultado);
    resultado = (x < y);
    System.out.println("x < y es:" + resultado);
    resultado = (x > y);
    System.out.println("x > y es:" + resultado);
    resultado = (x >= y);
    System.out.println("x >= y es:" + resultado);
    resultado = (x <= y);
    System.out.println("x <= y es:" + resultado);
    
  }
}