/*
 * Escribe un programa en el que se declaren las variables enteras x e y. Asignales los valores
* 144 y 999 respectivamente. A continuación, muestra por pantalla el valor de cada variable,
* la suma, la resta, la división y la multiplicación.
 */

/**
 *
 * @author costy
 */
public class OperacionesMatematicas {
    public static void main (String[] args){
        int x = 144;
        int y = 999;
        
        System.out.println("El valor de 'x' es " + x + " y de 'y' es: " + y);
        System.out.println("La suma de 'x' y de 'y' es: " + x + y);        
        System.out.println("La resta de 'x' y de 'y' es: " + (x - y));     
        System.out.println("La división de 'x' y de 'y' es: " + (x / y));     
        System.out.println("La multiplicación de 'x' y de 'y' es: " + (x * y));     
    }
    
}
