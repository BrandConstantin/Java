/**
 * Escribe un programa que dada una hora determinada (horas y minutos), 
 * calcule los segundos que faltan para llegar a la medianoche.
 * 
 * @author costy
 */

public class Ejer11 {
  public static void main(String[] args) {   
  
       
    System.out.println("Dime la hora que es de 1 a 24");
    int hora = Integer.parseInt(System.console().readLine());
    
    int horasRestante = 1;
    
    if (hora >= 1 && hora < 24){
		horasRestante = 24 - hora;
		System.out.println("Quedan solo " + horasRestante + " horas " +
		           "restantes");
     } else {
		System.out.println("Hora incorrecta!"); 
	}
	
	System.out.println("Dime los minutos que son de 1 a 60");
    int minut = Integer.parseInt(System.console().readLine());
    
    int minutRestante = 1;
    
    if (minut >= 1 && minut < 60){
		minutRestante = 60 - minut;
		System.out.println("Quedan solo " + minutRestante + " minutos " +
		           "restantes");
     } else {
		System.out.println("Minutos fuera de rango"); 
	}
	System.out.println("Esto significa que quedan " + 
	  (horasRestante * 60) * 60 + " segundos hasta media noche");
  }
}
