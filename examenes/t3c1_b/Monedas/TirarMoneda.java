/*
 * vCrea un ArrayList de objetos de la clase Moneda. Las monedas se generan al azar. El número de
monedas generadas es un número aleatorio entre 1 y 8 (se pueden repetir). A continuación se debe
mostrar la suma total en euros y en céntimos. Si la cantidad total es menor de un euro, no se muestran
los euros en la suma. Si la cantidad en céntimos es 0, tampoco se muestra.
 */
package t3c1_b.Monedas;

import java.util.ArrayList;

/**
 *
 * @author BrinCo
 */
public class TirarMoneda {
    public static void main(String[] args) {
        System.out.println("LANZADOR DE MONEDAS");
        ArrayList<Moneda> monedaLanzada = new ArrayList<Moneda>();
        int i;
        
        //lanza monedas y las guarda en un array
        int lanzada = (int)(Math.random() * 8) + 1;
        
        for(i = 0; i < lanzada; i++){
            monedaLanzada.add(new Moneda());
        }
        
        //muestra monedas
        System.out.println("Monedas lanzadas: ");
        for(i = 0; i < monedaLanzada.size(); i++){
            System.out.println("Moneda: " + (i + 1) + ": " + monedaLanzada.get(i));
        }
        
        //sumar valor monedas
        int sumaCent = 0;
        int sumaEur = 0;
        
        for (Moneda m : monedaLanzada) {
            if(m.getValorEco().equals("centimos") || (m.getValorEco().equals("centimos"))){
                sumaCent = sumaCent + m.getValorNum();
            }
            
            if(m.getValorEco().equals("euros") || (m.getValorEco().equals("euros"))){
                sumaEur = sumaEur + m.getValorNum();
            }
        }      
        
        //suma los centimos de los euros
        if(sumaCent > 99){
            sumaEur = sumaEur + (sumaCent / 100);
            sumaCent = sumaCent % 100;
        }
        
        if(sumaEur == 0){
            System.out.println("Suma " + sumaCent + " centimos");
        }else if(sumaCent == 0){
            System.out.println("Suma " + sumaEur + " euros");
        }else{
            if(sumaEur == 1){
                System.out.println("Suma " + sumaEur + " euros y " + sumaCent + " centimos");
            }else{
                System.out.println("Suma " + sumaEur + " euros y " + sumaCent + " centimos");
            }
        }
    }
}
