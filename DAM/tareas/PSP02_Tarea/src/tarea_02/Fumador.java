package tarea_02;

import tarea_02.Mesa.Ingrediente;
import java.util.Random;

/**
 * Este hilo se ejecutará siempre y cuando tenga cigarrillos aun por fumar,
 * comprobando si hay ingredientes en la mesa y si son los que les hace falta,
 * se fumará un cigarro, saliendo del array si ha acabado de fumar.
 */
public class Fumador extends Thread {
	// Declaración de variables.

	private final Mesa mesa;
	private final Ingrediente ingrediente;
	private int cigarrillos;

	/**
	 * Constructor que asigna un nombre al fumador, la mesa como recurso
	 * compartido y el ingrediente del que dispone el fumador.
	 *
	 * @param nombre el nombre del fumador.
	 * @param mesa el recurso compartido.
	 * @param ingrediente el ingrediente del que dispone el fumador.
	 */
	public Fumador(String nombre, Mesa mesa, Ingrediente ingrediente) {
		setName(nombre);
		this.mesa = mesa;
		this.ingrediente = ingrediente;
		cigarrillos = new Random().nextInt(9) + 1;
	}

	/**
	 * El fumador se ejecutará siempre y cuando le queden cigarrillos por fumar.
	 */
	@Override
	public void run() {
		System.out.println(getName() + " tiene que fumar " + cigarrillos);
		System.out.println(getName() + " tiene como ingrediente " + ingrediente);

		// Se debe ejecutar mientras tenga cigarrillos pendientes por fumar.
		while (cigarrillos > 0) {
			try {
				mesa.liarCigarrillo(this);
			} catch (InterruptedException ex) {
				System.out.println("El fumador se ha interrumpido");
			}
		}
	}

	/**
	 * Devuelve el ingrediente del que dispone el fumador.
	 *
	 * @return Ingrediente que tiene el fumador a su disposición.
	 */
	public Ingrediente getIngrediente() {
		return ingrediente;
	}

	/**
	 * Devuelve el número de cigarrillos que tiene que fumar el fumador.
	 *
	 * @return int cigarrillos que le quedan por fumar al fumador.
	 */
	public int getCigarrillos() {
		return cigarrillos;
	}

	/**
	 * Comprueba si los ingredientes son los que les hace falta para fumar.
	 *
	 * @param primerIngrediente el primer ingrediente a comprobar.
	 * @param segundoIngrediente el segundo ingrediente a comprobar.
	 *
	 * @return true si necesita esos ingredientes, false si no los necesita.
	 */
	boolean comprobarIngredientes(Ingrediente primerIngrediente, Ingrediente segundoIngrediente) {
		return primerIngrediente != segundoIngrediente
				&& primerIngrediente != ingrediente
				&& segundoIngrediente != ingrediente;
	}

	/**
	 * El fumador fuma un cigarrillo, restandose uno al total de cigarrillos y
	 * actualizando su label.
	 *
	 * @throws InterruptedException si ocurre una interrupción.
	 */
	public void fumar() throws InterruptedException {
		cigarrillos -= 1;
		System.out.println(getName() + " tiene que fumar " + cigarrillos);
		sleep(3000);
	}

	/**
	 * Comprueba si el fumador ha terminado de fumar.
	 *
	 * @return true si no le quedan cigarrillos, false si aun le quedan.
	 */
	public boolean haTerminado() {
		return cigarrillos == 0;
	}
}
