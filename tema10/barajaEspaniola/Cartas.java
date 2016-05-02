/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barajaEspaniola;
import java.util.Objects;
/**
 *
 * @author BrinCo
 */
public class Cartas {
    private static String cara[] = {"bastos", "copas", "espadas", "oros"};
    private static String valor[] = {"as", "2", "3", "4", "5", "6", "7",
        "sota", "caballo", "rey"};
    private String c;
    private String v;
    
    public Cartas(){
        this.c = cara[(int)(Math.random() * 4)];
        this.v = valor[(int)(Math.random() * 10)];
    }

    public String getC() {
        return c;
    }

    public String getV() {
        return v;
    }
    
    @Override
    public String toString(){
        return this.v + " de " + this.c;
    }
    
    @Override
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        
        if(getClass() != obj.getClass()){
            return false;
        }
        
        final Cartas other = (Cartas) obj;
        
        if(!Objects.equals(this.v, other.v)){
            return false;
        }
        
        if(!Objects.equals(this.c, other.c)){
            return false;
        }
        
        return true;
    }
}
