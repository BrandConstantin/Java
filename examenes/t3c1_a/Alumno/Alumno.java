/*
 * 
Implementa la clase Alumno. Sobre cada alumno se quiere saber su nombre, apellido y curso en el
que está matriculado. En principio, cuando se da de alta un alumno sólo se indican nombre y apellido.
Posteriormente, se puede matricular a un alumno indicando el grupo. La ordenación de los alumnos se
realiza en función del apellido; si coincide el apellido se ordena por nombre. Es necesario saber el
número total de alumnos dados de alta y el número de alumnos matriculados. El siguiente programa
(se adjunta con el enunciado del examen) genera la salida que se muestra:
 */
package t3c1_a.Alumno;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author BrinCo
 */
public class Alumno {
    public static void main(String[] args) {
        ArrayList<AlumnosMatriculados> a = new ArrayList<>();

        AlumnosMatriculados a1 = new AlumnosMatriculados("Elba", "Lazo");
        AlumnosMatriculados a2 = new AlumnosMatriculados("Elba", "Quero");
        a2.matricula("2º BACH");
        AlumnosMatriculados a3 = new AlumnosMatriculados("Albert", "Quero");
        AlumnosMatriculados a4 = new AlumnosMatriculados("Mario", "Neta");
        AlumnosMatriculados a5 = new AlumnosMatriculados("Yola", "Prieto");
        a5.matricula("1º DAW");
        AlumnosMatriculados a6 = new AlumnosMatriculados("Monica", "Galindo");
        a6.matricula("2º DAW");

        a.add(a1);
        a.add(a2);
        a.add(a3);
        a.add(a4);
        a.add(a5);
        a.add(a6);

        Collections.sort(a);

        for (AlumnosMatriculados miAlumno: a) {
          System.out.println(miAlumno);
        }

        System.out.println("Alumnos totales: " + AlumnosMatriculados.getTotalAlumnos());
        System.out.println("Alumnos matriculados: " + AlumnosMatriculados.getAlumnosMatriculados());
  }
}
