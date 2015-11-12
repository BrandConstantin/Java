/**
 * La función de Ackermann se define como A(m,n) = n+1	si m = 0 A(m,n) = A(m-1,1)	si n = 0 A(m,n) = A(m-1, A(m,n-1))	en otro caso
 *
 * Realiza un programa en Java que incluya una función que permita calcular el  valor de la 
 * función de Ackermann. Muestra el valor al ejecutarse A(3,2)
 *
 * @author Profesor
 */

public class funcionAckermann {
       private static int A(int m , int n) {
           
           //int m 
           //int n = tecla.nextInt();
           int resultado = 0;
           
            if (m == 0) {
                resultado = (n + 1);
            } else if (n == 0) {
                resultado = A(m - 1, 1);
            } else {
                resultado = A(m - 1, A(m, n - 1));
            }
            return resultado;
       }

       public static void main(String[] args) {

            System.out.println("A(3,2) = " + A(3, 2));
       }
}
