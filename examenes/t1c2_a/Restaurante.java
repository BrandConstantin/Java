/*
 * Un restaurante nos ha encargado una aplicación para colocar a los clientes en sus mesas. En una mesa se
pueden sentar de 0 (mesa vacía) a 4 comensales (mesa llena). Cuando llega un cliente se le pregunta
cuántos son. De momento el programa no está preparado para colocar a grupos mayores a 4, por tanto, si
un cliente dice por ejemplo que son un grupo de 6, el programa dará el mensaje “Lo siento, no admitimos
grupos de 6, haga grupos de 4 personas como máximo e intente de nuevo”. Para el grupo que llega,
se busca siempre la primera mesa libre (con 0 personas). Si no quedan mesas libres, se busca donde
haya un hueco para todo el grupo, por ejemplo si el grupo es de dos personas, se podrá colocar donde
haya una o dos personas. Inicialmente, las mesas se cargan con valores aleatorios entre 0 y 4. Cada vez
que se sientan nuevos clientes se debe mostrar el estado de las mesas. Los grupos no se pueden romper
aunque haya huecos sueltos suficientes.
 */
package t1c2_a;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class Restaurante {
     public static void main(String[] args) {
          Scanner t = new Scanner (System.in);
          System.out.println("RESTAURANTE ");
          System.out.println("-----------------------------------------------------------------------------");
          
          int numComensales = 4; 
          int[] mesas = new int[10];
          boolean ocupada = false;
                     
          //mostrar mesas
          System.out.print("Mesas:      ");
          for(int i = 0; i < mesas.length; i++){
            System.out.print("|" + (i + 1) + "|");
          }
          
          System.out.println();
          //rellenar las mesas aleatoriamente         
          System.out.print("Comensales: ");
          for(int i = 0; i < mesas.length; i++){
            mesas[i] = (int)(Math.random() * 5);
            System.out.print("|" + mesas[i] + "|");
          }
          
          int personas = 0;
          
          //añadir personas a las mesas
          System.out.println("\n----------------------------------------------------------------------");
          System.out.println("AÑADIR PERSONAS EN LAS MESAS");
          System.out.println("Pulse 0 para salir!!");
          System.out.println("-----------------------------------------------------------------------");
          
          do{
            System.out.println("\nCuantas personas sois? ");
            personas = t.nextInt();
            ocupada = false;
            
            if(personas > 4){
              System.out.println("Lo siento, grupos de más de 4 personas no acceptamos!");
            }else{
                if(personas == 4){
                  System.out.print("Sientase en la mesa: ");
                  int i = 0; 
                  while(!ocupada && mesas[i] < 10){
                    if(mesas[i] == 0){
                      System.out.print((i + 1) + "|\n");
                      ocupada = true;
                      mesas[i] += 4;
                    }
                    i++;
                  }
                  
                }
                if(personas == 3){
                  System.out.print("Sientase en la mesa: ");
                  int i = 0; 
                  while(!ocupada && mesas[i] < 10){
                    if(mesas[i] < 2){
                      System.out.print((i + 1) + "|\n");
                      ocupada = true;
                      mesas[i] += 3;
                    }
                    i++;
                  }
                }
                
                if(personas == 2){
                  System.out.print("Sientase en la mesa: ");
                  int i = 0; 
                  while(!ocupada && mesas[i] < 10){
                    if(mesas[i] < 3){
                      System.out.print((i + 1) + "|\n");
                      ocupada = true;
                      mesas[i] += 2;
                    }
                    i++;
                  }
                }
                
                if(personas == 1){
                  System.out.print("Sientase en la mesa: ");
                  int i = 0; 
                  while(!ocupada && mesas[i] < 10){
                    if(mesas[i] < 4){                    
                      System.out.print((i + 1) + "|\n");
                      ocupada = true;
                      mesas[i] += 1;
                    }
                    i++;
                  }
                }
                
                System.out.println("-------------------------------------------------------------");
                System.out.print("Mesas:      ");
                for(int i = 0; i < mesas.length; i++){
                  System.out.print("|" + (i + 1) + "|");
                }

                System.out.println();
                //rellenar las mesas aleatoriamente         
                System.out.print("Comensales: ");
                for(int i = 0; i < mesas.length; i++){
                  System.out.print("|" + mesas[i] + "|");
                }
            }
          }while(personas != 0);
     }
}
