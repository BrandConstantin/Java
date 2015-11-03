/**
 * Realiza un programa que muestre al azar el nombre de una carta de la baraja 
 * francesa. Esta baraja está dividida en cuatro palos: picas, corazones, 
 * diamantes y tréboles. Cada palo está formado por 13 cartas, de las cuales 9 
 * cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A 
 * (que sería el 1). Para convertir un número en una cadena de caracteres 
 * podemos usar String.valueOf(n) .
 * 
 * @author costy
 */

public class Ejer02 {
  public static void main(String[] args) {
    
    System.out.println("Te enseñare una carta de la baraja francesa");
    
    int numero = (int)(Math.random() * 13) + 1;
    String figura = "";
    
      switch(numero) {
        case 1:
          figura = "AS";
          break;
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
        case 7:
        case 8:
        case 9:
        case 10:
          figura = String.valueOf(numero); break;
        case 11: 
          figura = "J"; break;
        case 12: 
          figura = "Q"; break;
        case 13:
          figura = "K"; break;
      }
    System.out.print("La carta es " + figura);
    
    int palos = (int)(Math.random() * 4);
    
      switch(palos) {
        case 0:
          System.out.println(" de PICA");
          break;
        case 1:
          System.out.println(" de CORAZON");
          break;
        case 2:
          System.out.println(" de DIAMANTE");
          break;
        case 3:
          System.out.println(" de TREBOL");
          break;
    }
  }
}
