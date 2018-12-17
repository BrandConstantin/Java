
/**
 * Sinestesio y Casilda van a pintar los tres dormitorios de su casa, quieren sustituir el color blanco por colores
 * más alegres. Realiza un programa que genere de forma aleatoria una secuencia de tres colores aleatorios (uno
 * para cada dormitorio) de tal forma que no se repita ninguno. Los colores entre los que debe elegir el programa
 * son los siguientes: rojo, azul, verde, amarillo, violeta y naranja.
 */

/**
 *
 * @author brand
 */
public class Tres_Colores_Aleatorios {

    public static void main(String[] args) {

        System.out.println("Te elegire 3 colores para que pintes las habitaciones");
        System.out.println("====================================================================");

        String[] color = new String[6];
        color[0] = "Rojo";
        color[1] = "Azul";
        color[2] = "Verde";
        color[3] = "Amarillo";
        color[4] = "Violeta";
        color[5] = "Naranja";

        System.out.print("Los colores disponible para pintar son: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(color[i] + ", ");
        }

        System.out.println("\n====================================================================");
        System.out.println("Colors recomendados para pintar tu habitación: ");
        for (int i = 0; i < 6; i++) {
            int posicion1 = (int) (Math.random() * 6);
            int posicion2 = (int) (Math.random() * 6);
            String numero1 = color[posicion1];
            String numero2 = color[posicion2];
            color[posicion1] = numero2;
            color[posicion2] = numero1;
        }

        System.out.println();

        for (int i = 0; i < 3; i++) {
            System.out.print(color[i] + ", ");
        }
    }
}
