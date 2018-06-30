package tema05;

/**
 *
 * @author BrandConstantin
 *
 */
import java.util.Scanner;

public class Arbol_Navidad2 {
    public static void main(String[] args) {
        
        Scanner datos = new Scanner(System.in);

        System.out.print("Introduzca la altura del arbol:\n ");
        int alturaIntrod = datos.nextInt();
        System.out.print("Dibuja bombillas en el arbol:\n");
        String bombilla = datos.next();
        System.out.print("===================================================================\n");
        
        int i;
        int altura = 1;
        int espaciosPorDelante = alturaIntrod - 1;
        int espaciosInternos = 0;
        String caracter = "#";

        while (altura < alturaIntrod) {
            //espacios ante de la piramide
            for (i = 1; i <= espaciosPorDelante; i++){
              System.out.print(" "); 
            }
            
            System.out.print(caracter);
           
            int adorno = (int)(Math.random() * espaciosInternos);
            
            for (i = 1; i < espaciosInternos; i++) {
                    if (i == adorno) {
                            System.out.print(bombilla);
                    }else{
                            System.out.print(" ");
                    }   
            }
            
            if (altura > 1){
                System.out.print(caracter);
            }

            System.out.println();
            altura++;
            espaciosPorDelante--;
            espaciosInternos += 2;
        } 
        
        //la base de la piramide
        for (i = 1; i < (altura * 2); i++){
             System.out.print(caracter);
        }
    }
}
