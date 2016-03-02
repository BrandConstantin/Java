/**
 * 
 *
 *  @author costy
 */

public class OrdenarStrings{
  public static void main(String[] args) {
  
      System.out.println("El orden de los que van a ir a limpiar la casa esta semana son:");
      String [] numero= new String [6];
      numero[0]="Andre";
      numero[1]="Miguel";
      numero[2]="Larisa";
      numero[3]="Daniela";
      numero[4]="Juan ";
      numero[5]="Alba";
		
        for(int i = 0; i < 6; i++){
            int posicion1 = (int)(Math.random() * 6);
            int posicion2 = (int)(Math.random() * 6);
            String numero1 = numero[posicion1];
            String numero2 = numero[posicion2];
            numero[posicion1] = numero2;
            numero[posicion2] = numero1;
        }

       System.out.println();

    for (int i =0;i<6;i++){//para recorrer y mostrar un array
        System.out.print(numero[i]+", ");
    }      
    }
}
