package h_cambiar_letra;

import java.awt.GraphicsEnvironment;
import javax.swing.*;

public class Ver_Fuentes_Instaladas_Sistema {

	public static void main(String[] args) {		
		String fuente = JOptionPane.showInputDialog("Introduce fuente:");
		boolean fuenteExiste = false;
		
		String[] fuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		for(String nombreFuente : fuentes) {
			//System.out.println(nombreFuente);
			if(nombreFuente.equals(fuente)) {
				fuenteExiste = true;
			}
		}
		
		if(fuenteExiste) {
			System.out.println("Fuente instalada");
		}else {
			System.out.println("Fuente inexistente");
		}
	}

}
