package eventos_de_foco;

import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

import javax.swing.JFrame;

public class Foco_Ventana extends JFrame implements WindowFocusListener{

	public static void main(String[] args) {
		Foco_Ventana miVEntana = new Foco_Ventana();
		miVEntana.iniciar();
	}
	
	public void iniciar() {
		marco1 = new Foco_Ventana();
		marco2 = new Foco_Ventana();
		
		marco1.setVisible(true);
		marco2.setVisible(true);
		
		marco1.setBounds(300, 100, 600, 350);
		marco2.setBounds(800, 100, 600, 350);
		
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		marco1.addWindowFocusListener(this);
		marco2.addWindowFocusListener(this);
	}

	@Override
	public void windowGainedFocus(WindowEvent arg0) {
		if(arg0.getSource() == marco1) {
			marco1.setTitle("Tengo el foco");
		}else {
			marco2.setTitle("Tengo el foco");
		}
	}

	@Override
	public void windowLostFocus(WindowEvent arg0) {
		if(arg0.getSource() == marco1) {
			marco1.setTitle("");
		}else {
			marco2.setTitle("");
		}
	}
	
	Foco_Ventana marco1;
	Foco_Ventana marco2;

}
