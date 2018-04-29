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
public class Pinguino extends Ave{
    public Pinguino(){
        
    }
    
    public Pinguino(Sexo s){
        super(s);
    }
    
    public void corre(){
        System.out.println("No me gusta correr mucho");
    }
    
    public void nada(){
        System.out.println("Me encanta nadar");
    }
    
    public void gusta(){
        System.out.println("Me gusta los sitios con mucho frio");
    }
}
