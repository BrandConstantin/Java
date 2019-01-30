package eventos_ventana;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.*;

import javax.swing.JFrame;

public class B_Clases_Adaptadoras {

	public static void main(String[] args) {
		MarcoVentana2 miMarco = new MarcoVentana2();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MarcoVentana2 miMarco2 = new MarcoVentana2();
		miMarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}

class MarcoVentana2 extends JFrame{
	public MarcoVentana2() {
		setVisible(true);

		Toolkit miPantalla = Toolkit.getDefaultToolkit();

		Dimension tamanoPantalla = miPantalla.getScreenSize();
		int heightPantalla = tamanoPantalla.height;
		int widthPantalla = tamanoPantalla.width;
		
		setSize(widthPantalla / 2, heightPantalla / 2);
		setLocation(widthPantalla / 4, heightPantalla / 4);
		
		setTitle("Marco Ventana");
		
//		Ventana2 oyente_ventana = new Ventana2();
//		addWindowListener(oyente_ventana);
		
		addWindowListener(new Ventana());
	}
}

class Ventana2 extends WindowAdapter{
	public void windowClosing(WindowEvent e) {
		System.out.println("Ventana cerrada");
	}

	public void windowIconified(WindowEvent e) {
		System.out.println("Ventana minimizada");
	}
}