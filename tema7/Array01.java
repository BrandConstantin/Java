/*Define un array de 12 números enteros con nombre num y asigna los valores 
 * según la tabla que se muestra a continuación. Muestra el contenido de todos 
 * los elementos del array.
 * 
 * 
 *@Costy 
 */


public class Array01 {
  public static void main(String[] args) {
    int[] num = new int[11];
    num[0] = 39;
    num[1] = -2;
    //num[2];
    //num[3];
    num[4] = 0;
    //num[5];
    num[6] = 14;
    //num[7];
    num[8] = 5;
    num[9] = 120;
    //num[10];
    //num[11];
    
    for (int i = 0; i < 11; i++) {
    System.out.print(num[i] + " ");
    }
  }
}
