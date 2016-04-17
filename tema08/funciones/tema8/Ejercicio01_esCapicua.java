package tema8;

import java.util.Scanner;
public class Ejercicio01_esCapicua {

    public static void main(String[] args) {
       Scanner tecla = new Scanner(System.in);

       System.out.println("Introduce un número:");
       long num = tecla.nextLong();
       
       if(funciones.VariasMate.esCapicua(num)){
           System.out.print("El número es capicua");
       }else {
           System.out.print("El número no es capicua");
       }
    }
    
}
