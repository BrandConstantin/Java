package tema06;

import java.util.Scanner;

public class Adornos_Navidad{    
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        
        System.out.print("INTRUDUZCA ALTURA DEL ARBOL: ");
        int alturaIntrod = datos.nextInt();
        System.out.print("INTRODUZCA CARACTER A DIBUJAR EL ARBOL: ");
        String relleno = datos.next();
        System.out.print("INTRODUZCA CARACTER A DIBUJAR LOS GLOBITOS: ");
        String globito = datos.next();
        System.out.print("===================================================================");

        int i;
        int altura = 1;
        int espaciosPorDelante = alturaIntrod - 1;
        int espaciosInternos = 0;

        while (altura < alturaIntrod) {
            //espacios ante de la piramide
            for (i = 1; i <= espaciosPorDelante; i++){
              System.out.print(" "); 
            }
            
            System.out.print(relleno);
           
            int adorno = (int)(Math.random() * espaciosInternos);
            
            for (i = 1; i < espaciosInternos; i++) {
                    if (i == adorno) {
                            System.out.print(globito);
                    }else{
                            System.out.print(" ");
                    }   
            }
            
            if (altura > 1){
                System.out.print(relleno);
            }

            System.out.println();
            altura++;
            espaciosPorDelante--;
            espaciosInternos += 2;
        } 
        
        //la base de la piramide
        for (i = 1; i < (altura * 2); i++){
             System.out.print(relleno);
        }

        espaciosPorDelante = alturaIntrod - 1;
        altura = 1;

        while (altura <  (alturaIntrod / 2)) {
            System.out.println();
            
            for (i = alturaIntrod; i <= espaciosPorDelante + 1; i++){
                    System.out.print("      " + relleno + relleno + relleno);
            }
            
            altura++;
        }		
    }
}