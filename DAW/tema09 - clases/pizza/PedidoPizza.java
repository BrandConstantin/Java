/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;

/**
 *
 * @author BrinCo
 */
public class PedidoPizza {
    public static void main(String[] args) {
        Pizza p1 = new Pizza("margarita", "\tmediana");
        Pizza p2 = new Pizza("funghi", "\tfamiliar");
        p2.sirve();
        Pizza p3 = new Pizza("cuatro quesos", "\tmediana");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        p2.sirve();
        System.out.println("Pedidas: " + Pizza.getTotalPedidas());
        System.out.println("Servidas: " + Pizza.getTotalServidas());
    }
}
