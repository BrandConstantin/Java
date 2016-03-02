/**
 *
 * @author costy
 */
public class MayorNumero {
    public static void main(String[] args) {

        System.out.println("Ordenar numeros de mayor a menor");
        System.out.println("=================================================================");
        
        int [] numero = new int [10];
        int numMaximo = 0;
        int i;
        
        for(i = 0; i < 10; i++){
        numero[i] = (int)(Math.random() * 11);
        System.out.print(numero[i] + " ");
        }

        for(i = 0; i < 10; i++){
            if(numero[i] > numMaximo){ 
            numMaximo = numero[i];
            } 
        }
        System.out.println("El numero maximo es " + numMaximo);
     }
}
