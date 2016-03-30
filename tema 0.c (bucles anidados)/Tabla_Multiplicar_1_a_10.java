/*
 * Tabla de multiplicar de 1 a 10
 */
package tema.pkg0.c.bucles.anidados;

/**
 *
 * @author BrinCo
 */
public class Tabla_Multiplicar_1_a_10 {
    public static void main(String[] args) {
        
        int tabla;
        int i;
        
        System.out.println("Tabla multiplicar de 1 a 10");
        System.out.println("==================================");
        
        for(tabla = 1; tabla <= 10; tabla++){
            System.out.println("\tTabla del " + tabla);
            System.out.println("---------------------");
            
            for(i = 1; i <= 10; i++){
                System.out.println(tabla + "X" + i + "=" + (tabla * i));
            }
        }
    }
}
