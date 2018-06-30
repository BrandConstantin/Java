/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise;

import java.util.Scanner;

/**
 *
 * @author brand
 */
public class Ex05_contarDigitos {
  public static void main(String[] args) {   

    Scanner tecla = new Scanner(System.in);
    
    System.out.println("CONTAR DIGITOS DE UN NUMERO");
    System.out.println("============================================");

    System.out.println("Escribe un numero y te digo de cuantos digitos esta formado");
    int num = tecla.nextInt();
        
    System.out.println("El numero tiene " + functions.Functions2.digitos(num) + " digitos");

  }    
}
