/*
 * Mostrar la diferencia de días que hay de una fecha a otra
 */
package tema.pkg0.a;
import java.util.Scanner;
/**
 *
 * @author BrinCo
 */
public class DiferenciaDias {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Para un buen resultado introduce la FECHA 2 > FECHA 1");
        
        System.out.println("FECHA 1");
        System.out.print("Introduce el dia (de 1 a 31): ");
        int dia1 = teclado.nextInt();
        System.out.print("Introduce el mes (de 1 a 12): ");
        int mes1 = teclado.nextInt();
        System.out.print("Introduce el año (en cifras): ");
        int anio1 = teclado.nextInt();
        
        System.out.println("FECHA 2");
        System.out.print("Introduce el dia (de 1 a 31): ");
        int dia2 = teclado.nextInt();
        System.out.print("Introduce el mes (de 1 a 12): ");
        int mes2 = teclado.nextInt();
        System.out.print("Introduce el año (en cifras): ");
        int anio2 = teclado.nextInt();
       
        System.out.println("-------------------------------------");
        
        int diaMes = 0;
        boolean fechaCorrecta = false;
        
        //comprobar si los valores están en el rango correcto de la fecha 1
        if(anio1 == 0){
            fechaCorrecta = false;
            System.out.println("Año inexistente!");
        }else if(mes1 < 1 || mes1 > 12){
            fechaCorrecta = false;
            System.out.println("Mes inexistente!");
        }else if(dia1 < 1 || dia1 > 31){
            fechaCorrecta = false;
            System.out.println("Dia inexistente!");
        }
        //comprobar si los valores están en el rango correcto de la fecha 2
        if(anio2 == 0){
            fechaCorrecta = false;
            System.out.println("Año inexistente!");
        }else if(mes2 < 1 || mes2 > 12){
            fechaCorrecta = false;
            System.out.println("Mes inexistente!");
        }else if(dia2 < 1 || dia2 > 31){
            fechaCorrecta = false;
            System.out.println("Dia inexistente!");
        }
        
        //comprobar dia del mes
        if(mes1 == 2 || mes2 == 2){
            diaMes = 28;
        }else if((mes1 == 4 || mes1 == 6 || mes1 == 9 || mes1 == 11) ||
                 (mes2 == 4 || mes2 == 6 || mes2 == 9 || mes2 == 11)){
            diaMes = 30;
        } else {
            diaMes = 31;
        }
        
        //calculamos diferencia
        int difereciaDias = ((dia2 - dia1) + (30 * (mes2 - mes1)) + (anio2 - anio1));
        System.out.println("La diferencia de dias es de: " + difereciaDias);
    }
    
}
