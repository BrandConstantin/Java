package Practice_3;

import java.util.Scanner;

/*
 * Un autobús lleva 45 personas. El colegio solo utilizará el autobús si puede llenarlo del todo. El resto de personas irá
 * en furgonetas. Escriba un programa que registre el número de personas que se han apuntado para ir de viaje.
 * Haga que el programa muestre el número necesario de autobuses y, después, el número total de personas que
 * tendrá que viajar en furgonetas 
 */

public class Practice_03 {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		
		//numPersonas 45
		int numAutobuses;
		int numFurgonetas;
		int plazasOcupadasFurgo;
		
		//pide el número de personas que se han inscrito para el viaje		
		System.out.println("Cuantas personas van de viaje? ");
		int numPersonas = t.nextInt();
		
		if(numPersonas <= 45) {
			System.out.println("Vais a necesitar un solo autobus");
		}else {	//mostrar número total de autobuses y las personas que irán en furgoneta
			
			//si se vuelve a llenar de 45 personas se vuelve a pedir un autobus
			numAutobuses = numPersonas / 45;
			System.out.println("Se necesitarán " + numAutobuses + " autobuses.");
			
			//si se llena va un autobus si hay más de 45 personas irán en furgonetas de 12 personas
			int personasRestantes = numPersonas % 45;
			System.out.println("Quedan un total de " + personasRestantes + " personas restantes que se repartiran: ");
			
			if(personasRestantes <= 12) {
				System.out.println("En una furgoneta caben 12 personas");
			}else {
				//se meterán 12 en una furgoneta y el resto de personas en otra furgoneta
				System.out.println("Iran 12 en una furgoneta.");
				
				int dividirPersonasFurgo = personasRestantes - 12;
				System.out.println("Y en una segunda furgoneta irán " + dividirPersonasFurgo);
			}
			
		}
	}
	
	public static int NumPersonas() {
		int numPersonas = 45;
		
		return numPersonas;
	}
}
