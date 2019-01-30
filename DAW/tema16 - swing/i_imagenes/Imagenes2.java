package i_imagenes;

import java.awt.*;
import javax.swing.*;
import javax.imageio.*;
import java.io.*;

public class Imagenes2 {

	public static void main(String[] args) {
		MarcoImagen2 miMarco = new MarcoImagen2();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoImagen2 extends JFrame{
	public MarcoImagen2() {
		setVisible(true);

		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		
		Dimension tamanoPantalla = miPantalla.getScreenSize();
		int heightPantalla = tamanoPantalla.height;
		int widthPantalla = tamanoPantalla.width;

		setSize(widthPantalla / 2, heightPantalla / 2);
		setLocation(widthPantalla / 4, heightPantalla / 4);
		
		setTitle("Marco Imagenes");
		
		Lamina2 miLamina = new Lamina2();
		add(miLamina);
	}
}

class Lamina2 extends JPanel{	
	private Image imagen;
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		try {
			imagen = ImageIO.read(new File("src/i_imagenes/01.png"));
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("La imágen no se encuentra");
		}
		
		int anchura = imagen.getWidth(this);
		int altura = imagen.getHeight(this);
		
		g.drawImage(imagen, 0, 0, null);
		
//		g.copyArea(0, 0, 50, 50, 60, 0);
//		g.copyArea(0, 0, 50, 50, 120, 0);
//		g.copyArea(0, 0, 50, 50, 180, 0);
//		g.copyArea(0, 0, 50, 50, 240, 0);
		
		//copiar imágen en toda la area
		for(int i = 0; i < 500; i++) {
			for(int j = 0; j < 500; j++) {
				if(i + j > 0) {
					g.copyArea(0, 0, anchura, altura, (anchura * i), (altura * j));
				}
			}
		}
	}
}