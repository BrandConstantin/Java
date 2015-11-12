/**
 * Realiza un programa que pinte por pantalla diez líneas formadas por
 * caracteres. El carácter con el que se pinta cada línea se elige de forma 
 * aleatoria entre uno de los siguientes: *, -, =, ., |, @. Las líneas deben 
 * tener una longitud aleatoria entre 1 y 40 caracteres.
 * @author costy
 */

public class Ejer10 {
  public static void main(String[] args){
    
    int caracterAleatorio;
    String simbolo = "";
    int f;
    
    System.out.println("DIBUJO DE 10 LINEAS DE CARÁCTERES");
    
    for (f = 1; f <= 10; f++){
        caracterAleatorio = (int)(Math.random() * 6);
     
        switch (caracterAleatorio){
          case 0: simbolo = "*";
            break;
          case 1: simbolo = "€";
            break;
          case 2: simbolo = "#";
            break;
          case 3: simbolo = "$";
            break;
          case 4: simbolo = "%";
            break;
         case 5: simbolo = "@";
            break;
         default:
        }
        int caracter = (int)(Math.random() * 40) + 1;
        for (int g = 0; g <= caracter; g++){
            System.out.print(simbolo);
        }
        System.out.println("");
    }
  }
}
