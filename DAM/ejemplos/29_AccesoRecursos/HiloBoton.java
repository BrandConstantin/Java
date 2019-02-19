import java.io.*;
//
import java.net.URL;
import java.net.URLConnection;
import java.net.MalformedURLException;
//
import java.util.Date;
import javax.swing.JFileChooser;

/**
 * ****************************************************************************
 * hilo para obtener el contenido de una URL tecleada por el usuario, según el 
 * 'Content-Type' enviado por el Servidor:
 *
 * -si es 'application/pdf', pide la ruta del disco donde se desea guardar el
 * fichero pdf
 *
 * -si es 'text/html...', muestra el cuerpo de la página en la Salida
 *
 * -en cualquier otro caso, advierte de que no sabe qué hacer con el contenido
 *
 * @author IMCG
 */
class HiloBoton extends Thread {
  //variables locales
  private final String cadenaURL;
  /**
   * **************************************************************************
   * constructor
   *
   * @param cadenaURL
   */
  public HiloBoton(String cadenaURL) {
    //
    this.cadenaURL = cadenaURL;
  }
 //código asociado al hilo
  @Override
  public void run() {
    //variables locales
    int leido, contentLength;
    char[] bufChar;
    byte[] bufByte;
    //
    try {
      //crea objeto url
      URL url = new URL(cadenaURL);
      //obtiene una conexión al recurso URL
      URLConnection conexion = url.openConnection();
      //se conecta pudiendo interactuar con parámetros
      conexion.connect();
      //obtiene el tipo de contenido
      String contentType = conexion.getContentType();
      System.out.println("Encabezados destacados:\n* Content-Type: "
              + contentType);
      //obtiene el tamaño del contenido
      contentLength = conexion.getContentLength();
      System.out.println("* Content-Length: " + contentLength);
       //obtiene la fecha de la  última modificación
      Date fecha = new Date( conexion.getLastModified() );
      System.out.println("* Fecha de la última modificación: "+ fecha );
      //según el tipo de contenido...
      //...si se trata de un fichero pdf **************************************
      if (contentType.equals("application/pdf")) {
        //muestra un cuadro de diálogo modal para generar el fichero de destino
        File archivoElegido = ficheroDestino();
        //si fichero generado correctamente
        if (archivoElegido != null) {
          //flujo de descarga desde la url
          InputStream reader = url.openStream();
          //flujo de escritura en el fichero
          FileOutputStream writer =new FileOutputStream(archivoElegido.getPath());
          //buffer intermedio ajustado al Content-Length enviado por el Servidor
          bufByte = new byte[contentLength];
          System.out.println("\nDescargando pdf en el directorio elegido...");
          //mientras quedan bytes por leer en el buffer intermedio
          while ((leido = reader.read(bufByte)) > 0) {
            writer.write(bufByte, 0, leido);
          }
          //cierra el flujo de escritura
          writer.close();
          System.out.println("El pdf ha sido descargado correctamente");
        }
      } //si se trata de texto o contenido html *******************************
      else if (contentType.startsWith("text/html")) {
        //flujo para descargar el cuerpo del texto o página html
        InputStream imputString = conexion.getInputStream();
        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(imputString));
        //buffer intermedio de tamaño medio
        bufChar = new char[512];
        //
        System.out.println("\nEscribiendo el cuerpo de texto en la Salida...");
        //mientras quedan caracteres por leer
        while ((leido = bufferedReader.read(bufChar)) > 0) {
          //los escribe en la Salida
          System.out.println("Cuerpo: " + new String(bufChar, 0, leido));
        }
        //
        System.out.println("Cuerpo de texto obtenido"
                + " correctamente");
      } //en cualquier otro caso **********************************************
      else {
        System.out.println("No sé que hacer con el tipo de "
                + "contenido indicado");
      }
    } catch (MalformedURLException e) {
           System.err.println("URL sin sentido");
    } catch (IOException e) {
           System.err.println("Error de lectura/escritura");
    } finally {
      //termina la aplicación
      System.exit(0);
    }
  }
  /**
   * **************************************************************************
   * muestra un cuadro de diálogo para crear un fichero pdf en la ruta indicada
   * por el usuario
   *
   * @return
   */
  private File ficheroDestino() {
    //cuadro de diálogo 'guardar como' de Java...
    JFileChooser fc = new JFileChooser();
    //...posicionado en el archivo de nombre tomado de la url
    fc.setSelectedFile(new File(cadenaURL.substring(cadenaURL.lastIndexOf("/"))
            + (cadenaURL.endsWith(".pdf") ? "" : ".pdf")));
    //muestra el cuadro de diálogo en pantalla
    int showSaveDialog = fc.showSaveDialog(null);
    //si se pulsa 'Aceptar'
    if (showSaveDialog == JFileChooser.APPROVE_OPTION) {
      //devuelve el archivo indicado por el usuario
      return fc.getSelectedFile();
    }
    //devuelve nulo
    return null;
  }
}
