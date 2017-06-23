/*
 * Escribe un programa en el que se declaren las variables enteras x e y . Asignales
 * los valores 144 y 999 respectivamente. A continuación, muestra por pantalla
 * el valor de cada variable, la suma, la resta, la división y la multiplicación.
 */
package tema02;

/**
 *
 * @author BrandConstantin
 */
public class operacionesMatematicas {
    public static void main(String[] args) {
        int x = 144;
        int y = 999;
        
        double suma = (x + y);
        double resta = (x - y);
        double divide = (x / y);
        double multiplica = (x * y);
        
        System.out.printf("Las variables %s y %s dan como resultado:\n", x, y);
        System.out.printf("Suma: %.2f\n", suma);
        System.out.printf("Resta: %.2f\n", resta);
        System.out.printf("División: %.2f\n", divide);
        System.out.printf("Multiplicación: %.2f\n", multiplica);
        
         suma = (y + x);
         resta = (y - x);
         divide = (y / x);
         multiplica = (y * x);
                
        System.out.println("Inversando los valores dan como resultado:");
        System.out.printf("Suma: %.2f\n", suma);
        System.out.printf("Resta: %.2f\n", resta);
        System.out.printf("División: %.2f\n", divide);
        System.out.printf("Multiplicación: %.2f\n", multiplica);
    }
}
