
package funciones;

/**
 *
 * @author BrinCo
 */
public class funcionesArray {
    /*
     *   Genera un array de tamaño n con números aleatorios cuyo
     * intervalo (mínimo y máximo) se indica como parámetro.
     * 
     * @author BrinCo
     * @param  generar un array
     * @ return array
     * 
     */

    public static int[] generaArrayInt(int longitud, int maximo, int minimo){
        
        int[] a = new int[longitud];
        
        for(int i = 0; i < longitud; i++){
            a[i] = (int)((Math.random() * (maximo - minimo) + 1) + minimo);
        }
        return a;
    } 
}
