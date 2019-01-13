/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg22_socketudp;

/**
 *
 * @author brand
 */
import java.net.*;
import java.io.*;

public class EmisorUDP {

	public static void main(String args[]) {
		// Comprueba los argumentos
		if (args.length != 2) {
			System.err.println("Uso: java EmisorUDP maquina mensaje");
		} else {
			try {
				// Crea el socket 
				DatagramSocket sSocket = new DatagramSocket();

				// Construye la dirección del socket del receptor 
				InetAddress maquina = InetAddress.getByName(args[0]);
				int Puerto = 1500;

				// Crea el mensaje
				byte[] cadena = args[1].getBytes();
				DatagramPacket mensaje = new DatagramPacket(cadena, args[1].length(), maquina, Puerto);

				// Envía el mensaje 
				sSocket.send(mensaje);

				// Cierra el socket 
				sSocket.close();
			} catch (UnknownHostException e) {
				System.err.println("Desconocido: " + e.getMessage());
			} catch (SocketException e) {
				System.err.println("Socket: " + e.getMessage());
			} catch (IOException e) {
				System.err.println("E/S: " + e.getMessage());
			}
		}
	}
}
