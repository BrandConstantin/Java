package eventos_raton;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class C_Eventos_Raton {

	public static void main(String[] args) {
		MarcoRaton3 miMarco = new MarcoRaton3();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoRaton3 extends JFrame{
	public MarcoRaton3() {
		setVisible(true);

		Toolkit miPantalla = Toolkit.getDefaultToolkit();

		Dimension tamanoPantalla = miPantalla.getScreenSize();
		int heightPantalla = tamanoPantalla.height;
		int widthPantalla = tamanoPantalla.width;
		
		setSize(widthPantalla / 2, heightPantalla / 2);
		setLocation(widthPantalla / 4, heightPantalla / 4);
		
		setTitle("Marco Ratón");
		
		EventoRaton3 raton = new EventoRaton3();
		addMouseMotionListener(raton);
	}
}

//si no queremos implementar todos los métodos
class EventoRaton3 implements MouseMotionListener{

	@Override
	public void mouseDragged(MouseEvent arg0) {
		System.out.println("Estas arrastrando el ratón");
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		System.out.println("Estás moviendo el ratón");
	}


	
}