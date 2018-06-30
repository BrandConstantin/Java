/*
 * Algunos colores en Java
 */
package tema01;

/**
 *
 * @author BrandConstantin
 */
public class Colores {
    public static void main(String[] args) {
        String rojo = "\033[31m";
        String verde = "\033[32m";
        String naranja = "\033[33m";
        String azul = "\033[34m";
        String morado = "\033[35m";
        String blanco = "\033[37m";
        
        System.out.println(naranja + "Naranja");
        System.out.println(verde + "Verde");
        System.out.println(blanco + "Blanco");
        System.out.println(morado + "Morado");
        System.out.println(rojo + "Rojo");
        System.out.println(azul + "Azul");
    }
}
