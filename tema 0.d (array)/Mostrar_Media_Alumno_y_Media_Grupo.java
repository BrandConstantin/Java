/*
 * Mostrar media de un grupa en cada trimestre y la media de un alumno encontrado
 * en la posicion indicada
 */
package tema.pkg0.d.array;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class Mostrar_Media_Alumno_y_Media_Grupo {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        int trimI[] = new int[5];
        int trimII[] = new int[5];
        int trimIII[] = new int[5];
        int i;
        int num;
        int sumaTrimI = 0;
        int sumaTrimII = 0;
        int sumaTrimIII = 0;
        double mediaAlumno = 0;
        
        System.out.println("Mostrar notas de los tres trimestres");
        System.out.println("============================================");
        
        //leemos las notas del primer trimestre
        System.out.println("Notas TRIM I");
        for(i = 0; i < trimI.length; i++){
            System.out.print("Alumno (" + (i + 1) + "): ");
            trimI[i] = tec.nextInt();
        }
        //leemos las notas del segundo trimestre
        System.out.println("Notas TRIM II");
        for(i = 0; i < trimII.length; i++){
            System.out.print("Alumno (" + (i + 1) + "): ");
            trimII[i] = tec.nextInt();
        }
        //leemos las notas del tercer trimestre
        System.out.println("Notas TRIM III");
        for(i = 0; i < trimIII.length; i++){
            System.out.print("Alumno (" + (i + 1) + "): ");
            trimIII[i] = tec.nextInt();
        }
        System.out.println("·················································");
        
        //calculamos las medias
        for(i = 0; i < 5; i++){
            sumaTrimI += trimI[i];
            sumaTrimII += trimII[i];
            sumaTrimIII += trimIII[i];
        }
        
        //mostramos los datos
        System.out.println("Media Trim I: " + (sumaTrimI / 5.0));
        System.out.println("Media Trim II: " + (sumaTrimII / 5.0));
        System.out.println("Media Trim III: " + (sumaTrimIII / 5.0));
        System.out.println("·················································");
        
        //leemos la nota del alumno de la posición indicada
        System.out.println("Indica la posición del alumno [0-4]: ");
        num = tec.nextInt();
        
        //la media del alumno es la suma de las notas de los tres trimestre entre 3
        mediaAlumno = (double)(trimI[num] + trimII[num] + trimIII[num]) / 3;
        System.out.println("Media Alumno: " + mediaAlumno);
        
        
    }
}
