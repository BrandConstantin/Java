/**
 * Escribe un programa que nos diga el horóscopo a partir del día y el 
 * mes de nacimiento.
 * 
 * @author costy
 */

public class Ejer10 {
  public static void main(String[] args) {   
  
       
    System.out.println("Dime tu día de nacimiento");
    int dia = Integer.parseInt(System.console().readLine());
    
    System.out.println("Dime tu mes de nacimiento");
    int mes = Integer.parseInt(System.console().readLine());
    
    switch (mes) {
      case 1:
        if (dia>=21)
         System.out.println("Acuario");
        else
         System.out.println("Capricornio");
        break;
      case 2:
        if (dia>=20)
         System.out.println("Piscis");
        else
         System.out.println("Acuario");
        break;
      case 3:
        if (dia>=21)
         System.out.println("Aries");
        else
         System.out.println("Piscis");
        break;
      case 4:
        if (dia>=21)
         System.out.println("Tauro");
        else
         System.out.println("Aries");
        break;
      case 5:
        if (dia>=21)
         System.out.println("Geminis");
        else
         System.out.println("Tauro");
        break;
      case 6:
        if (dia>=21)
         System.out.println("Cancer");
        else
         System.out.println("Geminis");
        break;
      case 7:
        if (dia>=23)
         System.out.println("Leo");
        else
         System.out.println("Cancer");
        break;
       case 8:
        if (dia>=23)
         System.out.println("Virgo");
        else
         System.out.println("Leo");
        break;
       case 9:
        if (dia>=23)
         System.out.println("Libra");
        else
         System.out.println("Virgo");
        break;
       case 10:
        if (dia>=23)
         System.out.println("Escorpio");
        else
         System.out.println("Libra");
        break;
       case 11:
        if (dia>=23)
         System.out.println("Sagitaurio");
        else
         System.out.println("Escorpio");
        break;
       case 12:
        if (dia>=21)
         System.out.println("Capricornio");
        else
         System.out.println("Sagitaurio");
        break;
        default:
        System.out.println ("fecha incorrecta!");
    }
  }
}
