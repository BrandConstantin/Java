/*
 * Crea un ArrayList de objetos de la clase Moneda. Las monedas se generan al azar. El número de
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
public class Moneda {
    //Atributos de clase
    public static ArrayList<Integer> valorNumerico = new ArrayList<>();
    public static ArrayList<String> valorEconomico = new ArrayList<>();
    
    //atributos de instancia
    int valorNum;
    String valorEco;
    
    //constructores
    public Moneda(){
        valorNumerico.clear();
        valorNumerico.add(1);
        valorNumerico.add(2);
        valorNumerico.add(5);
        valorNumerico.add(10);
        valorNumerico.add(20);
        valorNumerico.add(50);
        
        //tambien se podria hacer asi
        /*
        private static int sumatorio = 0;
        private static int valores[] = {1,2,5,10,25,50,100,200};
        private static String cantidades[] = {"1 centimo", "2 centimos", "5 centimos", "10 centimos", "25 centimos", "50 centimos", "1 euro", "2 euros"};
        private String cantidad;

        public Moneda() {
          int aleatorio = (int)(Math.random()*8);
          this.cantidad = cantidades[aleatorio];
          sumatorio += valores[aleatorio];
        }

        */
        
        //determina valor númerico
        int valorAleatorio = (int)(Math.random() * 6);
        this.valorNum = valorNumerico.get(valorAleatorio);
        
        //determina valor economico
        valorEconomico.clear();
        if(this.valorNum == 1){
            valorEconomico.add("centimos");
            valorEconomico.add("euros");
            
            //determina valor númerico
            valorAleatorio = (int)(Math.random() * 2);
            this.valorEco = valorEconomico.get(valorAleatorio);
        }else if(this.valorNum == 2){
            valorEconomico.add("centimos");
            valorEconomico.add("euros");
            
            //determina valor númerico
            valorAleatorio = (int)(Math.random() * 2);
            this.valorEco = valorEconomico.get(valorAleatorio);
        }else{
            this.valorEco = "centimos";
        }
    }
    
    //getters

    public static ArrayList<Integer> getValorNumerico() {
        return valorNumerico;
    }

    public static ArrayList<String> getValorEconomico() {
        return valorEconomico;
    }

    public int getValorNum() {
        return valorNum;
    }

    public String getValorEco() {
        return valorEco;
    }
    
    
    //métodos
    //lanza la moneda
    public static Moneda lanza(){
        Moneda monedaLanzada = new Moneda();
        return monedaLanzada;
    }
    
    //mostrar moneda
    @Override
    public String toString(){
        return valorNum + " " + valorEco;
    }
}
