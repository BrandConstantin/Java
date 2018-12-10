package PaquetePrincipal;
/**
 *
 * @author IMCG
 */
/**
 * hilo que realiza una cuenta de 1 a 20, cuyo valor representa en el marcador
 * a medida que aumenta*/
public class Hilo_Auxiliar extends Thread {
    //clase que hereda de Thread
    JPanel_Marcador mi_marcador;
    //marcador local
    boolean duerme;
    //variable para controlar si dormimos o no al hilo
    public Hilo_Auxiliar(boolean d, JPanel_Marcador marcador) {
        //constuctor del hilo
        duerme = d;
        mi_marcador = marcador;
        //almacena el marcador recibido
    }

    @Override
    public void run() {
        //código del hilo
        mi_marcador.valor = 0;
        //anula la cuenta
        mi_marcador.repaint();
        //solicita el repintado para borrar el marcador
        if (duerme) {
            for (int i = 1; i <=20; i++) {
                //incremental la cuenta
                mi_marcador.valor = i;
                mi_marcador.repaint();
                //solicita el repintado
                try {
                    this.sleep(100);
                    //duerme el hilo actual durante 1 décima de segundo, para
                    //que la petición de repintado del marcador sea atendida
                } catch (InterruptedException ex) {
                }
            }
        } else {
            for (int i = 1; i <= 20; i++) {
                //incremental la cuenta
                mi_marcador.valor = i;
                mi_marcador.repaint();
                //solicita el repintado
            }
        }
    }
}
