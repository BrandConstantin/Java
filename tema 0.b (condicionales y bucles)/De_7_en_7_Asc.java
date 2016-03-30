/*
 * De 7 en 7 ascendente
 */
package tema.pkg0.b.condicionales.y.bucles;
import java.util.Scanner;
/**
 *
 * @author BrinCo
 */
public class De_7_en_7_Asc {

    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        
        int x;
        
        System.out.println("Numeros de 7 en 7 hasta 100:");
        System.out.println("==================================");
        
        for(x = 0; x <= 100; x += 7){
            System.out.print(x + " ");
        }
    }
}
