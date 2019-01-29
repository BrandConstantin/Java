import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;

public class Temporizador2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// y convocar el constructor por defecto
		//Reloj miReloj = new Reloj(2000, true);
		Reloj miReloj = new Reloj();
		miReloj.enMarcha(2000, true);
		
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener");
		System.exit(0);
	}

}

class Reloj{
	// podemos prescindir de la declaración de los campos de clase y definirlos como parámetros de enMarcha
	//private int intervalo;
	//private boolean sonido;
	
//	public Reloj(int intervalo, boolean sonido) {
//		this.intervalo = intervalo;
//		this.sonido = sonido;
//	}
	
	// como se declaran como parámetros hay que poner delante final porque se acceden desde dentro de la clase
	public void enMarcha(int intervalo, final boolean sonido) {
		// las clases private para la clase interna
		class ObjetoTemporizador2 implements ActionListener{
			public void actionPerformed(ActionEvent evento) {
				Date ahora = new Date();
				System.out.println("Hora: " + ahora);
				
				if(sonido) {
					Toolkit.getDefaultToolkit().beep();
				}
			}
			
		}
		
		//la clase interna solo se utiliza una sola vez
		ActionListener oyente = new ObjetoTemporizador2();
		Timer miTemporizador = new Timer(intervalo, oyente);
		miTemporizador.start();
	}	
}