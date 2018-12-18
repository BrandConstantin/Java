/*
 * La máquina Eurocoin genera una moneda de curso legal cada vez que se pulsa un botón
siguiendo la siguiente pauta: o bien coincide el valor con la moneda anteriormente generada
- 1 céntimo, 2 céntimos, 5 céntimos, 10 céntimos, 25 céntimos, 50 céntimos, 1 euro o 2 euros
- o bien coincide la posición – cara o cruz. Simula, mediante un programa, la generación
de 6 monedas aleatorias siguiendo la pauta correcta. Cada moneda generada debe ser una
instancia de la clase Moneda y la secuencia se debe ir almacenando en una lista.
Ejemplo:
2 céntimos – cara
2 céntimos – cruz
50 céntimos – cruz
1 euro – cruz
1 euro – cara
10 céntimos – cara

 */
package eurocoin;

import java.util.ArrayList;

/**
 *
 * @author BrinCo
 */
public class Eurocoin {
    public static void main(String[] args){
        ArrayList<Moneda> m = new ArrayList<Moneda>();
        
        Moneda moneda = new Moneda();
        m.add(moneda);
        
        String ultimaPosicion = moneda.getPosicion();
        String ultimaCantidad = moneda.getCantidad();
        
        for(int i = 0; i < 5; i++){
            do{
                moneda = new Moneda();
            }while(!((moneda.getPosicion()).equals(ultimaPosicion)) &&
                    ((moneda.getCantidad()).equals(ultimaCantidad)));
            
            m.add(moneda);
            ultimaCantidad = moneda.getCantidad();
            ultimaPosicion = moneda.getPosicion();
        }
        
        for(Moneda mony: m){
            System.out.println(mony);
        }
    }
}
