package eventos_de_foco;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Foco_Evento {

	public static void main(String[] args) {
		MarcoFoco miMarco = new MarcoFoco();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoFoco extends JFrame{
	public MarcoFoco() {
		setVisible(true);

		Toolkit miPantalla = Toolkit.getDefaultToolkit();

		Dimension tamanoPantalla = miPantalla.getScreenSize();
		int heightPantalla = tamanoPantalla.height;
		int widthPantalla = tamanoPantalla.width;
		
		setSize(widthPantalla / 2, heightPantalla / 2);
		setLocation(widthPantalla / 4, heightPantalla / 4);
		
		setTitle("Marco Foco");
		
		add(new Foco());
	}
}

//si no queremos implementar todos los métodos
class Foco extends JPanel{
	//crear dos cuadros de texto
	JTextField cuadro1;
	JTextField cuadro2;

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		//invalidar posicionamiento de los layout dentro del marco
		setLayout(null);			
		
		cuadro1 = new JTextField();
		cuadro2 = new JTextField();
		
		//les damos tamaño y posición a los cuadro de texto
		cuadro1.setBounds(120, 10, 150, 20);
		cuadro2.setBounds(120, 50, 150, 20);
		
		add(cuadro1);
		add(cuadro2);
		
		LanzaFoco elFoco = new LanzaFoco();
		cuadro1.addFocusListener(elFoco);
	}
	

	private class LanzaFoco implements FocusListener{
	
		@Override
		public void focusGained(FocusEvent e) {
			System.out.println("Cuadro1 tiene el foco");
		}
	
		@Override
		public void focusLost(FocusEvent e) {			
//			System.out.println("He perdido el foco, lo gana cuadro2");
			
			String email = cuadro1.getText();
			boolean comprobacion = false;
			
			for (int i = 0; i < email.length(); i++) {
				if(email.charAt(i) == '@') {
					comprobacion = true;
				}
			}
			
			if(comprobacion) {
				System.out.println("Correcto");
			}else {
				System.out.println("Incorrecto");
			}
		}
		
	}
}