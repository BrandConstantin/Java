/*
 * Decir si la fecha introducida es correcta o no
 */
package tema04;
import java.util.Scanner;
/**
 *
 * @author BrindConstantin
 */
public class Fecha_Siguiente_b {

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
        
        //comprobar si los valores están en el rango correcto
        if(anio == 0){
            fechaCorrecta = false;
            System.out.println("Año inexistente!");
        }else if(mes < 1 || mes > 12){
            fechaCorrecta = false;
            System.out.println("Mes inexistente!");
        }else if(dia < 1 || dia > 31){
            fechaCorrecta = false;
            System.out.println("Dia inexistente!");
        }else{
            System.out.println(dia + "/" + mes + "/" + anio + "    \tEs una fecha correcta!");
        }
        
        //comprobar dia del mes
        if(mes == 2){
            diaMes = 28;
        }else if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
            diaMes = 30;
        } else {
            diaMes = 31;
        }
        
        //añadir un dia de más 
        
        //incrementamos con un dia
        dia++;
        
        //si el dia es 31 los pasamos al 1 del mes
        if(dia >= 31){
            dia = 1;
            mes++;
            
            if(mes >= 12){
                mes = 1;
                anio++;
            }
        }
        System.out.println(dia + "/" + mes + "/" + anio + "    \tEs la fecha siguiente!");
    }
    
}