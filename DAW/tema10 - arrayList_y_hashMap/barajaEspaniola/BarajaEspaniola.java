package barajaEspaniola;

import java.util.ArrayList;

/*
* @author BrinCo
*/
public class BarajaEspaniola{
    public static void main(String[] args){
        ArrayList<Cartas> c = new ArrayList<Cartas>();
        
        Cartas carta = new Cartas();
        c.add(carta);
        
        for(int i = 0; i < 9; i++){
            do{
                carta = new Cartas();
            }while(c.contains(carta));
            
            c.add(carta);
        }
        
        for(Cartas cartaExtraida: c){
            System.out.println(cartaExtraida);
        }
    }

}