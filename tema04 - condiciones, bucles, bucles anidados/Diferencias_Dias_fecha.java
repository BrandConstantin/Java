/*
 * Mostrar la diferencia de días que hay de una fecha a otra
 */
package tema04;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class Diferencias_Dias_fecha {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);    
        
        System.out.println("Para un buen resultado introduce la FECHA 2 > FECHA 1");
        
        System.out.println("FECHA 1");
        boolean diaCorrecto1 = false;
        boolean mesCorrecto1 = false;
        boolean anioCorrecto1 = false;
        int dia1;
        int mes1 = 0;
        int anio1 = 0;
        
        //dia2
        System.out.print("Introduce el dia (de 1 a 31): ");
        dia1 = teclado.nextInt();
        
        while(dia1 < 1 || dia1 > 31){   
            diaCorrecto1 = false;
                
            System.out.println("Dia incorrecto!");
            System.out.print("Vuelve a introducir el dia (de 1 a 31): ");
            dia1 = teclado.nextInt();
        }
         
        if(dia1 > 1 || dia1 <= 31){
            diaCorrecto1 = true;

            //mes2
            System.out.print("Introduce el mes (de 1 a 12): ");
            mes1 = teclado.nextInt();

            while(mes1 < 1 || mes1 > 12){
                mesCorrecto1 = false;

                System.out.println("Mes incorrecto!");
                System.out.print("Vuelve a introducir el mes (de 1 a 12): ");
                mes1 = teclado.nextInt();
            }
        }
        
        if(mes1 > 1 || mes1 <= 12){
            mesCorrecto1 = true;            

            //año
            System.out.print("Introduce el año: ");
            anio1 = teclado.nextInt();

            while(anio1 < 1){
                anioCorrecto1 = false;

                System.out.println("Anio incorrecto!");
                System.out.print("Vuelve a introducir el anio: ");
                anio1 = teclado.nextInt();
            }
        }
        
        System.out.println("FECHA 2");
        boolean diaCorrecto2 = false;
        boolean mesCorrecto2 = false;
        boolean anioCorrecto2 = false;
        int dia2;
        int mes2 = 0;
        int anio2 = 0;
        
        //dia2
        System.out.print("Introduce el dia 2 (de 1 a 31): ");
        dia2 = teclado.nextInt();
        
        while(dia2 < 1 || dia2 > 31){   
            diaCorrecto2 = false;
                
            System.out.println("Dia incorrecto!");
            System.out.print("Vuelve a introducir el dia 2 (de 1 a 31): ");
            dia2 = teclado.nextInt();
        }
         
        if(dia2 > 1 || dia2 <= 31){
            diaCorrecto2 = true;

            //mes2
            System.out.print("Introduce el mes 2 (de 1 a 12): ");
            mes2 = teclado.nextInt();

            while(mes2 < 1 || mes2 > 12){
                mesCorrecto2 = false;

                System.out.println("Mes incorrecto!");
                System.out.print("Vuelve a introducir el mes 2 (de 1 a 12): ");
                mes2 = teclado.nextInt();
            }
        }
        
        if(mes2 > 1 || mes2 <= 12){
            mesCorrecto2 = true;            

            //año
            System.out.print("Introduce el año: ");
            anio2 = teclado.nextInt();

            while(anio2 < 1){
                anioCorrecto2 = false;

                System.out.println("Anio incorrecto!");
                System.out.print("Vuelve a introducir el anio 2: ");
                anio2 = teclado.nextInt();
            }
        }
       
        System.out.println("-------------------------------------");
        
        //pasar a fecha siguiente        
        if(dia1 < 31){
            //comprobar mes
            if(mes1 == 2){
                if(dia1 == 30 && mes1 == 2){
                    mes1 = 3;
                    dia1 = 1;
                }else if(dia1 == 29 && mes1 == 2){
                    mes1 = 3;
                    dia1 = 0;
                }else{
                    dia1 = 28;
                }
            }
            
            dia1 += 1;
        }else if(dia1 >= 31){
            if(dia1 == 31 && mes1 == 2){
                dia1 = 2;
            }
            
            dia1 += 1;
            mes1++;
            
            if(mes1 >=12){
                dia1 = 1;
                mes1 = 1;
                anio1++;
            }
        }
        
        //calculamos la diferencia
        int diferenciaAnios = anio2 - anio1;
        int diferenciaMeses = mes2 - mes1;
        int diferenciaDias = dia2 - dia1;
        
        int diferenciaDeMeses = (diferenciaAnios * 12) + (diferenciaMeses);
        int diferenciasDeDias = (diferenciaDeMeses * 30) + diferenciaDias;
        System.out.println(diferenciasDeDias);
    }
}