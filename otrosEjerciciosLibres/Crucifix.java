/* *
* 
* Escribe un programa que dibuje una cruz introduciendo por teclado el numero de asteriscos
* que tenga el brazo de la cruz.
*
* 
* @author costy
*
*/
import java.util.Scanner;

public class Crucifix{
    public static void main( String [] args ) {
    
        Scanner dato = new Scanner(System.in);
        
        System.out.println( "Introduce la longitud del brazo de la cruz:");
        int num = dato.nextInt();
        String line;
        String espacio = " ";

        for(int i = 0; i <= num; i++){
             if(i == num){
                 int ast= (num * 2) + 1;
                 for(int j = 0; j < ast; j++)
                 System.out.print("@") ;
             } else {
                 for(int j = 0; j < num; j++)
                 System.out.print(espacio) ;	
                 System.out.println("@") ;
              }	
        }
        System.out.println() ;
        for(int i = 0; i < num; i++){
             for(int j = 0; j < num; j++)
             System.out.print(espacio) ;	
             System.out.println("@") ;

        }
    }
}
