package c_marco_centrado;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.*;

public class C_Marco_Centrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoCentrado miMarco = new MarcoCentrado();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}

}


class MarcoCentrado extends JFrame{
	public MarcoCentrado() {
		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		
		//ver la resolución de la pantalla
		Dimension tamanoPantalla = miPantalla.getScreenSize();
		int heightPantalla = tamanoPantalla.height;
		int widthPantalla = tamanoPantalla.width;
		
		//size la mitad del tamaño de mi pantalla
		setSize(widthPantalla / 2, heightPantalla / 2);
		//location en el centro de la pantalla
		setLocation(widthPantalla / 4, heightPantalla / 4);
		
		setTitle("Marco Centrado");
		Image miIcono = miPantalla.getImage("src/c_marco_centrado/code.jpg");
		setIconImage(miIcono);
	}
}