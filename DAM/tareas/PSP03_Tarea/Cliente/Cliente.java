package cliente;

import java.awt.event.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.swing.*;
import java.net.*;

public class Cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoCliente mimarco = new MarcoCliente();

		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoCliente extends JFrame {

	public MarcoCliente() {

		setBounds(600, 300, 280, 350);

		LaminaMarcoCliente milamina = new LaminaMarcoCliente();

		add(milamina);

		setVisible(true);
	}

}

class LaminaMarcoCliente extends JPanel {

	public LaminaMarcoCliente() {

		JLabel texto = new JLabel("Introduzca cadena de caracteres:");

		add(texto);

		campo1 = new JTextField(20);

		add(campo1);

		miboton = new JButton("Enviar");

		EnviarTexto mievento = new EnviarTexto();
		miboton.addActionListener(mievento);

		add(miboton);

	}

	private class EnviarTexto implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			//System.out.println(campo1.getText());

			final String HOST = "localhost";
			//	static final String HOST = "192.168.1.130";
			final int PUERTO = 1800;

			try {
				Socket sCliente = new Socket(HOST, PUERTO);

				InputStream aux2 = sCliente.getInputStream();
				DataInputStream flujo_entrada = new DataInputStream(aux2);
				OutputStream aux = sCliente.getOutputStream();
				DataOutputStream flujo_salida = new DataOutputStream(aux);
				String campo = campo1.getText().toUpperCase();
//				flujo_salida.writeUTF(campo);

				if (campo.equals("END")) {
					flujo_salida.writeUTF("END");
					flujo_salida.close();
					flujo_entrada.close();
					sCliente.close();
				} else {
					flujo_salida.writeUTF(campo);
				}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				System.out.println(e1.getMessage());
			}
		}

	}

	private JTextField campo1;

	private JButton miboton;

}
