/*
Implementa una función que pinte una figura por pantalla hecha con asteriscos sabiendo el nombre de
dicha figura, un dato numérico y otro parámetro que indica si está o no está rellena. La cabecera se
indica a continuación:
public static void pintaFigura(String nombreFigura, int n, boolean rellena)
El parámetro nombreFigura puede ser “piramide”, “piramide invertida” o “cuadrado”. El dato numérico
será la altura en los dos primeros casos y el lado en caso de que se pinte un cuadrado. Por ejemplo
pintaFigura(“piramide invertida”, 6, false) pintaría una pirámide invertida (con la punta
hacia abajo) hueca con una altura total de 6 pisos.
 */
package t2c2_a;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class PiramideRellenaONo {
    public static void main(String[] args) {
          Scanner t = new Scanner (System.in);
          System.out.println("FUNCION: DECIR SI LA PIRAMIDE ESTA RELLENA O NO");
          System.out.println("-----------------------------------------------------------------------------");
          
          System.out.println("Especifica el tipo de figura que quieres que se dibuje (en minusculas):");
          String nombreFigura = t.nextLine();
          System.out.println("Especifica la altura de la figura");
          int n = t.nextInt();
          System.out.println("Especifica si la figura es rellena o no");
          System.out.println("1. Si");
          System.out.println("2. No");
          int opcion = t.nextInt();
          System.out.println("---------------------------------------------------------------------------------");
          
          boolean rellena = false;
          
          if(opcion == 1){
            rellena = true;
          }else{
            rellena = false;
          }
          
          pintaFigura(nombreFigura, n, rellena);
    }
    
    //función
    public static void pintaFigura(String nombreFigura, int n, boolean rellena){
          //piramide rellena
          if((nombreFigura.equals("piramide")) && (rellena)) {
            int x = 0;
            int altInicial= n;
            int h = 0;
            int i = altInicial - (n - h);
            
            while (n > 0) {
              do {
                System.out.print(" ");
                x++;
              } while (x < n);
              x = 0;
              while (i >= 0) {
                System.out.print("*");
                i--;
              }
              
              System.out.println();
              
              n--;
              h++;
              i = altInicial - (n - h);
            }
        }
        
          //piramide hueca
        if((nombreFigura.equals("piramide")) && (!rellena)) {
            int altura = 1;
            int espacios = n - 1;
            int i = 0;
            int j = 0;
            int relleno = 0;

            while (altura < n) {
              for (i = 1; i <= espacios; i++) {
                System.out.print(" ");
              }
              
              System.out.print("*");
              
              for (i = 1; i < relleno; i++) {
                System.out.print(" ");
              }
              
              if (altura > 1) {
                System.out.print("*");
              }

              System.out.println();
              espacios--;
              altura++;
              relleno = relleno + 2;;
            }
            
            for (i = 1; i < (n * 2); i++) {
              System.out.print("*");
            }
        }
        
        //cuadrado relleno
        if((nombreFigura.equals("cuadrado")) && (rellena)) {
            for(int x = 0; x < n; x++){
                for(int i = 0; i < n; i++){
                    System.out.print("* ");
                }
                
                System.out.println();
            }
        }
        
        //cuadrado hueco
        if((nombreFigura.equals("cuadrado")) && (!rellena)) {
            for(int x = 0; x < n; x++){
                for(int i = 0; i < n; i++){
                    if(x==0) {
                        System.out.print("* ");
                    } else if(x==n-1) {
                        System.out.print("* ");
                    } else if((i==0)||(i==n-1)) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                
                System.out.println();
            }
        }
        
        //piramide invertida rellena
        if((nombreFigura.equals("piramide invertida")) && (rellena)) {
            int altura = 1;
            int espacios = 1;
            int i = 1;
            int relleno = n + (n -1);
            
          while (altura <= (n)) {
            for (i = 1; i < espacios; i++) {
              System.out.print(" ");
            }
            
            for (i = 1; i <= relleno; i++) {
              System.out.print("*");
            }
            
            System.out.println();
            espacios++;
            altura++;
            relleno = relleno - 2;
          }
        }
        
        //piramide invertida hueca
        if((nombreFigura.equals("piramide invertida")) && (!rellena)) {
            int altura = 1;
            int espacios = 1;
            int i = 1;
            int relleno = n + (n -1);
            int hueco = relleno - 2;
            
          while (altura <= (n)) {   //pinta la parte de arriba
            for (i = 1; i < espacios; i++) {
              System.out.print(" ");
            }
            
            System.out.print("*");
            
            for (int j=1; j <= hueco; j++) {
              if (altura == 1) {
                System.out.print("*");
              } else {
                System.out.print(" ");
              }
            }
            
            if (altura < n) {
              System.out.print("*");
            }
            
            System.out.println();
            
            espacios++;
            altura++;
            relleno = relleno - 2;
            hueco = hueco - 2;
          }
        }
    }
}
