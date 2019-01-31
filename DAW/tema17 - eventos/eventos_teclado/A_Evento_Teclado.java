package eventos_teclado;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class A_Evento_Teclado {

	public static void main(String[] args) {
		MarcoTeclado miMarco = new MarcoTeclado();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoTeclado extends JFrame{
	public MarcoTeclado() {
		setVisible(true);

		Toolkit miPantalla = Toolkit.getDefaultToolkit();

		Dimension tamanoPantalla = miPantalla.getScreenSize();
		int heightPantalla = tamanoPantalla.height;
		int widthPantalla = tamanoPantalla.width;
		
		setSize(widthPantalla / 2, heightPantalla / 2);
		setLocation(widthPantalla / 4, heightPantalla / 4);
		
		setTitle("Marco Teclado");
		
		EventoTeclado tecla = new EventoTeclado();
		addKeyListener(tecla);
	}
}

class EventoTeclado implements KeyListener{

	@Override
	public void keyPressed(KeyEvent e) {
		int codigo = e.getKeyCode();
		System.out.print(codigo + " -> ");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		char letra = e.getKeyChar();
		System.out.println(letra);
	}
	
	
}