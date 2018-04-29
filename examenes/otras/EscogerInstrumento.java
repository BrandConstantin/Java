/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repesca_2016;

import java.util.ArrayList;

/**
 *
 * @author BrinCo
 */
public class EscogerInstrumento {
     public static void main(String[] args) {
        ArrayList<InstrumentoDeEscritura> escogeInstu = new ArrayList<InstrumentoDeEscritura>();
        int i;
        
        for(i = 0; i < 5; i++){
            escogeInstu.add(new InstrumentoDeEscritura());
        }
        
        //muestra instrumentos
        System.out.println("Instrumentos escogidos: ");
        for (InstrumentoDeEscritura a : escogeInstu) {
              System.out.println(a);
       }
    }
}
