package multiples_fuentes;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class A_Multiples_Fuentes {

	public static void main(String[] args) {
		MarcoAction miMarco = new MarcoAction();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoAction extends JFrame{
	public MarcoAction() {
		setVisible(true);

		Toolkit miPantalla = Toolkit.getDefaultToolkit();

		Dimension tamanoPantalla = miPantalla.getScreenSize();
		int heightPantalla = tamanoPantalla.height;
		int widthPantalla = tamanoPantalla.width;
		
		setSize(widthPantalla / 2, heightPantalla / 2);
		setLocation(widthPantalla / 4, heightPantalla / 4);
		
		setTitle("Marco Foco");
		
		PanelAction lamina = new PanelAction();
		add(lamina);
	}
}

class PanelAction extends JPanel{
	public PanelAction() {
		JButton amarillo = new JButton("Amarillo");
		JButton azul = new JButton("Azul");
		JButton rojo = new JButton("Rojo");
		
		add(amarillo);
		add(azul);
		add(rojo);
	}	
}

class ActionColor extends AbstractAction{
	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}