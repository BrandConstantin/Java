/**
 * Escribe un programa en que dado un número del 1 a 7 escriba el 
 * correspondiente nombre del día de la semana
 *
 * @author costy
 */

public class Ejer3 {
  public static void main(String[] args) {   
  
    System.out.print("Escribe un numero de 1 a 7! \n");
    int num = Integer.parseInt(System.console().readLine());
    
    String dia;
    
    switch (num) {
      case 1:
        dia = "LUNES";
        break;
      case 2:
        dia = "MARTES";
        break;
      case 3:
        dia = "MIERCOLES";
        break;
      case 4:
        dia = "JUEVES";
        break;
      case 5:
        dia = "VIERNES";
        break;
      case 6:
        dia = "SABADO";
        break;
      case 7:
        dia = "DOMINGO";
        break;
      default:
        dia = "uno que no existe ;) ";
        break;
    }
    System.out.println("El dia de la semana que coresponde es " + dia);
  }
}
