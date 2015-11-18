/*
 * Define un array de 10 caracteres con nombre simbolo y asigna valores a los 
 * elementos según la tabla que se muestra a continuación. Muestra el contenido
 *  de todos los elementos del array. ¿Qué sucede con los valores de los 
 * elementos que no han sido inicializados?
 * 
 * 
 *@Costy 
 */


public class Array02 {
  public static void main(String[] args) {
    char[] simbolo = new char[9];
    simbolo[0] = 'a';
    simbolo[1] = 'x';
    //simbolo[2];
    //simbolo[3];
    simbolo[4] = '@';
    //simbolo[5];
    simbolo[6] = ' ';
    simbolo[7] = '+';
    simbolo[8] = 'Q';
    //simbolo[9];
    
    for (int i = 0; i < simbolo.length; i++) {
    System.out.print(simbolo[i] + " ");
    }
  }
}
