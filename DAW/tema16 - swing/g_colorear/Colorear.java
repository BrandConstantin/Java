package g_colorear;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Colorear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoColoreado miMarco = new MarcoColoreado();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoColoreado extends JFrame{
	public MarcoColoreado() {
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
		
		setTitle("Segundo Dibujo");
		
		Lamina miLamina = new Lamina();
//		miLamina.setBackground(Color.PINK.darker());
		miLamina.setBackground(SystemColor.window);
		add(miLamina);
	}
}

class Lamina extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
		
		//rectangulo
		Rectangle2D rectangulo = new Rectangle2D.Double(100, 50, 200, 150);	
		g2.setPaint(Color.RED.darker());
		g2.fill(rectangulo);
		g2.setPaint(Color.BLACK.darker());
		g2.draw(rectangulo);
		
		//elipse
		Ellipse2D elipse = new Ellipse2D.Double();
		elipse.setFrame(rectangulo);
		g2.setPaint(new Color(109, 172, 59).brighter());
		g2.fill(elipse);
	}
}