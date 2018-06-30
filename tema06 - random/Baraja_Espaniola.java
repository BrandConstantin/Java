
/**
 * Igual que el ejercicio anterior pero con la baraja española. Se utilizará la
 * baraja de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
 *
 *
 * /**
 *
 * @author brand
 */
public class Baraja_Espaniola {

    public static void main(String[] args) {

        int numero = (int) (Math.random() * 10) + 1;
        int palos = (int) (Math.random() * 4);
        String figura = "";

        switch (numero) {
            case 1:
                figura = "AS";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                figura = String.valueOf(numero);
                break;
            case 8:
                figura = "SOTA";
                break;
            case 9:
                figura = "CABALLO";
                break;
            case 10:
                figura = "REY";
                break;
        }

        switch (palos) {
            case 0:
                figura = " de ORO";
                break;
            case 1:
                figura = " de COPA";
                break;
            case 2:
                figura = " de ESPADA";
                break;
            case 3:
                figura = " de BASTOS";
                break;
        }

        System.out.println("La carta es " + numero + figura);
    }
}
