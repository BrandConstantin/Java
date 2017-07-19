/*
 * Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media,
 * la cantidad de alumnos mayores de 18 años, y la cantidad de alumnos que miden
 * más de 1.75.
 */
package tema04;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class Media_Estatura_y_Edades {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

        int edad = 0;
        double altura = 0;
        
        int sumaEdad = 0;
        double sumaAltura = 0;
        
        double mediaEdad = 0;
        double mediaAltura = 0;
        
        int numAlumnMayores = 0;
        int numAlumnAltos = 0;    
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Alumno nº: " + i);
            System.out.print("Introduce altura: ");
            altura = tecla.nextDouble();
            System.out.print("Introduce edad: ");
            edad = tecla.nextInt();
            
            //suma edad y altura
            sumaAltura += altura;
            sumaEdad += edad;

            //media edad y altura
            mediaEdad = (double)sumaEdad / 5;
            mediaAltura = sumaAltura / 5;

            //contar alumnos mayores de 18
            if(edad > 17){
                numAlumnMayores++;
            }

            //contar alumnos mayores de 1.75
            if(altura > 1.74){
                numAlumnAltos++;
            }
        }      
        
        //resultados
        System.out.println("La edad media de los alumnos es de " + mediaEdad);
        System.out.println("La altura media de los alumnos es de " + mediaAltura);
        System.out.println("Alumos mayores de 18 años hay " + numAlumnMayores);
        System.out.println("Alumos más altos de 1.75 hay " + numAlumnAltos);
    }
}
