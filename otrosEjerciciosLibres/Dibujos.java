import java.util.Scanner;

public class Dibujos{
    public static void main(String[] args){
        
        Scanner datos = new Scanner(System.in);
        
        System.out.println("Introduce numros de lineas que quieres que tenga tu dibujo:");
        int lineas = datos.nextInt();
        System.out.println("Introduce el caracter que quieres que tenga tu dibujo:");
        String caracter = datos.next();

       System.out.println("CUADRADO");
        for (int i = 0; i < lineas; i++) {
            for (int j = 0; j < lineas; j++) {
                    System.out.print(caracter);
            }
           System.out.print("\n");
        }

        System.out.println("ROMBO");
        for (int i = 1; i <= (lineas/2) + 1; i++) {
            for (int j = 0; j < i; j++) {
                    System.out.print(caracter);
            }
            System.out.print("\n");
        }	
        for (int i = (lineas/2); i > 0; i--) {
            for (int j = 0; j < i; j++) {
                    System.out.print(caracter);
            }
           System.out.print("\n");
        }			

        System.out.println("ABETO");
             int contador = 1;
             for (int i = 1; i <= lineas; i++){
                 contador++;
                 for (int j = 1; j <= contador; j++){
                        for (int k = 0; k < j; k++){
                             System.out.print(caracter);
                           }
                       System.out.print("\n");
                 }			
             }
    }
}
