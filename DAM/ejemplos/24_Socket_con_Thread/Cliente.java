/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg24_socket_con_thread;

/**
 *
 * @author brand
 */
import java.io.*;
import java.net.*;

class Cliente {

	static final String HOST = "localhost";
	static final int Puerto = 2000;

	public Cliente() {
		try {
			Socket sCliente = new Socket(HOST, Puerto);
			// Creo los flujos de entrada y salida
			DataInputStream flujo_entrada = new DataInputStream(sCliente.getInputStream());
			DataOutputStream flujo_salida = new DataOutputStream(sCliente.getOutputStream());

			// TAREAS QUE REALIZA EL CLIENTE
			String datos = flujo_entrada.readUTF();
			System.out.println(datos);

			sCliente.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] arg) {
		new Cliente();
	}
}
