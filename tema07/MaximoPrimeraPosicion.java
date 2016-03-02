/**
 * 
 *
 *  @author costy
 */

public class MaximoPrimeraPosicion{
  public static void main(String[] args) {
  
    System.out.println("Coloca el numero Maximo en la primera posicion");
    System.out.println("---------------------------------------------------------------------");
    
    int[] numero = new int[15];
    int numFinal;
    int numMaximo = 0;
    int i;
    int posicion;
    
    //mostrar los numeros salidos
    for (i = 0; i < numero.length; i++){
        numero[i] = (int)(Math.random() * 200);
        System.out.print(numero[i] + "  ");
    }
    
    for (i = 0; i < numero.length; i++){
        if (numero[i] > numMaximo){
            numMaximo = numero[i];
            posicion = i;
        }
    }
    
    System.out.println("\nEl numero maximo es: " + numMaximo);
    
    //reordenar el array con el maximo al principio
    System.out.println("El array ordenado con el maximo al principio quedaria asi: ");
    System.out.println("---------------------------------------------------------------------");
   
    while(numMaximo != numero[0]){ 
        numFinal = numero[14];
          for(int j = 14 ; j > 0; j--){
            numero[j] = numero[j - 1];
           }      
          numero[0] = numFinal;	  
    } 
    //se para en cuanto encuentra el numero maximo
    for (i = 0; i < numero.length; i++) {
      System.out.printf(" %3d", numero[i]);
    }
  }
}
