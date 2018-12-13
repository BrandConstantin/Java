package pkg16_exchanger;
import java.util.concurrent.Exchanger;

/******************************************************************************
 * hilo Productor cuyo método run() ejecuta el bucle:
 * 
 *  - agregar 10 caracteres consecutivos a la cadena vacía proporcionada por
 *    el Consumidor
 *  - cambiar con el hilo Consumidor la cadena compuesta por otra vacía
 *
 * hasta que se recibe una llamada al método parada()
*/

/**
 *
 * @author brand
 */
public class HiloProductor extends Thread {

	final Exchanger<String> intercambiadorCadena;
	//intercambiador de objetos String
	boolean continuar;

	String str;
	//cadena

	/**
	 * ************************************************************************
	 * constructor del hilo que recibe como parámetro un intercambiador de
	 * cadena
	 *
	 * @param c
	 */
	HiloProductor(Exchanger<String> echger) {
		intercambiadorCadena = echger;
		//intercambiador

		str = "";
		//cadena a vacía

		continuar = true;
		//continuar a verdadero
	}

	/**
	 * ************************************************************************
	 * mientras que no se llama al método parada(), ejecuta el bucle:
	 *
	 * - agregar 10 carácteres consecutivos a la cadena vacía proporcionada por
	 * el Consumidor - cambiar con el hilo Consumidor la cadena compuesta por
	 * otra vacía
	 *
	 * cuando se llama a parada(), intercambia la cadena vacía con el Consumidor
	 * (la señal de parada para el Consumidor)
	 */
	@Override
	public void run() {

		final char chTope = 1 + 'Z';
		//carácter tope

		char ch = 'A';
		//carácter inicial

		//cadena a vacía
		str = "";

		//mientras no se indica parada
		while (continuar) {

			//agrega 10 caracteres consecutivos a la cadena vacía recibida en
			//el intercambio anterior
			for (int j = 0; j < 10; j++) {

				//agrega el carácter a la cadena
				str += (char) ch++;

				//si llegó al tope
				if (ch == chTope) {
					//empieza otra vez por 'A'
					ch = 'A';
				}
			}

			try {
				//llama a exchange(str), para intercambiar con el hilo Consumidor
				//la cadena rellenada por otra vacía (esto bloquea la ejecución
				//del Productor hasta que el Consumidor está listo para realizar
				//el intercambio)
				str = intercambiadorCadena.exchange(str);

			} catch (InterruptedException ex) {
				//no hace nada...
			}
		}

		//si se indicó parada
		try {
			//intercambia con el hilo Consumidor la cadena vacía (señal de
			//parada para el Consumidor), por otra vacía (que ya no se vuelve
			//a usar, porque el bucle ha finalizado)
			intercambiadorCadena.exchange(str);
		} catch (InterruptedException ex) {
			//no hace nada...
		}
	}

	/**
	 * ************************************************************************
	 * método que ordena el fin del bucle
	 *
	 */
	public void parada() {
		//fin del bucle
		continuar = false;
	}
}
