package i_imagenes;

import java.awt.*;
import javax.swing.*;
import javax.imageio.*;
import java.io.*;

public class Imagenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoImagen miMarco = new MarcoImagen();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoImagen extends JFrame{
	public MarcoImagen() {
		setVisible(true);

		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		
		Dimension tamanoPantalla = miPantalla.getScreenSize();
		int heightPantalla = tamanoPantalla.height;
		int widthPantalla = tamanoPantalla.width;

		setSize(widthPantalla / 2, heightPantalla / 2);
		setLocation(widthPantalla / 4, heightPantalla / 4);
		
		setTitle("Marco Imagenes");
		
		Lamina miLamina = new Lamina();
		add(miLamina);
	}
}

class Lamina extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		File miImagen = new File("src/i_imagenes/vox.jpg");
		
		try {
			imagen = ImageIO.read(miImagen);
			//imagen = ImageIO.read(new File("src/i_imagenes/vox.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("La imágen no se encuentra");
		}
		
		g.drawImage(imagen, 50, 50, null);
		
	}
	
	private Image imagen;
}