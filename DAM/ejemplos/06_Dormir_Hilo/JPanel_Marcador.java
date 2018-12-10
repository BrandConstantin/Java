//@author IMCG

package PaquetePrincipal;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import javax.swing.JPanel;
/**
 *
 * @author IMCG
 */

/* marcador basado en un JPanel, para pintar el valor entero almacenado en la
 * variable valor */
public class JPanel_Marcador extends JPanel {

    public int valor;
    //valor que mostrará el panel

    public JPanel_Marcador() {
        //constructor
        valor = 0;
        //valor por defecto
        this.setSize(250, 50);
        //dimensiona el JPanel
        this.setFont(new Font("Tahoma", 0, 48));
        //establece la fuente del texto dibujado
    }

    @Override
    public void paintComponent(Graphics g) {
        /* sombrea el método paintComponent(g) que pinta el JPanel,
         para que lo haga según el valor actual*/
        super.paintComponent(g);
        int anchuraPanel = this.getWidth();
        //anchura del panel
        String strValor = String.valueOf(valor);
        //convertimos el entero en cadena
        FontMetrics fontMetrics = g.getFontMetrics();
        //obtenemos el contexto métrico de la fuente con la que
        //escribiremos la cadena
        int anchuraValor = fontMetrics.stringWidth(strValor);
        //mide la anchura que ocupará la cadena de texto con la fuente elegida,
        g.setColor(Color.black);
        g.fillRect(0, 0, anchuraPanel, this.getHeight());
        if (valor > 0) {
            g.setColor(Color.yellow);
            g.drawString(strValor, anchuraPanel - anchuraValor,
                    fontMetrics.getAscent() - 5);
            //dibuja la cadena: a 5 puntos de distancia entre la base de
            //la línea y el borde inferior, y alineada a la derecha
        }
    }
}
