package servidor;

import javax.swing.*;
import java.awt.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Servidor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoServidor mimarco = new MarcoServidor();

		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}

class MarcoServidor extends JFrame implements Runnable {

	public MarcoServidor() {

		setBounds(1200, 500, 480, 350);

		JPanel milamina = new JPanel();

		milamina.setLayout(new BorderLayout());

		areatexto = new JTextArea();

		milamina.add(areatexto, BorderLayout.CENTER);

		add(milamina);

		setVisible(true);

		Thread mihilo = new Thread(this);
		mihilo.start();

	}

	private JTextArea areatexto;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//System.out.println("Estoy a la escucha");

		final int PUERTO = 1800;
		char characters[];
		int countA = 0;
		int countE = 0;
		int countO = 0;

		try {
			ServerSocket eSocket = new ServerSocket(PUERTO, 50);
			System.out.println("Iniciando el servidor!");

			while (true) {
				Socket sCliente = eSocket.accept();

				//flujo entrada es lo que recibe del cliente
				DataInputStream flujo_entrada = new DataInputStream(sCliente.getInputStream());
				String mensaje = flujo_entrada.readUTF();

//				DataOutputStream flujo_salida = new DataOutputStream(sCliente.getOutputStream());	
				if (mensaje.length() < 1) {
//					System.out.println(mensaje.length());
					System.err.println("Error en comando: no se reconoce");
					areatexto.append("\nError en comando: no se reconoce");
				} else {
					characters = mensaje.toCharArray();

					for (int i = 0; i < characters.length; i++) {
						if ((characters[i] == 'A')) {
							countA++;
						} else if ((characters[i] == 'E')) {
							countE++;
						} else if ((characters[i] == 'O')) {
							countO++;
						}
					}

					if (!mensaje.equals("END")) {
						areatexto.append("\n" + mensaje + " --> " + countA + " " + countE + " " + countO);

						countA = 0;
						countE = 0;
						countO = 0;
					} else {
//					flujo_salida.writeUTF("Hola mundo desde el servidor");					
						sCliente.close();
						System.out.println("Cliente desconectado");
						areatexto.append("\nPrograma finalizado");
					}
				}
			}
		} catch (SocketException e) {
			Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, e);
		} catch (IOException e) {
			Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, e);
		}
//		}
	}

}
