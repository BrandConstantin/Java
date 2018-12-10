/*Crea un hilo derivando de la clase Thread*/
package pkg02_crear_hilo_extendido;

/**
 *
 * @author brand
 */
public class Main extends Thread{

	/**
	 * @param args the command line arguments
	 */
	//clase  que extiende a Thread
	@Override
	public void run() {
		// se redefine el método run() con el código asociado al hilo
		System.out.println("¡Saludo desde un hilo extendiendo thread!");
	}

	public static void main(String[] args) {
		Main hilo1 = new Main();
		//se crea un objeto Thread, el hilo hilo1
		hilo1.start();
		//invoca a start() y pone en marcha el hilo hilo1
	}

}
