
/**
 * Modifica el programa anterior para que la probabilidad de que salga un 1 sea
 * de 1/2, la probabilidad de que salga x sea de 1/3 y la probabilidad de que
 * salga 2 sea de 1/6. Pista: 1/2 = 3/6 y 1/3 = 2/6.
 *
 * @author brand
 */
public class Apuesta_Quiniela {

    public static void main(String[] args) {

        int apuestas = 0;
        int columnas;
        int filas;

        System.out.println("APUESTAS QUINIELA");
        System.out.println("----------------------------");

        for (filas = 1; filas < 14; filas++) {
            System.out.printf("%4d.", filas);

            for (columnas = 0; columnas < 3; columnas++) {
                apuestas = ((int) (Math.random() * 6) + 1);

                switch (apuestas) {
                    case 1:
                    case 2:
                    case 3:
                        System.out.println("\t[ |1|  | |  | |]");
                        break;
                    case 4:
                    case 5:
                        System.out.println("\t[ | |  |X|  | |]");
                        break;
                    case 6:
                        System.out.println("\t[ | |  | |  |2|]");
                        break;
                }
                if (apuestas == 14) {
                    System.out.println("Pleno al 15");
                }
            }
            System.out.print(" ");
        }
    }
}
