/*
 * Nos han encargado realizar una aplicación sobre remedios naturales y empezaremos guardando
información sobre algunas plantas de tal forma que podamos saber su nombre común, su nombre
científico y sus propiedades. Crea un programa que pida al usuario el nombre común de una planta y
que, a continuación, nos muestre el nombre científico y sus propiedades curativas. Si la planta
introducida no existe, se mostrará el mensaje “Lo siento, esa planta no existe”.
Ejemplo:
Por favor, introduzca el nombre de una planta: romero
Nombre científico: rosmarinus officinalis
Propiedades: Tiene efectos estimulantes y tónicos, favorece en la recuperación de las enfermedades
respiratorias y del aparato digestivo.
La información se debe guardar en dos diccionarios (dos HashMap). Uno de ellos tendrá parejas
clave-valor del tipo (nombre común, nombre científico) y otro (nombre común, propiedades). El
programa no se dará por válido si no utiliza los dos HashMap indicados, aunque funcione bien.
 */
package t3c1_b;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class Herbolario {
    public static void main(String[] args) {
      Scanner t = new Scanner(System.in);
      HashMap<String, String> nombre = new HashMap<String, String>();
      HashMap<String, String> descripcion = new HashMap<String, String>();

      nombre.put("ortiga", "urtica dioica");
      nombre.put("romero", "rosmarinus officinalis");
      nombre.put("aloe vera", "aloe barbadensis miller");
      nombre.put("ayahuasca", "banisteriopsis caapi");

      descripcion.put("ortiga", "Es diurética y depurativa. Baja los niveles de colesterol.");
      descripcion.put("romero", "Tiene efectos estimulantes y tónicos, favorece en la recuperación de las enfermedades respiratorias y del aparato digestivo.");
      descripcion.put("aloe vera", "Regenera las células de la piel e incluso las de tejidos internos. Elimina hongos y virus. Protege el sistema inmunitario.");
      descripcion.put("ayahuasca", "Se usa en el tratamiento de la depresión y la ansiedad así como en los problemas de personalidad y esquizofrenia.");
      
      //Pide las palabras hasta que el usuario desee salir
      boolean sigue = true; 
      while(sigue) {
      System.out.print("Indique el nombre de la planta: ");
      String nombreIntroducido = t.nextLine();
        System.out.println("----------------------------------------------------------");
        
        if (nombre.containsKey(nombreIntroducido)){
          String cadena = "\nNombre común: "+nombreIntroducido;
          cadena += "\nNombre Científico: "+nombre.get(nombreIntroducido);
          cadena += "\nPropiedades: "+descripcion.get(nombreIntroducido);

          System.out.print(cadena);
        }
        else {
          System.out.println("Lo siento, la planta introducida no existe");
        }

          System.out.print("¿Desea usted seguir consultado?(s/n): ");
          String res = t.nextLine();
          if(res.equals("n")) {
              sigue = false;
          }
      }
  }
}
