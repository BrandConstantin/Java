import java.awt.Toolkit;
import java.awt.event.*;
import java.util.*;

class ObjetoTemporizador implements ActionListener {
	
	public void actionPerformed (ActionEvent e) {
		Date tiempoAhora = new Date();
		
		System.out.println("La hora es " + tiempoAhora);
		Toolkit.getDefaultToolkit().beep();
	}
}
