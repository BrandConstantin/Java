/**
 * Escribe un programa que diga cuál es la primera cifra de un número entero 
 * introducido por teclado. Se permiten números de hasta 5 cifras.
 * 
 * @author costy
 */

public class Ejer18 {
  public static void main(String[] args) {   
    
    System.out.println("Escribe cualquier numero y te digo la primera cifra");
    System.out.println("Se permiten numeros solo hasta 5 cifras");
    
    int numero = Integer.parseInt(System.console().readLine());
    
    int primeraCifra;
    /*
     * segundaCifra = (numero / 1000) % 10; (averiguar segunda cifra)
     * cuartaCifra = (numero / 10) % 10; (averiguar cuarta cifra)
     * quintaCifra = numero % 10; (averiguar quinta cifra)
     */
    
    if ((numero > 10000) && (numero < 100000)) {
      primeraCifra = numero / 10000;
      System.out.println("La primera cifra es " + primeraCifra);
    } else if ((numero > 1000) && (numero < 10000)){
      primeraCifra = numero / 1000;
      System.out.println("La primera cifra es " + primeraCifra);
    } else if ((numero > 100) && (numero < 1000)){
      primeraCifra = numero / 100;
      System.out.println("La primera cifra es " + primeraCifra);
    } else if ((numero > 10) && (numero < 100)){
      primeraCifra = numero / 10;
      System.out.println("La primera cifra es " + primeraCifra);
    } else if ((numero > 0) && (numero < 10)){
      primeraCifra = numero;
      System.out.println("La primera cifra es " + primeraCifra);
    } else {
      System.out.println("NO SE PERMITEN NUMEROS DE MAS DE 6 CIFRAS !!! ");
    }
  }
}
