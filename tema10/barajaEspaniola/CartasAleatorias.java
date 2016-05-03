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
public class CartasAleatorias implements Comparable<CartasAleatorias>{
    private static String valor[] = {"as", "2", "3", "4", "5", "6", "7",
        "sota", "caballo", "rey"};
    private static String cara[] = {"bastos", "copas", "espadas", "oros"};
    private Integer v;
    private String c;
    private String figura;
    
    public CartasAleatorias(){
        this.v = (int)(Math.random() * 10);
        this.c = cara[(int)(Math.random() * 4)];
    }
    
    public Integer getV() {
        return v;
    }
    
    public String getFigura() {
        return valor[v];
    }
    
    public String getC() {
        return c;
    }

    @Override
    public String toString(){
        return this.valor[v] + " de " + this.c;
    }
    
    @Override
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        
        if(getClass() != obj.getClass()){
            return false;
        }
        
        final CartasAleatorias other = (CartasAleatorias) obj;
        
        if(!Objects.equals(this.v, other.v)){
            return false;
        }
        
        if(!Objects.equals(this.c, other.c)){
            return false;
        }
        
        return true;
    }
    
    @Override
    public int compareTo(CartasAleatorias a){
        if(c.equals(a.getC())){
            return v.compareTo(a.getV());
        }else{
            return c.compareTo(a.getC());
        }
    }
}
