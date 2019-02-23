package pkg31_programarcliente_smtp;

import java.util.Properties;
//para los siguiente import hay que descargarse el paquete JavaMail de Java:
//  http://www.oracle.com/technetwork/java/index-138643.html
//y agregar la biblioteca mail.jar
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * ****************************************************************************
 * programa para enviar correo desde una cuenta de gmail.com por el puerto 465
 * SMTP sobre el protocolo seguro SSL (tiene que ser seguro, porque ni Google ni
 * ningún otro proveedor dejan enviar hoy día por el puerto 25)
 *
 * @author IMCG
 */
class EnviarCorreoSSL {

	//cuenta de usuario en gmail.com
	private static final String cuentaUsuario = "usuario@gmail.com";
	//contraseña (puede ponerse sin miedo, ya que se enviará encriptada)
	private static final String password = "contraseña";
	//dirección de correo del destinatario
	private static final String mailDestinatario = "destinatario@dominio";

	/**
	 ****************************************************************************
	 *
	 *
	 * @param args
	 */
	public static void main(String[] args) {

		//valora propiedades para construir la sesión con el servidor
		Properties props = new Properties();
		//servidor SMTP
		props.put("mail.smtp.host", "smtp.gmail.com");
		//puerto para el socket de sesión
		props.put("mail.smtp.socketFactory.port", "465");
		//tipo de socket
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		//identificación requerida
		props.put("mail.smtp.auth", "true");
		//puerto smtp
		props.put("mail.smtp.port", "465");

		//abre una nueva sesión contra el servidor basada en:
		//el usuario, la contraseña y las propiedades especificadas
		Session session = Session.getDefaultInstance(props,
				new javax.mail.Authenticator() {

			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(cuentaUsuario, password);
			}
		});

		try {
			//compone el mensaje
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(cuentaUsuario));
			message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse(mailDestinatario));
			//asunto
			message.setSubject("Prueba de envio");
			//cuerpo del mensaje
			message.setText("Estimado amig@:\n\nEste email es sólo para saludarte");
			//envía el mensaje, realizando conexión, transmisión y desconexión
			Transport.send(message);
			//lo da por enviado
			System.out.println("Enviado!");
		} catch (MessagingException e) {
			//tramita la excepción
			throw new RuntimeException(e);
		}
	}
}
