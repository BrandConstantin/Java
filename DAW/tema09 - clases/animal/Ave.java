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
public class Ave extends Animal{
    public Ave(){
        super(Sexo.Macho);
    }
    
    public Ave(Sexo s){
        super(s);
    }
    
    public void pelea(){
        if(this.getSexo() == Sexo.Macho){
            System.out.println("Te voy a arrancar las plumas!");
        }else{
            System.out.println("No me peleo con hemras!");
        }
    }
    
    public void vuela(){
        System.out.println("Voy a volar");
    }
    
    public void duerme(){
        System.out.println("Quiero dormir");
    }
}
