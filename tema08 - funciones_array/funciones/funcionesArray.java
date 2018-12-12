
package funciones;

/**
 *
 * @author BrinCo
 */
public class funcionesArray {
    /*
     * Mostrar los arrays
     * 
     * @author BrinCo
     * @param  mostrar
     * @ return a
     * 
     */

    public static void muestraArray(int numIntrod[]){
        
        for(int i = 0; i < numIntrod.length; i++){
            System.out.println(numIntrod[i] + " ");
        }
        System.out.println();
    }
    
    /*
     *   Genera un array de tamaño n con números aleatorios cuyo
     * intervalo (mínimo y máximo) se indica como parámetro.
     * 
     * @author BrinCo
     * @param  generar un array
     * @ return a
     * 
     */

    public static int[] generaArrayInt(int numIntrod, int maximo, int minimo){
        
        int[] a = new int[numIntrod];
        
        for(int i = 0; i < numIntrod; i++){
            a[i] = (int)((Math.random() * (maximo - minimo) + 1) + minimo);
        }
        return a;
    }  
    
    /*
     * Devuelve el mínimo del array que se pasa como parámetro.
     * 
     * @author BrinCo
     * @param  a
     * @ return minimo
     * 
     */
    public static int minimoArrayInt(int a[]){
        
        int minimo = Integer.MAX_VALUE;
        
        for(int i = 0; i < a.length; i++){
            if(a[i] < minimo){
                minimo = a[i];
            }
        }
        
        return minimo;
    }  
}
