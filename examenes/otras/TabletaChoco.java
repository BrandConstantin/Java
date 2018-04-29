/*
 * Realiza un programa que pinte una tableta de chocolate a la que le han dado unos cuantos bocados.
La tableta se representa mediante un rectángulo hecho del símbolo #. Los bocados se representan
con espacios en blanco. La probabilidad de que una pastilla de chocolate (un #) esté comida es de 1
entre 5. Las dimensiones de la tableta se deben pedir por teclado.
Ejemplo:
Introduzca la anchura de la tableta de chocolate: 6
Introduzca la altura: 4
## ###
# ###
######
### #
 */
package repesca_2016;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class TabletaChoco {
    public static void main(String[] args) {
        
        Scanner s = new Scanner (System.in);
        System.out.println("Por favor introduzca la longitud de la tableta de chocolate: ");
        int altura = s.nextInt();
        
        String caracter = " ";
                
        for(int i = 0; i < altura; i++){
            for (int j = 0; j < (altura / 2); j++){
                switch( (int)(Math.random()*5) ){
                    case 0: caracter = "# "; break;
                    case 1: caracter = "# "; break;
                    case 2: caracter = "# "; break;
                    case 3: caracter = "# "; break;
                    case 4: caracter = " "; break;
                }
                System.out.print(caracter);
            }
            System.out.println();
        }
    }
}
