/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eurocoin;

/**
 *
 * @author BrinCo
 */
public class Moneda {
    private static String cara[] = {"cara", "cruz"};
    private static String valor[] = {"1 cent", "2 cent", "5 cent", "10 cent",
        "25 cent", "50 cent", "1 euro", "2 euros"};
    private String cantidad;
    private String posicion;
    
    public Moneda(){
        this.posicion = cara[(int)(Math.random() * 2)];
        this.cantidad = valor[(int)(Math.random() * 8)];
    }

    public String getCantidad() {
        return cantidad;
    }

    public String getPosicion() {
        return posicion;
    }
    
    public String toString(){
        return this.cantidad + " - " + this.posicion;
    }
}
