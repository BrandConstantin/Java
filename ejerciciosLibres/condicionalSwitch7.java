/*
 * Ejemplo de sentencia condicional con switch
 * Ejemplo 7
 * Dados como entrada 3 enteros representando la fecha como dia, mes año, 
 * imprimir la fecha del dia anterior. 
 *
 * @author costy
 */

import java.util.Scanner;

public class condicionalSwitch7 {
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        int d, m, a, ma, nd = 0;
        
        System.out.println("Ingrese el dia:");
        d = in.nextInt();
        System.out.println("Ingrese el mes:");
        m = in.nextInt();
        System.out.println("Ingrese el año:");
        a = in.nextInt();
        
        ma = m - 1;
        if (ma == 0) ma = 12;
        
        //Procesamiento
        switch (ma) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                nd = 31; break;
            case 4: case 6: case 9: case 11:
                nd = 30; break;
            case 2:
                if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0)
                nd = 29;
                else nd = 28;             
                break;
        }
        d = d - 1;
        if (d == 0);
        {d = nd;
        m = m - 1;
        if (m == 0){
            m = 12;
            a = a - 1;
        }
        }
        System.out.println("La fecha anterior es " + d + "/" + m + "/" + a);
    }
}
