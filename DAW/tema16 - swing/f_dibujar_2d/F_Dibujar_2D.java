package f_dibujar_2d;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class F_Dibujar_2D{

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
		
		Graphics2D g2 = (Graphics2D) g;
		
		//rectangulo
		Rectangle2D rectangulo = new Rectangle2D.Double(100, 50, 200, 150);		
		g2.draw(rectangulo);
		
		//elipse
		Ellipse2D elipse = new Ellipse2D.Double();
		elipse.setFrame(rectangulo);
		g2.draw(elipse);
		
		//linea
		g2.draw(new Line2D.Double(100, 100, 300, 250));
		
		//circulo
		double CentroX = rectangulo.getCenterX();
		double CentroY = rectangulo.getCenterY();
		double radio = 200;
		
		Ellipse2D circulo = new Ellipse2D.Double();
		circulo.setFrameFromCenter(CentroX, CentroX, CentroX + radio, CentroY + radio);
		g2.draw(circulo);
	}
}