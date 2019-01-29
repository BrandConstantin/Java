package b_colocar_marco;
import java.awt.Frame;

import javax.swing.JFrame;

public class B_Colocar_Marco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		miMarco marco1 = new miMarco();
		marco1.setVisible(true);
		
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


class miMarco extends JFrame{
	public miMarco() {
		//setSize(500, 300);		
		//setLocation(400, 250);
		
		// podemos presendir de setSize y setLocation y utilizar las dos cosas a la vez con setBounds
		setBounds(500, 300, 400, 250);
		
		//setResizable para que el usuario no redimensione el marco
		//setResizable(false);
		
		//para que el marco se abrá a pantalla completa
		//setExtendedState(Frame.MAXIMIZED_BOTH);
		
		setTitle("Hola Mundo!");
	}
}