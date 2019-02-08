package tarea_02;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * Esta clase será un recurso que usarán tanto el dispensador como los
 * fumadores.
 *
 * Los fumadores mirarán en la mesa si les hace falta los ingredientes, en cuyo
 * caso los cogerán de la mesa y se fumarán un cigarrillo.
 *
 * El dispensador comprobará si la mesa está vacía, en cuyo caso pondrá en la
 * mesa dos ingredientes válidos para uno de los tres fumadores.
 *
 */
public class Mesa {     
    // Declaración de constantes.
    public enum Ingrediente {PAPEL, TABACO, CERILLAS}
    
    // Declaración de atributos.
    private Ingrediente primerIngrediente;
    private Ingrediente segundoIngrediente;
    private boolean mesaVacia;

    /**
     * Constructor de la clase. Inicia la mesa vacía.
     */
    public Mesa() {
        mesaVacia = true;
    }
    
    /**
     * Este método será el encargado de hacer que los fumadores fumen.
     *
     * Primero se comprueba si la mesa está vacía o si el fumador no necesita
     * los ingredientes. De lo contrario, el fumador cogerá los ingredientes y
     * se liará un cigarrillo, fumándoselo. Si ha terminado de fumar sus
     * cigarrillos, el fumado habrá terminado y se saldrá del array de fumadores
     * activos. Por último, se despertarán el resto de fumadores.
     *
     * @param fumador el fumador activo.
     * @throws java.lang.InterruptedException si ocurre alguna interrupción.
     */
    public synchronized void liarCigarrillo(Fumador fumador) throws InterruptedException {
        // Actualiza los labels de los fumadores.
        actualizarLabels(fumador);
        
        if (true == mesaVacia || false == fumador.comprobarIngredientes(primerIngrediente, segundoIngrediente)) {
            // Si la mesa está vacía o no necesita esos ingredientes, se duerme.
            System.out.println("La mesa está vacía o el " + fumador.getName() + " no necesita ningún ingrediente, se duerme.");
            wait();
        } else {
            // De lo contrario invocará su método fumar (dormir durante 2 segundos y actualizar el numero de cigarrillos pendientes).
            System.out.println("El " + fumador.getName() + " coge los ingredientes de la mesa y se los fuma.");
            fumador.fumar();
            
            System.out.println("La mesa está ahora vacía.");
            // Luego el estado de la mesa pasará a ser vacío.
            mesaVacia = true;
            
            // Verifica si el fumador ha finalizado.
            if (fumador.haTerminado()) {
                // Se obtiene el array de fumadores.
                ArrayList<Fumador> fumadores = tarea_02.Main.getFumadores();
        
                // Actualiza los labels de los fumadores.
                actualizarLabels(fumador);
                
                // El fumador se elimina del array.
                fumadores.remove(fumador);
                
                System.out.println("El " + fumador.getName() + " ha terminado.");
                System.out.println("Fumadores restantes: " + fumadores.size());
            }
            
            // Despierta a todos los procesos bloqueados.
            System.out.println("Se despiertan los fumadores restantes.");
            notifyAll();
        }
    }
    
