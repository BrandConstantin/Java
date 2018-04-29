/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3c1_a.BarajaEspaniola;

import java.util.ArrayList;

/**
 *
 * @author BrinCo
 */
public class Baraja {
    
    private static String[] numeros = {"as","dos","tres","cuatro","cinco","seis","siete","sota","caballo","rey"};
    private static String[] palos = {"oros","bastos","copas","espadas"};

    public static ArrayList<Baraja> mezclar(ArrayList<Baraja> m1,ArrayList<Baraja> m2){
    	ArrayList<Baraja> m = new ArrayList<>();
        
        for(int i = 0; i < m2.size(); i++){
            m1.add(m2.get(i));
        }
        
        //isertar en la lista final
        for(int i = 0;  i < m1.size(); i ++){
            m.add(((int)(Math.random() * i)), m1.get(i));
        }
        
        return m;
    }
    
    private String carta;
    
    public Baraja(){
        this.carta = numeros[(int)(Math.random() * 10)] + " de palos "
                + palos[(int)(Math.random() * 4)];
    }
    
    @Override
    public String toString(){
        return carta;
    }
}
