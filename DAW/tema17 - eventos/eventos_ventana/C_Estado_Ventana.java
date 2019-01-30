package eventos_ventana;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.*;

import javax.swing.JFrame;

public class C_Estado_Ventana {

	public static void main(String[] args) {
		MarcoVentana3 miMarco = new MarcoVentana3();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoVentana3 extends JFrame{
	public MarcoVentana3() {
		setVisible(true);

		Toolkit miPantalla = Toolkit.getDefaultToolkit();

		Dimension tamanoPantalla = miPantalla.getScreenSize();
		int heightPantalla = tamanoPantalla.height;
		int widthPantalla = tamanoPantalla.width;
		
		setSize(widthPantalla / 2, heightPantalla / 2);
		setLocation(widthPantalla / 4, heightPantalla / 4);
		
		setTitle("Marco Ventana");
		
		CambioEstado nuevo_estado = new CambioEstado();
		addWindowStateListener(nuevo_estado);
	}
}

class CambioEstado implements WindowStateListener{
	public void windowStateChanged(WindowEvent e) {
		//System.out.println("La ventana ha cambiado de estado");		
		//System.out.println(e.getNewState());
		
		if(e.getNewState() == 6) {
			System.out.println("PANTALLA COMPLETA");
		}else if(e.getNewState() == Frame.NORMAL) {
			System.out.println("Pantalla tamaño normal");
		}else if(e.getNewState() == Frame.ICONIFIED) {
			System.out.println("Ventana minimizada");
		}
	}
}