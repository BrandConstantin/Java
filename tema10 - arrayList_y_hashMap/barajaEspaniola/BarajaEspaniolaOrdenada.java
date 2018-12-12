/*
*Modifica el programa anterior de tal forma que las cartas se muestren ordenadas. Primero
se ordenarán por palo: bastos, copas, espadas, oros. Cuando coincida el palo, se ordenará
por número: as, 2, 3, 4, 5, 6, 7, sota, caballo, rey.

*/
package barajaEspaniola;

import java.util.*;

/*
* @author BrinCo
*/
public class BarajaEspaniolaOrdenada{
    public static void main(String[] args){
        ArrayList<CartasOrdenadas> a = new ArrayList<CartasOrdenadas>();
        
        CartasOrdenadas carta = new CartasOrdenadas();
        a.add(carta);
        
        for(int i = 0; i < 9; i++){
            do{
                carta = new CartasOrdenadas();
            }while(a.contains(carta));
            
            a.add(carta);
        }
        
        Collections.sort(a);
        
        for(CartasOrdenadas cartaExtraida: a){
            System.out.println(cartaExtraida);
        }
    }

}