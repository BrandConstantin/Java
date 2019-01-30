package h_cambiar_letra;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Cambiar_Letra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoFuente miMarco = new MarcoFuente();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoFuente extends JFrame{
	public MarcoFuente() {
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
		
		setTitle("Marco Fuentes");
		
		Lamina miLamina = new Lamina();
		//para escribir todo con el mismo color
		//miLamina.setForeground(Color.BLUE);
		add(miLamina);
	}
}

class Lamina extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
		
		Font miFuente = new Font("Comic Sans MS", Font.BOLD, 26);
		g2.setFont(miFuente);
		g2.setColor(Color.RED.darker());
		g2.drawString("Comic Sans MS", 100, 100);
		
		Font miFuente2 = new Font("Courier", Font.ITALIC, 22);
		g2.setFont(miFuente2);
		g2.setColor(Color.BLUE.darker());
		g2.drawString("Courier", 100, 150);
		
		g2.setFont(new Font("Arial", Font.BOLD, 18));
		g2.setColor(new Color(128, 90, 45).darker());
		g2.drawString("Arial", 100, 200);
		
	}
}