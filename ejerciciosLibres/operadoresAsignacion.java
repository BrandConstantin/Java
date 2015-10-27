/*
 * Ejemplo operadores asignación
 *
 * @author costy
 */

public class operadoresAsignacion {
  
  public static void main(String[] args) {

    //código aplicación
    int x;
    int y;
    x = 5;
    y = 4;
    
    System.out.printf("El valor de x es %d y el de y es %d\n ",x,y);
    System.out.println("Suma combinada de x+=y es:" + (x+=y));
    System.out.println("Resta combinada de x-=y es:" + (x-=y));
    System.out.println("Producto combinada de x*=y es:" + (x*=y));
    System.out.println("División combinada de x/=y es:" + (x/=y));
    System.out.println("Resto combinada de x%=y es:" + (x%=y));
    
  }
}