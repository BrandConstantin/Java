package pkg18_cyclicbarrier;

import java.util.concurrent.CyclicBarrier;

/**
 * ****************************************************************************
 * suma el total de 10 tandas de números dispuestos en una matriz. Para obtener
 * la suma de cada tanda o fila, se lanza un hilo controlado por una barrera
 * CyclicBarrier de 5 hilos. Cada tanda de la matriz representa los valores
 * recaudados por un cobrador.
 *
 * el propósito de la barrera es desencadenar un procedimiento que suma los
 * totales de cada tanda. En este ejemplo, supondremos que interesa ir
 * acumulando los valores recaudados cada 5 cobradores, 5 tandas
 *
 * como tenemos 10 hilos auxiliares, la barrera desencadenará este procedimiento
 * 2 veces, lo que impica que se ejecutará de forma cíclica
 *
 * la primera vez que lo hace, sólo hay 5 hilos finalizados. Luego la suma
 * obtenida, será sólo una parte del total buscado (cada hilo no finalizado
 * contribuye con un 0)
 *
 * sin embargo, la segunda vez todos los hilos habrán terminado. En este caso,
 * la suma obtenida será el total buscado
 */
/**
 * @author brand
 */
public class Main {

	//matriz de 10 tandas o filas de números
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
	//resultadoTanda de la suma de los elementos de cada tanda

	/**
	 * ************************************************************************
	 * clase que define el hilo auxiliar, cuyo método run() se encarga de sumar
	 * los elementos de la tanda de números recibida por su constructor
	 *
	 * el constructor recibe también un objeto CyclicBarrier de control
	 */
	private static class SumaTanda extends Thread {
		//clase que implementa un hilo

		int t;
		//índice de la tanda (en este caso, un entero de 0 a 4)
		CyclicBarrier barreraCiclica;
		//barrera cíclica de control

		/**
		 * ********************************************************************
		 * constructor
		 */
		SumaTanda(CyclicBarrier barreraCiclica, int t) {
			this.barreraCiclica = barreraCiclica;
			this.t = t;
		}

		/**
		 * ********************************************************************
		 * método run que suma los elementos de la tanda recibida por el
		 * constructor
		 *
		 * cuando finaliza esta suma y se almacena el valor, se incrementa en
		 * una unidad el número de hilos en espera dentro de la barrera
		 *
		 * cuando ese número de elementos en espera sea el indicado más abajo
		 * por el constructor de la barrera (5 en este caso), se desencadenará
		 * el procedimiento que obtiene la suma de todos ellos
		 */
		@Override
		public void run() {
			//comportamiento del hilo
			int elementos = tabla[t].length;
			//número de elementos de la tanda

			int sumaParcial = 0;
			//acumulador parcial

			for (int i = 0; i < elementos; i++) {
				sumaParcial += tabla[t][i];
				//agrega el elemento de la tanda al parcial
			}

			resultadoTanda[t] = sumaParcial;
			//guarda el resultadoTanda de la suma de la tanda

			//muestra un mensaje en consola
			System.out.println("La suma de los elementos de la tanda "
					+ t + " es: " + sumaParcial);

			try {
				barreraCiclica.await();
				//un hilo más que ha completado su trabajo y por tanto en espera
				//dentro de la barrera
			} catch (Exception ex) {
				//no hace nada
			}
		}
	}

	/**
	 * ************************************************************************
	 * realiza la suma total de los elementos de la matriz, mediante el método
	 * sumaParcial de un objeto CyclicBarrier
	 */
	public static void main(String args[]) {

		final int ntandas = tabla.length;
		//número total de tandas (10, en este caso)

		resultadoTanda = new int[ntandas];
		//vector de sumas de cada tanda

		/**
		 * ********************************************************************
		 * procedimiento de suma parcial que se ejecutará cada vez que se
		 * complete la barrera, implementado mediante la clase Runnable
		 */
		Runnable sumaParcial = new Runnable() {

			int totalAcumulado;
			//acumulador total

			//suma los resultados de cada tanda (las que no hayan terminado
			//sumaran 0)
			public void run() {
				totalAcumulado = 0;
				//reinicia el total

				for (int i = 0; i < ntandas; i++) {
					totalAcumulado += resultadoTanda[i];
					//agrega el resultadoTanda al parcial
				}

				//imprime la suma total
				System.out.println("\nBarrera completada. Total acumulado: "
						+ totalAcumulado + "\n");
			}
		};

		CyclicBarrier barreraCiclica = new CyclicBarrier(5, sumaParcial);
		//crea una Barrera de Control que desencadenará un procedimiento
		//sumaParcial, cuando el número número de elemento en espera dentro de
		//ella sea 5. Este procedimiento será disparado por el último hilo desde
		//el que se invoque el método await() de la barrera

		//lanza un nuevo hilo para cada tanda
		for (int i = 0; i < ntandas; i++) {
			new SumaTanda(barreraCiclica, i).start();
			//cada nuevo hilo recibe la Barrera Cíclica de control, y el
			//índice de la tanda sobre la que actuará
		}
	}
}
