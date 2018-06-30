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
public class Perro extends Mamifero{
    public Perro(Sexo s){
        super(s);
    }
    
    public Perro(){
        super(Sexo.Hembra);
    }
    
    public void ladra(){
        System.out.println("Ham Ham");
    }
    
    public void come(){
        System.out.println("Que hambre tengo");
    }
    
    public void rasca(){
        System.out.println("Malditas pulgas, que picor!");
    }
}
