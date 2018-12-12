/*
 * Implementa el control de acceso al área restringida de un programa. Se debe pedir un
 * nombre de usuario y una contraseña. Si el usuario introduce los datos correctamente,
 * el programa dirá “Ha accedido al área restringida”. El usuario tendrá un máximo de 3
 * oportunidades. Si se agotan las oportunidades el programa dirá “Lo siento, no tiene acceso
 * al área restringida”. Los nombres de usuario con sus correspondientes contraseñas deben
 * estar almacenados en una estructura de la clase HashMap.
 */
package tema10;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class ControlDeAccesoConHashMap {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        HashMap<String, String> h = new HashMap<String, String>();
        
        String usuario;
        String clave;
        boolean acceso = false;
        int oportunidades = 3;
        
        h.put("CostyMoreno", "ab123");
        h.put("AndresCarlinho", "cd456");
        h.put("MauricioBenga", "ef789");
        h.put("LisaAndra", "gh1011");
        
        System.out.println("Accede a tu área");
        System.out.println("###########################");
        
        do{
            System.out.print("USUARIO: ");
            usuario = t.nextLine();
            System.out.print("CONTRASEÑA: ");
            clave = t.nextLine();
            
            if(h.containsKey(usuario)){//si el usuario existe....
                if(h.get(usuario).equals(clave)){
                    System.out.println("Bienvenido a tu área!");
                    acceso = true; 
                }else{
                    acceso = false;
                    System.out.println("Contraseña incorrecta!");
                }
            }else{//el usuario no existe, entonce..... 
                System.out.println("Usuario inexistente!");
            }
            
            oportunidades--;
            
            if(!acceso && (oportunidades > 0)){
                System.out.println("Te quedan " + oportunidades + " intentos de acceso");
            }
        }while((oportunidades > 0) && (!acceso));
        
        if(!acceso){
            System.out.println("No tienes acceso a esta área!");
        }
    }
}
