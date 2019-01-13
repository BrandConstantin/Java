/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg23_cliente_servidor;

/**
 *
 * @author brand
 */
import java.io.*;
import java.net.*;

class Servidor {

	static final int Puerto = 2000;

	public Servidor() {
		try {
			ServerSocket sServidor = new ServerSocket(Puerto);
			System.out.println("Escucho el puerto " + Puerto);

			for (int nCli = 0; nCli < 3; nCli++) {
				Socket sCliente = sServidor.accept();
				System.out.println("Sirvo al cliente " + nCli);
				DataOutputStream flujo_salida = new DataOutputStream(sCliente.getOutputStream());

				flujo_salida.writeUTF("Hola cliente " + nCli);
				sCliente.close();
			}
			System.out.println("Se han atendido los clientes");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] arg) {
		new Servidor();
	}

}
