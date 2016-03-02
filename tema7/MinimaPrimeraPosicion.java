/**
 * 
 *
 *  @author costy
 */

public class MinimaPrimeraPosicion{
  public static void main(String[] args) {
  
    System.out.println("Coloca el numero Maximo en la primera posicion");
    System.out.println("---------------------------------------------------------------------");
    
    int[] numero = new int[15];
    int numFinal;
    int numMinimo = 5000;
    int i;
    int posicion;
    
    //mostrar los numeros salidos
    for (i = 0; i < numero.length; i++){
        numero[i] = (int)(Math.random() * 200);
        System.out.print(numero[i] + "  ");
    }
    
    for (i = 0; i < numero.length; i++){
        if (numero[i] < numMinimo){
            numMinimo = numero[i];
            posicion = i;
        }
    }
    
    System.out.println("\nEl numero mínimo es: " + numMinimo);
    
    //reordenar el array con el maximo al principio
    System.out.println("El array ordenado con el maximo al principio quedaria asi: ");
    System.out.println("---------------------------------------------------------------------");
    
    while(numMinimo != numero[0]){ 
        numFinal = numero[14];
          for(int j = 14 ; j > 0; j--){
            numero[j] = numero[j - 1];
           }
          numero[0] = numFinal;	  
    }
    //se para en cuanto encuentra el numero mínimo
    for (i = 0; i < numero.length; i++) {
      System.out.printf(" %3d", numero[i]);
    }

  }
}
