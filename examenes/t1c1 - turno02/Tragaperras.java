/*
 * Realiza un simulador de máquina tragaperras simplificada que cumpla los siguientes requisitos:
a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5 figuras posibles:
corazón, diamante, herradura, campana y limón.
b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento, ha perdido”.
c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien, ha recuperado su
moneda”.
d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado 10 monedas”.
Ejemplo 1:
diamante diamante limón
Bien, ha recuperado su moneda
Ejemplo 2:
herradura campana diamante
Lo siento, ha perdido
Ejemplo 3:
corazón corazón corazón
Enhorabuena, ha ganado 10 monedas
 */
package t1c1_turno2;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class Tragaperras {
  public static void main(String[] args) {
      Scanner t = new Scanner (System.in);
      System.out.println("TRAGAPERRAS");
      System.out.println("-----------------------------------------------------------------------------");
      
      int primerasFiguras = (int)(Math.random() * 5);
      String figuraUno = "";

      switch(primerasFiguras){
        case 0:
          figuraUno = "corazon";
          break;
        case 1:
          figuraUno = "diamante";
          break;
        case 2:
          figuraUno = "herradura";
          break;
        case 3:
          figuraUno = "campana";
          break;
        case 4:
          figuraUno = "limon";
          break;
      }

      int segundasFiguras = (int)(Math.random() * 5);
      String figuraDos = "";

      switch(segundasFiguras){
        case 0:
          figuraDos = "corazon";
          break;
        case 1:
          figuraDos = "diamante";
          break;
        case 2:
          figuraDos = "herradura";
          break;
        case 3:
          figuraDos = "campana";
          break;
        case 4:
          figuraDos = "limon";
          break;
      }
      
      int tercerasFiguras = (int)(Math.random() * 5);
      String figuraTres = "";

      switch(tercerasFiguras){
        case 0:
          figuraTres = "corazon";
          break;
        case 1:
          figuraTres = "diamante";
          break;
         case 2:
          figuraTres = "herradura";
          break;
        case 3:
          figuraTres = "campana";
          break;
       case 4:
          figuraTres = "limon";
          break;
      }

      //Muestra tiradas
      System.out.println(figuraUno + "||" + figuraDos + "||" + figuraTres);

      //comprobar si son iguales
      if((figuraUno != figuraDos) && (figuraUno != figuraTres) &&(figuraDos != figuraTres)){
        System.out.println("Lo siento has perdido todo");
      }else if((figuraUno.equals(figuraDos)) && (figuraDos.equals(figuraTres))){
        System.err.println("Has ganado 10 monedas!");
      }else if((figuraUno == figuraDos) || (figuraUno == figuraTres) || (figuraDos == figuraTres)){
        System.out.println("Has recuperado tu moneda");
      }
  }
}
