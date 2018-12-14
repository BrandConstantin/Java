/*
 * Escribe un programa que muestre por pantalla 10 palabras en inglés junto a su correspon-
 *diente traducción al castellano. Las palabras deben estar distribuidas en dos columnas y
 *alineadas a la izquierda. Pista: Se puede insertar un tabulador mediante \t
 */
package tema01;

/**
 *
 * @author BrandConstantin
 */
public class diccionario2 {
    public static void main(String[] args) {
        System.out.println("INGLES          ESPAÑOL");
        System.out.println("---------------------------------------");
        System.out.printf("%-10s   \tnegro\n", "black");
        System.out.printf("%-10s   \trojo\n", "red");
        System.out.printf("%-10s   \tazul\n", "blue");
        System.out.printf("%-10s   \tverde\n", "green");
        System.out.printf("%-10s   \tblanco\n", "white");
        System.out.printf("%-10s   \tamarillo\n", "yellow");
        System.out.printf("%-10s   \tmorado\n", "purple");
        System.out.printf("%-10s   \troza\n", "pink");
    }
}
