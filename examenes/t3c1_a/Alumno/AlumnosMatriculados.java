/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3c1_a.Alumno;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author BrinCo
 */
public class AlumnosMatriculados implements Comparable<AlumnosMatriculados> {
  //atributos de clase
  private static int totalAlumnos = 0;
  private static int alumnosMatriculados = 0;
  
  //atributos de instancia
  private String nombre;
  private String apellido;
  private String matricula = "";
  
  //metodo constructor
  public AlumnosMatriculados(String nombre, String apellido) {
    this.nombre = nombre;
    this.apellido = apellido;
    AlumnosMatriculados.totalAlumnos++;
  }
  
  //getter
  public static int getTotalAlumnos() {
    return totalAlumnos;
  }

  public static int getAlumnosMatriculados() {
    return alumnosMatriculados;
  }

  public String getApellido() {
    return apellido;
  }

  public String getNombre() {
    return nombre;
  }
  
  //métodos
  public void matricula(String c) {
    this.matricula = c;
    AlumnosMatriculados.alumnosMatriculados++;
  }
  
  @Override
  public String toString() {
    String matriculaAux = this.matricula;
    
    if (this.matricula.equals("")) {
      matriculaAux = "(Alumno no matriculado)";
    }
    return this.apellido + ", " + this.nombre + " - " + matriculaAux;
  }


  @Override
  public int compareTo(AlumnosMatriculados a) {
    if (this.apellido.equals(a. getApellido())) {
      return this.nombre.compareTo(a.getNombre());
    } else {
      return this.apellido.compareTo(a.getApellido());
    }    
  }
}
