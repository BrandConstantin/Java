package eventos;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.*;

public class A_Eventos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoBoton miMarco = new MarcoBoton();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoBoton extends JFrame{
	public MarcoBoton() {
		setVisible(true);

		Toolkit miPantalla = Toolkit.getDefaultToolkit();

		Dimension tamanoPantalla = miPantalla.getScreenSize();
		int heightPantalla = tamanoPantalla.height;
		int widthPantalla = tamanoPantalla.width;
		
		setSize(widthPantalla / 2, heightPantalla / 2);
		setLocation(widthPantalla / 4, heightPantalla / 4);
		
		setTitle("Marco Boton");
		
		Lamina miLamina = new Lamina();
		add(miLamina);
	}
}

class Lamina extends JPanel implements ActionListener{
	JButton boton = new JButton("Negro");
	JButton boton2 = new JButton("Blanco");
	
	public Lamina() {
		add(boton);
		add(boton2);
		
		boton.addActionListener(this);
		boton2.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object botonPulsado = e.getSource();
		if(botonPulsado == boton) {
			setBackground(Color.BLACK);
		}else {
			setBackground(Color.WHITE);
		}
	}
}