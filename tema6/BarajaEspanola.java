/**
 * Igual que el ejercicio anterior pero con la baraja española. Se utilizará la
 * baraja de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
* 
 * 
 * @author costy
 */

public class BarajaEspanola {
  public static void main(String[] args) {
    
    System.out.println("Te enseñare una carta de la baraja española");
    
    int numero = (int)(Math.random() * 10) + 1;
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
          figura = String.valueOf(numero); break;
        case 8:
          figura = "SOTA"; break;
        case 9: 
          figura = "CABALLO"; break;
        case 10:
          figura = "REY"; break;
      }
    System.out.print("La carta es " + figura);
    
    int palos = (int)(Math.random() * 4);
    
      switch(palos) {
        case 0:
          System.out.println(" de ORO");
          break;
        case 1:
          System.out.println(" de COPA");
          break;
        case 2:
          System.out.println(" de ESPADA");
          break;
        case 3:
          System.out.println(" de BASTOS");
          break;
    }
  }
}
