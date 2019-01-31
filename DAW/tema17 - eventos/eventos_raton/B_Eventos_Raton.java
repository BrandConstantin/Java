package eventos_raton;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class B_Eventos_Raton {

	public static void main(String[] args) {
		MarcoRaton2 miMarco = new MarcoRaton2();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoRaton2 extends JFrame{
	public MarcoRaton2() {
		setVisible(true);

		Toolkit miPantalla = Toolkit.getDefaultToolkit();

		Dimension tamanoPantalla = miPantalla.getScreenSize();
		int heightPantalla = tamanoPantalla.height;
		int widthPantalla = tamanoPantalla.width;
		
		setSize(widthPantalla / 2, heightPantalla / 2);
		setLocation(widthPantalla / 4, heightPantalla / 4);
		
		setTitle("Marco Ratón");
		
		EventoRaton2 raton = new EventoRaton2();
		addMouseListener(raton);
	}
}

//si no queremos implementar todos los métodos
class EventoRaton2 extends MouseAdapter{

	public void mouseClicked(MouseEvent e) {
		System.out.println("Coordenada x: " + e.getX() + " Coordenada y: " + e.getY() + " Cliks Count " +  e.getClickCount());
	}
	
	public void mousePressed(MouseEvent e) {
//		System.out.println(e.getModifiersEx());
		if(e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK) {
			System.out.println("Pulsaste el botón iquierdo del ratón");
		}else if(e.getModifiersEx() == 4096) {
			System.out.println("Pulsaste el botón derecho del ratón");
		}else {
			System.out.println("Pulsaste la rueda del ratón");
		}
	}
	
}