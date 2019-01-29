import java.awt.event.*;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.util.*;

public class Temporizador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ActionListener oyente = new ObjetoTemporizador();
		
		Timer mitemporizador = new Timer(5000, oyente);
		
		mitemporizador.start();
		
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener");
		
	}

}