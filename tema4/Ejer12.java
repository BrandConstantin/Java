/**
 * Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas
 * que se imparten en el curso. Cada pregunta acertada sumará un punto. 
 * El programa mostrará al final la calificación obtenida. Pásale el 
 * minicuestionario a tus compañeros y pídeles que lo hagan para ver qué tal 
 * andan de conocimientos en las diferentes asignaturas del curso.
 * 
 * @author costy
 */

public class Ejer12 {
  public static void main(String[] args) {   
  
    System.out.println("Cuestionario asignaturas IES Campanillas\n\n\n");
    
    System.out.println("I PREG:   Esta situado el edificio en el parque tecnolo"
    + "gico de Campanillas?");
    String pregunta1 = System.console().readLine();
    
    if (pregunta1.equals("si") || (pregunta1.equals("SI")){
      System.out.println("Has acertado!");
    } else (pregunta1.equals("no") || (pregunta1.equals("NO")){
      System.out.println("Erroneo!");
    } 
  }
}
