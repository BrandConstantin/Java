
/**
 * Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
 * aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente.
 * Al final aparecerá el número de suspensos, el número de suficientes, el
 * número de bienes, etc.
 *
 * @author brand
 */

public class Notas {

    public static void main(String[] args) {
        int notas;
        String simbolo = "";
        int totalSuspenso = 0;
        int totalSuficiente = 0;
        int totalBien = 0;
        int totalNotable = 0;
        int totalSobresaliente = 0;

        System.out.println("20 notas al azar");

        for (int f = 1; f <= 20; f++) {
            notas = (int) (Math.random() * 10);

            switch (notas) {
                case 1:
                case 2:
                case 3:
                case 4:
                    simbolo = "SUSPENSO";
                    totalSuspenso++;
                    break;
                case 5:
                    simbolo = "SUFICIENTE";
                    totalSuficiente++;
                    break;
                case 6:
                case 7:
                    simbolo = "BIEN";
                    totalBien++;
                    break;
                case 8:
                    simbolo = "NOTABLE";
                    totalNotable++;
                    break;
                case 9:
                case 10:
                    simbolo = "SOBRESALIENTE";
                    totalSobresaliente++;
                    break;
                default:
            }
            System.out.println(simbolo);
        }
        System.out.println("Han salido un numero de " + totalSuspenso + " suspensos, "
                + +totalSuficiente + " suficientes, " + totalBien + " notas de bien, "
                + totalNotable + " notables y un numero de " + totalSobresaliente
                + " sobresalientes");
    }
}
