/** ****************************************************************************
 * el hilo principal de esta aplicación, crea dos nuevos hilos con un punto
 * de sincronización tipo Exchanger
 *
 * el denominado hilo productor se encarga de rellenar una cadena de diez
 * caracteres (o lista de 10 caracteres)
 *
 * el denominado hilo consumidor imprime esa lista
 *
 * dejaremos que ambos hilos funcionan alrededor de un segundo, antes de
 * enviarles la orden de parada
 */
package pkg16_exchanger;

import java.util.concurrent.Exchanger;

/**
 *
 * @author brand
 */
public class Main {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Exchanger<String> exgr = new Exchanger<String>();
		//intercambiador para una cadena

		HiloProductor productor = new HiloProductor(exgr);
		//crea el hilo productor
		productor.start();
		//inicia hilo productor
		(new HiloConsumidor(exgr)).start();
		//crea e inicia el hilo consumidor

		try {
			Thread.sleep(1000);
			//duerme al hilo principal un segundo
			//con objeto de dar tiempo a que los hilos intercambien las cadenas
		} catch (InterruptedException ex) {
		}

		productor.parada();
		//se da la orden de parada al productor (que a su vez se la enviará al
		//consumidor en el siguiente intercambio)
	}

}
