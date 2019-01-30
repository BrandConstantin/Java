package d_escribir_frame;

import javax.swing.*;
import java.awt.*;

public class D_Escribir_en_Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoTexto miMarco = new MarcoTexto();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoTexto extends JFrame{
	public MarcoTexto() {
		setVisible(true);

		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		
		//ver la resolución de la pantalla
		Dimension tamanoPantalla = miPantalla.getScreenSize();
		int heightPantalla = tamanoPantalla.height;
		int widthPantalla = tamanoPantalla.width;
		
		//size la mitad del tamaño de mi pantalla
		setSize(widthPantalla / 2, heightPantalla / 2);
		//location en el centro de la pantalla
		setLocation(widthPantalla / 4, heightPantalla / 4);
		
		setTitle("Primer Texto");
		
		Lamina miLamina = new Lamina();
		add(miLamina);
	}
}

class Lamina extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.drawString("Estamos aprendiendo Swing", 100, 50);
	}
}