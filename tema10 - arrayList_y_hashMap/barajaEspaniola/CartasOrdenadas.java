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
public class CartasOrdenadas implements Comparable<CartasOrdenadas>{
    private static String cara[] = {"bastos", "copas", "espadas", "oros"};
    private static String valor[] = {"as", "2", "3", "4", "5", "6", "7",
        "sota", "caballo", "rey"};
    private String c;
    private String v;
    
    public CartasOrdenadas(){
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
        return v + " de " + c;
    }
    
    @Override
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        
        if(getClass() != obj.getClass()){
            return false;
        }
        
        final CartasOrdenadas other = (CartasOrdenadas) obj;
        
        if(!Objects.equals(this.v, other.v)){
            return false;
        }
        
        if(!Objects.equals(this.c, other.c)){
            return false;
        }
        
        return true;
    }
    
    public int compareTo(CartasOrdenadas a){
        if(c.equals(a.getC())){
            return v.compareTo(a.getV());
        }else{
            return c.compareTo(a.getC());
        }
    }
}
