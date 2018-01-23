package Practice_3;

import java.util.Scanner;

/*
 * Un autob�s lleva 45 personas. El colegio solo utilizar� el autob�s si puede llenarlo del todo. El resto de personas ir�
 * en furgonetas. Escriba un programa que registre el n�mero de personas que se han apuntado para ir de viaje.
 * Haga que el programa muestre el n�mero necesario de autobuses y, despu�s, el n�mero total de personas que
 * tendr� que viajar en furgonetas 
 */

public class Practice_03 {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		
		//numPersonas 45
		int numAutobuses;
		int numFurgonetas;
		int plazasOcupadasFurgo;
		
		//pide el n�mero de personas que se han inscrito para el viaje		
		System.out.println("Cuantas personas van de viaje? ");
		int numPersonas = t.nextInt();
		
		if(numPersonas <= 45) {
			System.out.println("Vais a necesitar un solo autobus");
		}else {	//mostrar n�mero total de autobuses y las personas que ir�n en furgoneta
			
			//si se vuelve a llenar de 45 personas se vuelve a pedir un autobus
			numAutobuses = numPersonas / 45;
			System.out.println("Se necesitar�n " + numAutobuses + " autobuses.");
			
			//si se llena va un autobus si hay m�s de 45 personas ir�n en furgonetas de 12 personas
			int personasRestantes = numPersonas % 45;
			System.out.println("Quedan un total de " + personasRestantes + " personas restantes que se repartiran: ");
			
			if(personasRestantes <= 12) {
				System.out.println("En una furgoneta caben 12 personas");
			}else {
				//se meter�n 12 en una furgoneta y el resto de personas en otra furgoneta
				System.out.println("Iran 12 en una furgoneta.");
				
				int dividirPersonasFurgo = personasRestantes - 12;
				System.out.println("Y en una segunda furgoneta ir�n " + dividirPersonasFurgo);
			}
			
		}
	}
	
	public static int NumPersonas() {
		int numPersonas = 45;
		
		return numPersonas;
	}
}
