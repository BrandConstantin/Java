/*
 * Tabla multiplicar por 7
 *
 * @author costy
 */

public class RepetitivaFor {
    public static void main(String[] args){
        
        int num = 7;
        int contador;
        int resultado = 0;
        
        //salida información
        System.out.println("Tabla de multiplicar del 7:");
        
        for (contador = 1; contador <= 10; contador++){
            resultado = contador * num;
            System.out.println("Resultado es " + num + "X" + contador +
                    "=" + resultado);
        }    
    }
}
