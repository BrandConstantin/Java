/*
*Escribe un programa que genere una secuencia de 5 cartas de la
 *     baraja espaÃ±ola y que sume los puntos segÃºn el juego de la
 *     brisca. El valor de las cartas se debe guardar en una estructura
 *     <code>HashMap</code> que debe contener parejas (figura, valor),
 *     por ejemplo ("caballo", 3).
 *     <p>    
 *     La secuencia de cartas debe ser una estructura de la clase <code>
 *     ArrayList</code> que contiene objetos de la clase <code>Carta
 *     </code>. El valor de las cartas es el siguiente: as â†’ 11, tres â†’
 *     10, sota â†’ 2, caballo â†’ 3, rey â†’ 4; el resto de cartas no vale
 *     nada.
 *     <p>
 *     <code>
 *     <pre>
 *     Ejemplo:
 *     as de oros
 *     cinco de bastos
 *     caballo de espadas
 *     sota de copas
 *     tres de oros
 *     Tienes 26 puntos


*/
package barajaEspaniola;
import java.util.ArrayList;
import java.util.HashMap;

/*
* @author BrinCo
*/
public class BarajaEspaniolaAleatoria{
    public static void main(String[] args){
        ArrayList<CartasAleatorias> a = new ArrayList<CartasAleatorias>();
        HashMap<String, Integer> h = new HashMap<String, Integer>();
        
        int puntos = 0;
        
        h.put("as", 11);
        h.put("dos", 0);
        h.put("tres", 10);
        h.put("cuatro", 0);
        h.put("cinco", 0);
        h.put("seis", 0);
        h.put("siete", 0);
        h.put("sota", 2);
        h.put("caballo", 3);
        h.put("rey", 4);
        
        CartasAleatorias carta = new CartasAleatorias();
        a.add(carta);
        
        for(int i = 0; i < 5; i++){
            do{
                carta = new CartasAleatorias();
            }while(a.contains(carta));
            
            a.add(carta);
        }
        
        for(CartasAleatorias cartaExtraida: a){
            System.out.println(cartaExtraida);
            puntos += h.get(cartaExtraida.getFigura());
        }
        
        System.out.println("Tienes " + puntos + " puntos");
    }

}