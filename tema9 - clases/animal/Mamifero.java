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
public class Mamifero extends Animal{
    public Mamifero(){
        super();
    }
    
    public Mamifero(Sexo s){
        super(s);
    }
    
    public void corre(){
        System.out.println("Estoy corriendo");
    }
    
    public void pelea(){
        if(this.getSexo() == Sexo.Macho){
            System.out.println("Te voy a reventar!");
        }else{
            System.out.println("No me peleo con hembras");
        }
    }
    
    public void come(){
        if(this.getkgComidaAnual()== 30){
            System.out.println("Comere doble de comida");
        }else{
            System.out.println("No comere tanto, no quiero engordar");
        }
    }
}
