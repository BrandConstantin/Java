package e_dibujar_frame;

import javax.swing.*;
import java.awt.*;

public class E_Dibujar_Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoDibujo miDibujo = new MarcoDibujo();
		miDibujo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoDibujo extends JFrame{
	public MarcoDibujo() {
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
		
		setTitle("Primer Dibujo");
		
		Lamina miLamina = new Lamina();
		add(miLamina);
	}
}

class Lamina extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.drawRect(50, 100, 50, 100);
		g.drawLine(150, 50, 50, 200);
		g.drawArc(250, 200, 100, 100, 150, 150);
	}
}