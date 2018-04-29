/*
 * En HTML / CSS, un color se puede indicar mediante la palabra en inglés o su código RGB. Crea un
programa que nos ayude en nuestro diseño de páginas web. El programa deberá pedir un color en
español y nos dará el correspondiente color en inglés y el código RGB. Si el color introducido no
existe, se mostrará el mensaje “Lo siento, ese color no existe”.
Ejemplo:
Por favor, introduzca un color: verde
El color verde, en inglés es Green y su código RGB es #008000.
La información se debe guardar en dos HashMap. Uno de ellos tendrá parejas clave-valor del tipo
(color español, color inglés) y otro (color español, código RGB). A continuación se muestra la tabla
de colores:
 */
package t3c1_a;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class ColoresWebs {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        
        String[] england = {"Blue","Black","Red","White","Green","Purple","Yellow","Orange","Violet"};
        String[] color = {"#0000ff","#000000","#ff0000","#ffffff","#008000","#800080","#ffff00","#ffa500","#ee82ee"};
        String[] spain = {"azul","negro","rojo","blanco","verde","morado","amarillo","naranja","rosa"};

        HashMap<String, String> espaniolIngles = new HashMap<String, String>();
        HashMap<String, String> espaniolRgb = new HashMap<String, String>();
        
        
        
        for(int i = 0; i < color.length; i++){
            espaniolIngles.put(spain[i].toLowerCase(), england[i]);
            espaniolRgb.put(spain[i].toLowerCase(), color[i].toLowerCase());
        }
        
        System.out.println("Introduzca un color: ");
        String respuesta = t.next();
        
        System.out.println("--------------------------------------------------------------------------------------");

        if(espaniolRgb.containsKey(respuesta)){
            System.out.println("El color " + respuesta + " es " 
            + espaniolIngles.get(respuesta) + " y el código RGB es " + espaniolRgb.get(respuesta));
        }else{
            System.out.println("Color inexistente!");
        }
    }
}
