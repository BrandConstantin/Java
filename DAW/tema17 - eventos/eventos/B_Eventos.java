package eventos;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.*;

public class B_Eventos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoBoton2 miMarco = new MarcoBoton2();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoBoton2 extends JFrame{
	public MarcoBoton2() {
		setVisible(true);

		Toolkit miPantalla = Toolkit.getDefaultToolkit();

		Dimension tamanoPantalla = miPantalla.getScreenSize();
		int heightPantalla = tamanoPantalla.height;
		int widthPantalla = tamanoPantalla.width;
		
		setSize(widthPantalla / 2, heightPantalla / 2);
		setLocation(widthPantalla / 4, heightPantalla / 4);
		
		setTitle("Marco Boton");
		
		Lamina2 miLamina = new Lamina2();
		add(miLamina);
	}
}

class Lamina2 extends JPanel{
	JButton boton = new JButton("Amarillo");
	JButton boton2 = new JButton("Cyan");
	
	public Lamina2() {
		add(boton);
		add(boton2);
		
		ColorFondo amarillo = new ColorFondo(Color.yellow);
		ColorFondo cyan = new ColorFondo(Color.cyan);
		
		boton.addActionListener(amarillo);
		boton2.addActionListener(cyan);
	}


class ColorFondo implements ActionListener{
	private Color color;
	
	public ColorFondo(Color color) {
		this.color = color;
	}
		
	public void actionPerformed(ActionEvent e) {
		Object botonPulsado = e.getSource();
		if(botonPulsado == boton) {
			setBackground(color);
		}else {
			setBackground(color);
		}
	}
}
}