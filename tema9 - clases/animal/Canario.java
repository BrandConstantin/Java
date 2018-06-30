/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author BrinCo
 */
public class Canario extends Ave{
    public Canario(){
        super();
    }
    
    public Canario(Sexo s){
        super(s);
    }
    
    public void canta(){
        System.out.println("TrililiuTrililiu");
    }
    
    public void come(){
        System.out.println("Comere unas pipas");
    }
    
    public void balancea(){
        System.out.println("Me voy a balancear en mi jaula");
    }
}
