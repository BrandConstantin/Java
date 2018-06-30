/*
 * Queremos calcular el volumen de una caja de embalaje de cartón (prisma rectángular), así como la superficie de
 * cartón total necesaria para construir la caja, conocidas sus dimensiones (altura, anchura y profundidad) y cuyos
 * valores se solicitarán al usuario para introducirlos desde teclado.
 */
package tema03;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class Volumen_Caja {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
      
        System.out.println("Cual es la anchura?");
        int anchura = datos.nextInt();
        System.out.println("Cual es la altura?");
        int altura = datos.nextInt();    
        System.out.println("Y la profundidad?");
        int profundidad = datos.nextInt();  
        
        //válculo del volumen y la superficie de la prisma rectángular u ortoedro
        int volumen = altura * anchura * profundidad;
        int superficie = ((2 * altura * anchura) + (2 * altura * profundidad) +(2 * anchura * profundidad));
        
        System.out.printf("El volumen es de %d y la superficie de %d", volumen, superficie);
    }
}
