package pkg17_countdownlatch;

import java.util.concurrent.CountDownLatch;

/**
 * ****************************************************************************
 * suma el total de 10 tandas de números dispuestos en una matriz. Para obtener
 * la suma de cada tanda, se lanza un hilo auxiliar controlado por una cuenta
 * atrás de cierre
 *
 * el propósito de la cuenta atrás de cierre es que el hilo que va a realizar la
 * suma total (en nuestro caso, el hilo principal), espere a que cada uno de los
 * 10 hilos auxiliares complete la suma de su tanda
 */
/**
 * @author brand
 */
public class Main {

	//matriz de 10 tandas de números
	private static int tabla[][] = {
		{1},
		{1, 1},
		{1, 2, 1},
		{1, 3, 3, 1},
		{1, 4, 6, 4, 1},
		{1, 5, 10, 10, 5, 1},
		{1, 6, 15, 20, 15, 6, 1},
		{1, 7, 21, 35, 35, 21, 7, 1},
		{1, 8, 28, 56, 70, 56, 28, 8, 1},
		{1, 9, 36, 84, 126, 126, 84, 36, 9, 1}};
	private static int resultadoTanda[];
	//array para guardar la suma de los elementos de cada tanda o fila

	/**
	 * ************************************************************************
	 * clase que define el hilo auxiliar, cuyo método run() se encarga de sumar
	 * los elementos de la tanda de números recibida por su constructor
	 *
	 * el constructor recibe también un objeto CountDownLatch de control
	 */
	private static class SumaTanda extends Thread {

		int t;
		//índice de la tanda
		CountDownLatch cdl;
		//objeto de control

		/**
		 * ********************************************************************
		 * constructor
		 */
		SumaTanda(CountDownLatch cdl, int t) {
			this.cdl = cdl;
			this.t = t;
		}

		/**
		 * ********************************************************************
		 * método run que suma los elementos de la tanda recibida por el
		 * constructor
		 *
		 * cuando finaliza esta suma y se almacena el valor, se llama al método
		 * countDown() de la barrera
		 */
		@Override
		public void run() {
			int elementos = tabla[t].length;
			//número de elementos de la tanda

			int sumaTanda = 0;
			//acumulador parcial

			for (int i = 0; i < elementos; i++) {
				sumaTanda += tabla[t][i];
				//agrega el elemento de la tanda al parcial
			}

			resultadoTanda[t] = sumaTanda;
			//guarda en resultadoTanda la suma de la tanda t

			//muestra un mensaje
			System.out.println("La suma de los elementos de la tanda "
					+ t + " es: " + sumaTanda);

			//finalizada la suma de los elementos de la tanda y almacenado
			//el valor, el hilo llama al método countDown() de la barrera
			try {
				cdl.countDown();
				//un elemento menos en la cuenta atrás
			} catch (Exception ex) {
				//no hace nada
			}
		}
	}

	/**
	 * ************************************************************************
	 * realiza la suma total de los elementos de la matriz, cuando el objeto
	 * CountDownLatch que controla los hilos axiliares lo permite
	 */
	public static void main(String args[]) {

		final int ntandas = tabla.length;
		//número total de tandas (10, en este ejemplo)

		int sumaTotal = 0;
		//acumulador total

		resultadoTanda = new int[ntandas];
		//dimensiona a 10 el vector que almacenará las sumas de los elementos
		//de cada tanda

		CountDownLatch cdl = new CountDownLatch(ntandas);
		//objeto tipo CountDownLatch para 10 hilos (uno para cada tanda de
		//números). Este objeto pondrá en espera cada hilo desde donde se
		//invoque su método await() (en nuestro caso, sólo el hilo principal),
		//hasta que cada uno de los 10 hilos que controla realice una llamada
		//su método countDown()

		//mensaje de espera
		System.out.println("Obteniendo la suma de los elementos de "
				+ "cada tanda...\n");

		//lanza un hilo por cada tanda de elementos (10 hilos)
		for (int i = 0; i < ntandas; i++) {
			new SumaTanda(cdl, i).start();
			//cada nuevo hilo recibe el objeto CountDownLatch de control, y el
			//índice de la tanda cuyos elementos debe sumar
		}

		try {
			cdl.await();
			//coloca el hilo desde donde se ejecuta esta llamada al método
			//await() (el hilo principal, en nuestro caso), a la
			//espera de que cada hilo controlado por la cuenta atrás
			//llame al método countDown().
			//Ningún hilo controlado llamará a este método hasta que no haya
			//completado la suma de su tanda
		} catch (Exception ex) {
			//no hace nada
		}

		//cuando se reanuda el hilo principal, todos los hilos controlados
		//por la cuenta atrás han terminado de sumar su tanda. Por tanto, es el
		//momento de realizar la suma total
		for (int i = 0; i < ntandas; i++) {
			sumaTotal += resultadoTanda[i];
			//agrega el resultadoTanda al total
		}

		//imprime la suma total
		System.out.println("\nTodas la tandas han sido "
				+ "sumadas. Total: " + sumaTotal);
	}
}
