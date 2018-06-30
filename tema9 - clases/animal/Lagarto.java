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
public class Lagarto extends Animal{
    public Lagarto(){
        
    }
    
    public Lagarto(Sexo s){
        super(s);
    }
    
    public void broncear(){
        System.out.println("Tomare un poco de sol");
    }
    
    public void baniar(){
            System.out.println("Voy a limpiarme un poco");
    }
}
