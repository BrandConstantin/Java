package eventos_ventana;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.*;

import javax.swing.JFrame;

public class A_Ventana {

	public static void main(String[] args) {
		MarcoVentana miMarco = new MarcoVentana();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MarcoVentana miMarco2 = new MarcoVentana();
		miMarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}

class MarcoVentana extends JFrame{
	public MarcoVentana() {
		setVisible(true);

		Toolkit miPantalla = Toolkit.getDefaultToolkit();

		Dimension tamanoPantalla = miPantalla.getScreenSize();
		int heightPantalla = tamanoPantalla.height;
		int widthPantalla = tamanoPantalla.width;
		
		setSize(widthPantalla / 2, heightPantalla / 2);
		setLocation(widthPantalla / 4, heightPantalla / 4);
		
		setTitle("Marco Ventana");
		
		Ventana oyente_ventana = new Ventana();
		addWindowListener(oyente_ventana);
	}
}

class Ventana implements WindowListener{
	//estamos obligados a declarar todos estos métodos
	public void windowActivated(WindowEvent e) {
		System.out.println("Ventana activada");
	}
	public void windowClosed(WindowEvent e) {
		System.out.println("Ventana cerrada ahora");
	}
	public void windowClosing(WindowEvent e) {
		System.out.println("Ventana cerrada");
	}
	public void windowDeactivated(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowOpened(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {
		System.out.println("Ventana minimizada");
	}
}