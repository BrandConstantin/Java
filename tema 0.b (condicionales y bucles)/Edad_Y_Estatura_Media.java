/*
 * Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media,
 * la cantidad de alumnos mayores de 18 años, y la cantidad de alumnos que miden
 * más de 1.75.
 */
package tema.pkg0.b.condicionales.y.bucles;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class Edad_Y_Estatura_Media {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

        int edad;
        double altura;
        int sumaEdad = 0;
        double sumaAltura = 0;
        int mediaEdad = 0;
        double mediaAltura = 0;
        int numAlumnMayores = 0;
        int numAlumnAltos = 0;

        System.out.println("Ver alumnos altos y mayores de edad");
        System.out.println("==================================");

        for(int i = 1; i <= 5; i++){
            System.out.println("Alumno " + i);
            System.out.println("Introduce edad alumno:");
            edad = tecla.nextInt();
            System.out.println("Introduce altura alumno:");
            altura = tecla.nextDouble();

            if(edad >= 18){
                numAlumnMayores++;
            }
            if(altura >= 1.75){
                numAlumnAltos++;
            }
            
            sumaEdad += edad;
            sumaAltura += altura;
        }
        
        mediaEdad = sumaEdad / 5;
        mediaAltura = sumaAltura / 5;
        
        System.out.println("La edad media de los alumnos es de " + mediaEdad);
        System.out.println("La altura media de los alumnos es de " + mediaAltura);
        System.out.println("Mayores de 18 años hay " + numAlumnMayores);
        System.out.println("Mayores de 1.75 hay " + numAlumnAltos);
    }
}
