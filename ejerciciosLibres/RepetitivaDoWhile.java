/*
 * Tabla multiplicar por 7
 *
 * @author costy
 */

public class RepetitivaDoWhile {
    public static void main(String[] args){
        
        int num = 7;
        int contador;
        int resultado = 0;
        
        //salida información
        System.out.println("Tabla de multiplicar del 7:");
        
        contador = 1;
        do {
            resultado = contador * num;
            System.out.println("Resultado es " + num + "X" + contador +
                    "=" + resultado);
            contador++;
        } while (contador <= 10);   
    }
}
