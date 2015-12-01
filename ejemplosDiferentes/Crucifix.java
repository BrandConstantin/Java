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
        
        int j;
        int i;
        
        System.out.println( "Introduce la longitud del brazo de la cruz:");
        int num = dato.nextInt();
        System.out.println( "=================================================================");

        for(i = 0; i <= num; i++){
            if(i == num){
                int simbolo = (num * 2) + 1;
                for(j = 0; j < simbolo; j++){
                   System.out.print("#") ;
                }
            } else {
                for(j = 0; j < num; j++){
                System.out.print(" ") ;
                }
                 System.out.println("%") ;
             }	
        }
        System.out.println() ;
        for(i = 0; i < num; i++){
             for(j = 0; j < num; j++)
             System.out.print(" ") ;	
              System.out.println("@") ;

        }
    }
}
