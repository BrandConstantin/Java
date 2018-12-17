/*
 * Decir si la fecha introducida es correcta o no
 */
package tema04;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class FechaExistente_oNO {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        boolean diaCorrecto = false;
        boolean mesCorrecto = false;
        boolean anioCorrecto = false;
        int dia;
        int mes = 0;
        int anio = 0;
        
        //dia
        System.out.print("Introduce el dia (de 1 a 31): ");
        dia = teclado.nextInt();
        
        while(dia < 1 || dia > 31){   
            diaCorrecto = false;
                
            System.out.println("Dia incorrecto!");
            System.out.print("Vuelve a introducir el dia (de 1 a 31): ");
            dia = teclado.nextInt();
        }
         
        if(dia > 1 || dia <= 31){
            diaCorrecto = true;

            //mes
            System.out.print("Introduce el mes (de 1 a 12): ");
            mes = teclado.nextInt();

            while(mes < 1 || mes > 12){
                mesCorrecto = false;

                System.out.println("Mes incorrecto!");
                System.out.print("Vuelve a introducir el mes (de 1 a 12): ");
                mes = teclado.nextInt();
            }
        }
        
        if(mes > 1 || mes <= 12){
            mesCorrecto = true;            

            //año
            System.out.print("Introduce el año: ");
            anio = teclado.nextInt();

            while(anio < 1){
                anioCorrecto = false;

                System.out.println("Anio incorrecto!");
                System.out.print("Vuelve a introducir el anio: ");
                anio = teclado.nextInt();
            }
        }
        
        System.out.println("___________________________________________________");
        System.out.println("La fecha introducida es: ");
        System.out.print(dia + "/" + mes + "/" + anio + "\n");
    }
}
