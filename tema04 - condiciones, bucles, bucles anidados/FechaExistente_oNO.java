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
        
        System.out.print("Introduce el dia (de 1 a 31): ");
        int dia = teclado.nextInt();
        System.out.print("Introduce el mes (de 1 a 12): ");
        int mes = teclado.nextInt();
        System.out.print("Introduce el año (en cifras): ");
        int anio = teclado.nextInt();
        
        System.out.println("-------------------------------------");
        
        int diaMes = 0;
        boolean fechaCorrecta = false;
        
        //comprobar si los valores estan en el rango correcto
        while(dia > 1 || dia <= 31){
                        //dia
                fechaCorrecta = false;
                System.out.println("Dia incorrecto!");

        }
       /* if(!fechaCorrecta){
            //fecha
            if(anio <= 0){
                fechaCorrecta = false;
                System.out.println("Añio incorrecto!");
            }
            //mes
            if(mes < 1 || mes > 12){
                fechaCorrecta = false;
                System.out.println("Mes incorrecto!");
            }
            }else{
                
            }
        }else{
            System.out.println(dia + "/" + mes + "/" + anio);
        }*/
    }
}
