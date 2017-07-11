/*
 * Decir si la fecha introducida es correcta o no y pasar a fecha siguiente
 */
package tema04;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class Fecha_Siguiente {
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
        
        //pasar a fecha siguiente        
        if(dia < 31){
            //comprobar mes
            if(mes == 2){
                if(dia == 30 && mes == 2){
                    mes = 3;
                    dia = 1;
                }else if(dia == 29 && mes == 2){
                    mes = 3;
                    dia = 0;
                }else{
                    dia = 28;
                }
            }
            
            dia += 1;
        }else if(dia >= 31){
            if(dia == 31 && mes == 2){
                dia = 2;
            }
            
            dia += 1;
            mes++;
            
            if(mes >=12){
                dia = 1;
                mes = 1;
                anio++;
            }
        }
        
        System.out.println("___________________________________________________");
        System.out.println("La fecha siguiente es: ");
        System.out.print(dia + "/" + mes + "/" + anio + "\n");        
    }
}
