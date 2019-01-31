package eventos_raton;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class A_Eventos_Raton {

	public static void main(String[] args) {
		MarcoRaton miMarco = new MarcoRaton();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoRaton extends JFrame{
	public MarcoRaton() {
		setVisible(true);

		Toolkit miPantalla = Toolkit.getDefaultToolkit();

		Dimension tamanoPantalla = miPantalla.getScreenSize();
		int heightPantalla = tamanoPantalla.height;
		int widthPantalla = tamanoPantalla.width;
		
		setSize(widthPantalla / 2, heightPantalla / 2);
		setLocation(widthPantalla / 4, heightPantalla / 4);
		
		setTitle("Marco Ratón");
		
		EventoRaton raton = new EventoRaton();
		addMouseListener(raton);
	}
}

class EventoRaton implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {

		System.out.println("click");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}