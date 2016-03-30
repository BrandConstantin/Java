/*
 * Hacer media de los numeros
 */
package tema.pkg0.b.condicionales.y.bucles;
import java.util.Scanner;
/**
 *
 * @author BrinCo
 */
public class Media_Numeros {

    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        
        double num;
        double suma = 0;
        double media = 0;
        int elementos = 0;
        
        System.out.println("Introduce numeros para sumar y hacer la media " + 
                "programa acaba cuando se introduce un 0):");
        System.out.println("==================================");
        
        do{
            System.out.println("Introduce número: ");
            num = tecla.nextDouble();
            System.out.println("==================================");
            
            elementos++;
            suma += num;
        }while(num > 0);
        
        if(num < 0){
            System.out.println("No se puede hacer la media con numeros negativos");
        }else{
            media = suma / (elementos - 1);
            System.out.println("La suma de los numeros es " + media);
        }
        
    }
    
}
