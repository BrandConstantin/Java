/*
 * Una cadena de televisión nos ha encargado una aplicación para colocar a los espectadores en sus mesas
durante la gala de Nochevieja. En una mesa se pueden sentar de 0 (mesa vacía) a 4 espectadores (mesa
llena). Cuando llega un cliente se le pregunta cuántos son. De momento el programa no está preparado
para colocar a grupos mayores a 4, por tanto, si un cliente dice por ejemplo que son un grupo de 6, el
programa dará el mensaje “Lo siento, no admitimos grupos de 6, tendrán que ver la gala de pie”. Para
el grupo que llega, se busca siempre la primera mesa libre (con 0 personas). Si no quedan mesas libres,
se busca donde haya un hueco para todo el grupo, por ejemplo si el grupo es de dos personas, se podrá
colocar donde haya una o dos personas. Inicialmente, las mesas se cargan con valores aleatorios entre 0 y
4. Cada vez que se sientan nuevos espectadores se debe mostrar el estado de las mesas. Los grupos no
se pueden romper aunque haya huecos sueltos suficientes.
 */
package t1c2_b;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class GalaNocheVieja {
    public static void main(String[] args) {
          Scanner t = new Scanner (System.in);
          System.out.println("GALA NOCHE VIEJA ");
          System.out.println("-----------------------------------------------------------------------------");
          
          int i;
          int mesas = 10;
          int maxAsientos = 4;
          int comensales = 0;
          int[] mesaLibre = new int[mesas];
          
          //asignar personas a las mesas
          for(i = 0; i < mesas; i++){
            mesaLibre[i] = (int)(Math.random() * 4);
          }
          
          //se muestra las mesas y sus ocupaciones
          do{
            System.out.printf("%19s ","MESA:");
            for (i = 0; i < mesas ; i++) {
              System.out.printf("%4d ", i + 1);
            }
            
            System.out.println();
            
            System.out.printf("%19s ","COMENSALES:");
            for (i = 0; i < mesas ; i++) {
              System.out.printf("%4d ", mesaLibre[i]);
            }
            
            System.out.println(" ");
            System.out.println("-------------------------------------------------------------------");
            System.out.println("\nIntroduzca 'zero' para salir");
            System.out.print("Cuantos son? ");
            comensales = t.nextInt();
            
            int numMesa = 10;
            boolean comparteMesa;
            
            //asignar mesas
            if( comensales > maxAsientos){
              System.out.println("Lo siento no admitimos más de 4 personas, tendrán que ver la Gala de pie");
            }else{
                //asignar mesas donde estan vacias
                for (i = 0; i < mesas; i++) {
                  if ((mesaLibre[i] == 0) && (numMesa == 10)) {
                    numMesa = i + 1;
                    mesaLibre[i] += comensales;
                    System.out.println("Por favor, sientense en la mesa " + (i + 1));
                    System.out.println("----------------------------------------------------------------------------");
                    comparteMesa = true;
                  }
                }
                
                //compartir mesas
                if(mesas == 10){
                  for(i = 0; i < mesas; i++){
                    if (((mesaLibre[i] + comensales) <= 4) && (numMesa == 10)) {
                      numMesa = i + 1;
                      mesaLibre[i] += comensales;
                      comparteMesa = true;
                      System.out.println("Tendran que compartir mesa. Por favor, sientense en la mesa "+(i + 1));
                    }
                  }
                }
                
                if(comensales == 0){
                  System.out.println("Hasta pronto!");
                }
            }
            
          }while(comensales != 0);
    }
}
