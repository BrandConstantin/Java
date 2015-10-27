/*
 * Ejemplo operadores aritmeticos
 *
 * @author costy
 */

public class operadoresAritmeticos {
  
  public static void main(String[] args) {

    //código aplicación
    short x = 7;
    int y = 5;
    float flo1 = 13.5f;
    float flo2 = 8f;
    
    System.out.println("Los valores de x e y son "+ x + " = " +y);
    System.out.println("El resultado de x + y es = " + (x+y));
    System.out.println("El resultado de x - y es = " + (x-y));
    System.out.println("El resultado de x / y es = " + (x/y));
    System.out.println("El resto de x e y es = " + (x%y)); 
    System.out.println("El valor de flo1 y flo2 es = " + flo1 + " - " + flo2);
    System.out.println("El resultado de flo1 / flo2 es = " + (flo1 / flo2));
  }
}