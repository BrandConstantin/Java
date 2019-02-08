package tarea_02;

import java.util.ArrayList;

/**
 * Este hilo se ejecutará siempre y cuando haya fumadores activos, comprobando
 * el estado de la mesa y reponiendo los ingredientes siempre que haga falta.
 *
 */
public class Dispensador extends Thread {
    // Declaración de variables.
    private final Mesa mesa;

    /**
     * Constructor de la clase, asignando la mesa como recurso compartido.
     *
     * @param mesa el recurso compartido.
     */
    public Dispensador(Mesa mesa) {
        this.mesa = mesa;
    }

    /**
     * El dispensador se ejecutará siempre y cuando hayan fumadores activos.
     *
     * Se encargará de reponer la mesa con ingredientes si está vacía. 
     */
    @Override
    public void run() {
        // Obtenemos el array de fumadores activos.
        ArrayList<Fumador> fumadores = tarea_02.Main.getFumadores();
        
        // Se debe ejecutar mientras existan fumadores con cigarrillos pendientes.
        while (!fumadores.isEmpty()) {
            try {
                System.out.println("Dispensador se despierta y comprueba la mesa.");
                mesa.reponer(this);
            } catch (InterruptedException ex) {
                System.out.println("El dispensador se ha interrumpido");
            }
        }
    }
}