    /**
     * Este método será el encargado de reponer la mesa con ingredientes.
     *
     * Primero comprueba si la mesa no está vacía. De lo contrario, seleccionará
     * a un fumador activo aleatorio y le pondrá en la mesa los ingredientes que
     * necesita para fumar. Luego se cambiará el estado de la mesa a no vacía y
     * despertará al resto de fumadores.
     *
     * @param dispensador el dispensador activo.
     * @throws java.lang.InterruptedException si ocurre alguna interrupción.
     */
    public synchronized void reponer(Dispensador dispensador) throws InterruptedException {
        // Si la mesa no está vacía, se duerme.
        if (false == mesaVacia) {
            System.out.println("La mesa no está vacía, dispensador se duerme.");
            wait();
        } else {
            // Se obtiene el array de fumadores activos.
            ArrayList<Fumador> fumadores = tarea_02.Main.getFumadores();
                            
            // Si hay todavía fumadores activos.
            if (!fumadores.isEmpty()) {
                // Se coge un fumador aleatorio del array.
                int fumador = new Random().nextInt(fumadores.size());
            
                // Seleccionando al azar uno de los procesos fumadores activos, ponemos en la mesa los ingredientes que necesita dicho proceso.
                System.out.println("El dispensador repone la mesa con dos ingredientes útiles para un fumador.");
                switch (fumadores.get(fumador).getIngrediente()) {
                    case PAPEL:
                        primerIngrediente = Ingrediente.TABACO;
                        segundoIngrediente = Ingrediente.CERILLAS;
                        break;
                    case TABACO:
                        primerIngrediente = Ingrediente.PAPEL;
                        segundoIngrediente = Ingrediente.CERILLAS;
                        break;
                    case CERILLAS:
                        primerIngrediente = Ingrediente.PAPEL;
                        segundoIngrediente = Ingrediente.TABACO;
                        break;
                }

                System.out.println(primerIngrediente + " " + segundoIngrediente);

                System.out.println("La mesa ya no está vacía.");
                mesaVacia = false;

                System.out.println("El dispensador despierta a los fumadores.");
                notifyAll();
            } else {
                // El programa ha finalizado, se muestra aviso y se activa el botón.
                tarea_02.Main.toggleComenzarJButton(true);
                
                JOptionPane.showMessageDialog(
                    null, 
                    "Todos han acabado de fumar.",
                    "Atención",
                    JOptionPane.INFORMATION_MESSAGE
                );
            }
        }
    }
    
    /**
     * Actualiza el color de fondo de los labels y los cigarrillos restantes.
     *
     * @param actualFumador fumador actual para comparar.
     */
    public void actualizarLabels(Fumador actualFumador) {
        // Iniciamos las variables a utilizar.
        ArrayList<Fumador> fumadores = tarea_02.Main.getFumadores();
        JLabel cigarrillos1 = tarea_02.Main.getCigarrillos1JLabel();
        JLabel cigarrillos2 = tarea_02.Main.getCigarrillos2JLabel();
        JLabel cigarrillos3 = tarea_02.Main.getCigarrillos3JLabel();
        JLabel fumador1 = tarea_02.Main.getFumador1JLabel();
        JLabel fumador2 = tarea_02.Main.getFumador2JLabel();
        JLabel fumador3 = tarea_02.Main.getFumador3JLabel();

        // Por cada fumador activo, actualizamos sus cigarrillos y su color de fondo.
        for (Fumador fumador : fumadores) {
            switch (fumador.getName()) {
                case "Fumador 1":
                    tarea_02.Main.setText(cigarrillos1 , fumador.getCigarrillos());
                    
                    if (fumador.haTerminado()) {
                        tarea_02.Main.setBackground(fumador1, Color.red);
                    } else if (actualFumador == fumador) {
                        tarea_02.Main.setBackground(fumador1, Color.green);
                    } else {
                       tarea_02.Main.setBackground(fumador1, new Color(214,217,223));
                    }
                    break;
                case "Fumador 2":
                    tarea_02.Main.setText(cigarrillos2 , fumador.getCigarrillos());

                    if (fumador.haTerminado()) {
                        tarea_02.Main.setBackground(fumador2, Color.red);
                    } else if (actualFumador == fumador) {
                        tarea_02.Main.setBackground(fumador2, Color.green);
                    } else {
                       tarea_02.Main.setBackground(fumador2, new Color(214,217,223));
                    }
                    break;
                case "Fumador 3":
                    tarea_02.Main.setText(cigarrillos3 , fumador.getCigarrillos());
                    
                    if (fumador.haTerminado()) {
                        tarea_02.Main.setBackground(fumador3, Color.red);
                    } else if (actualFumador == fumador) {
                        tarea_02.Main.setBackground(fumador3, Color.green);
                    } else {
                       tarea_02.Main.setBackground(fumador3, new Color(214,217,223));
                    }
                    break;
            }
        }
    }
}
