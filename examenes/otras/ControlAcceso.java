/*
 * Como parte de una aplicación más grande, nos han encargado el control de acceso mediante nombre
de usuario y contraseña. La información se debe guardar en dos diccionarios (dos HashMap). Uno de
ellos tendrá parejas clave-valor del tipo (usuario, contraseña) y otro (usuario, nombre completo). El
programa no se dará por válido si no utiliza los dos HashMap indicados, aunque funcione bien.
 */
package repesca_2016;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class ControlAcceso {
        public static void main(String[] args) {
          Scanner t = new Scanner(System.in);
          System.out.println("CONTROL ACCESO");
          System.out.println("--------------------------------------------");

          HashMap<String, String> usuario = new HashMap<String, String>();
          HashMap<String, String> contrasenia = new HashMap<String, String>();

          usuario.put("albri", "111");
          usuario.put("mario", "222");
          usuario.put("yolap", "333");
          usuario.put("mogal", "444");
          usuario.put("alque", "555");

         contrasenia.put("albri", "Alan Brido Delgado");
         contrasenia.put("mario", "Mario Neta Grande");
         contrasenia.put("yolap", "Yola Prieto Fuerte");
         contrasenia.put("mogal", "Mónica Galindo Entrematas");
         contrasenia.put("alque", "Albert Quero del Agua");
         
          System.out.println("Indica tu nombre usuario: ");
          String usu = t.nextLine();
          System.out.println("--------------------------------------------------------------------------------------------");
          
          if (!usuario.containsKey(usu)){
            System.out.println("Usuario inexistente!");
          }
          
          if(usuario.containsKey(usu)){
            System.out.println("Indica tu contraseña: ");
            String contra = t.nextLine();            
            
            if(!usuario.get(usu).equals(contra)){
              System.out.println("Contraseña no correcta!");            
            }else{
              System.out.println("Bienvenido " + contrasenia.get(usu));
            }
          }
        }
}
