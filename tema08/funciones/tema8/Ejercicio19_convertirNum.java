/*
 * Une y amplía los dos programas anteriores de tal forma que se permita 
 * convertir un número entre cualquiera de las siguientes bases: decimal, 
 * binario, hexadecimal y octal.
 */
package tema8;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class Ejercicio19_convertirNum {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Transformar número en decimal, binario, hexadeimal o octal");
        System.out.println("Introduce número decimal:");
        long num = teclado.nextInt();
        String resultado = "";
        
        System.out.println("Elige tipo conversor: ");
        System.out.println("-------------------------------------------------------");
        
        System.out.println(" 1) Binario -> Octal");
        System.out.println(" 2) Binario -> Decimal");
        System.out.println(" 3) Binario -> Hexadecimal");
        System.out.println(" 4) Octal -> Binario");
        System.out.println(" 5) Octal -> Decimal");
        System.out.println(" 6) Octal -> Hexadecimal");
        System.out.println(" 7) Decimal -> Binario");
        System.out.println(" 8) Decimal -> Octal");
        System.out.println(" 9) Decimal -> Hexadecimal");
        System.out.println("10) Hexadecimal -> Binario");
        System.out.println("11) Hexadecimal -> Octal");
        System.out.println("12) Hexadecimal -> Decimal");
        int opcion = teclado.nextInt();
        
        System.out.println("-------------------------------------------------------");
        
        if((opcion < 1) || (opcion > 12)){
            System.out.println("Elige una opcion correcta [1-12]");
        }else{
            switch (opcion) {
              case 1:
                resultado = Long.toString(funciones.VariasMate.binario_Octal(num));
                break;
              case 2:
                resultado = Long.toString(funciones.VariasMate.binario_Decimal(num));
                break;
              case 3:
                resultado = (funciones.VariasMate.binario_Hexadecimal(num));
                break;
              case 4:
                resultado = Long.toString(funciones.VariasMate.octal_Binario(num));
                break;
              case  5:
                resultado = Long.toString(funciones.VariasMate.binario_Decimal(funciones.VariasMate.octal_Binario(num)));
                break;
              case  6:
                resultado = (funciones.VariasMate.binario_Hexadecimal(funciones.VariasMate.octal_Binario(num)));
                break;
              case  7:
                resultado = Long.toString(funciones.VariasMate.decimal_Binario(num));
                break;
              case  8:
                resultado = Long.toString(funciones.VariasMate.binario_Octal(funciones.VariasMate.decimal_Binario(num)));
                break;
              case  9:
                resultado = (funciones.VariasMate.binario_Hexadecimal(funciones.VariasMate.decimal_Binario(num)));
                break;
              case 10:
                resultado = Long.toString(funciones.VariasMate.hexadecimal_Binario(num));
                break;
              case 11:
                resultado = Long.toString(funciones.VariasMate.binario_Octal(funciones.VariasMate.hexadecimal_Binario(num)));
                break;
              case 12:
                resultado = Long.toString(funciones.VariasMate.binario_Decimal(funciones.VariasMate.hexadecimal_Binario(num)));
                break;
            }
            System.out.println(resultado);
        }
    }
}
