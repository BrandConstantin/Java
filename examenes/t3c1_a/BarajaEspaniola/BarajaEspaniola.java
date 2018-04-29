/*
 * Crea dos mazos de cartas de la baraja española generadas de forma aleatoria. Cada mazo debe ser
un ArrayList de objetos de la clase Carta. A continuación, junta esos mazos en uno solo (otro
ArrayList) de forma que las cartas se mezclen aleatoriamente. Tanto los dos mazos originales como la
mezcla se deben mostrar por pantalla. El número de cartas de los mazos originales es un número
aleatorio entre 1 y 5.
 */
package t3c1_a.BarajaEspaniola;

import java.util.ArrayList;

/**
 *
 * @author BrinCo
 */
public class BarajaEspaniola {
    public static void main(String[] args) {
        ArrayList<Baraja> mazo1 = new ArrayList<>();
        ArrayList<Baraja> mazo2 = new ArrayList<>();
        
        System.out.println("Mazo 1:");
        for(int i = 0; i < (int)((Math.random() * 5) + 1); i++){
            Baraja nuevaB = new Baraja();
            mazo1.add(nuevaB);
            System.out.println(nuevaB.toString());
        }
        
        System.out.println("\n");
        
        System.out.println("Mazo 2:");
        for(int i = 0; i < (int)((Math.random() * 5) + 1); i++){
            Baraja nuevaB = new Baraja();
            mazo2.add(nuevaB);
            System.out.println(nuevaB.toString());
        }
        
        System.out.println("\n");
        
        ArrayList<Baraja> mezcla = Baraja.mezclar(mazo1, mazo2);
        
        System.out.println("Mezcla Final: ");
        for(int i = 0; i < mezcla.size(); i++){
            Baraja barajaFinal = mezcla.get(i);
            System.out.println(barajaFinal.toString());
        }
    }
}
