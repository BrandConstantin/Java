import java.util.Scanner;
/*
 * @author costy
 * 
 * Enunciado: Haz un programa que lea tres números enteros que se corresponden
 * con una fecha día, mes y año respectivamente) y compruebe si se trata de una 
 * fecha válida. 
 * 
 */

public class ComprobarFecha {

 public static void main(String[] args) {
      
    int dia;
    int mes;
    int anno;
    String cadena;
    int diasMes;
    
    Scanner teclado = new Scanner( System.in );
    
    System.out.println("Comprobación de que la fecha introducida es correcta.");
    System.out.println("====================================================");         

    System.out.print("Introduzca el día (1-31): ");
    cadena = teclado.nextLine();
    dia = Integer.parseInt(cadena);
    System.out.print("Introduzca el mes (1-12): ");
    cadena = teclado.nextLine();
    mes = Integer.parseInt(cadena);
    System.out.print("Introduzca el mes (1-2100): ");
    cadena = teclado.nextLine();
    anno = Integer.parseInt(cadena);
    
    if (anno < 1 || anno > 2100) {
        System.out.printf ("Año incorrecto. Rango establecido para el año(1-2100).\n");
    } else if (mes < 1 || mes > 12) {
        System.out.printf ("Mes incorrecto. Fuera del rango de mes (1-12).\n");            
    } else {
      switch(mes){ 

        case 9: // septiembre 
        case 4: // abril
        case 6: // junio
        case 11:// noviembre
          diasMes= 30;
          break;

        case 2:
          if(anno % 4 == 0 && (anno % 100 != 0 || anno % 400 == 0))
            diasMes = 29;
          else
            diasMes = 28;           
          break;
            
        default:
          diasMes = 31;
      }
      if (dia < 1)
          System.err.println ("Día incorrecto!");
      else if (dia > diasMes)
          System.err.println ("Día incorrecto!");
      else 
          System.out.printf ("Fecha correcta: %02d/%02d/%04d.\n\n", dia, mes, anno);
      
    }       
 }    
}
