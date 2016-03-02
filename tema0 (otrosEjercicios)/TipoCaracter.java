/*
 * Haz un programa que lea un carácter por teclado y nos diga si el carácter leído es una letra mayúscula,
 * una letra minúscula, un dígito, o ninguno de los anteriores (otro tipo de carácter). Si se desea, se puede leer un 
 * String de una letra, o incluso leer un String cualquiera, y fijarse  sólo en el  primer carácter del mismo. 
 *
 * @author costy
 */
import java.util.Scanner;
public class TipoCaracter {

    public static void main(String[] args) {

        char letra;

        Scanner teclado = new Scanner( System.in );

        System.out.print ("Introduzca un carácter: ");        
        letra = teclado.nextLine().charAt(0);

        if(Character.isUpperCase(letra)){
            System.out.println("El carácter introducido es una mayúscula");
        } else {
            if(Character.isLowerCase(letra)){
                System.out.println("El carácter introducido es una minúscula");
            } else {
                if(Character.isDigit(letra)){
                    System.out.println("El carácter introducido es un dígito");
                } else{
                    System.out.println("El carácter introducido NO es una letra mayúscula, ni una minúscula, ni un dígito.");
                }
            }
        }          
    } 
}

