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
    
    int puntos = 0;
    
    System.out.println("I PREG:   Esta situado el edificio en el parque tecnolo"
    + "gico de Campanillas?");
    String pregunta1 = (System.console().readLine()).toUpperCase();
    
    if (pregunta1.equals("SI")){
      puntos += 1;
      System.out.println("Has acertado!");
    } else {
      System.out.println("Erroneo!");
    } 
    
    System.out.println("II PREG:   Se abre la puerta tods los días a las 8 de "
    + "la mañana?");
    String pregunta2 = (System.console().readLine()).toUpperCase();
    
    if (pregunta2.equals("NO")){
      puntos += 1;
      System.out.println("Has acertado!");
    } else {
      System.out.println("Erroneo!");
    } 
    
    System.out.println("III PREG:   Tiene cada alumno un portatil asignado?"
    );
    String pregunta3 = (System.console().readLine()).toUpperCase();
    
    if (pregunta3.equals("SI")){
      puntos += 1;
      System.out.println("Has acertado!");
    } else {
      System.out.println("Erroneo!");
    } 
    
        System.out.println("IV PREG:   Es Eva quien te enseña Lenguaje de "
    + "Marcas?");
    String pregunta4 = (System.console().readLine()).toUpperCase();
    
    if (pregunta4.equals("SI")){
      puntos += 1;
      System.out.println("Has acertado!");
    } else {
      System.out.println("Erroneo!");
    } 
    
        System.out.println("V PREG:   Es Programación la asignatura donde mas "
    + "practicas estamos haciendo?");
    String pregunta5 = (System.console().readLine()).toUpperCase();
    
    if (pregunta5.equals("SI")){
      puntos += 1;
      System.out.println("Has acertado!");
    } else {
      System.out.println("Erroneo!");
    } 
    
        System.out.println("VI PREG:   Hay en tu clase solo 5 mujeres?");
    String pregunta6 = (System.console().readLine()).toUpperCase();
    
    if (pregunta6.equals("SI")){
      puntos += 1;
      System.out.println("Has acertado!");
    } else {
      System.out.println("Erroneo!");
    } 
    
        System.out.println("VII PREG:   Hay en tu clase mas de 10 imigrantes?");
    String pregunta7 = (System.console().readLine()).toUpperCase();
    
    if (pregunta7.equals("NO")){
      puntos += 1;
      System.out.println("Has acertado!");
    } else {
      System.out.println("Erroneo!");
    } 
    
        System.out.println("VIII PREG:   Es Sistemas Informatico donde se habla "
    + "de ordenadores, robots y ovni?");
    String pregunta8 = (System.console().readLine()).toUpperCase();
    
    if (pregunta8.equals("NO")){
      puntos += 1;
      System.out.println("Has acertado!");
    } else {
      System.out.println("Erroneo!");
    } 
    
        System.out.println("IX PREG:   Es José Francisco tu profe de programación"
    + "?");
    String pregunta9 = (System.console().readLine()).toUpperCase();
    
    if (pregunta9.equals("NO")){
      puntos += 1;
      System.out.println("Has acertado!");
    } else {
      System.out.println("Erroneo!");
    } 
    
        System.out.println("X PREG:   Has echo ya en Programación el primer "
    + "examen la semana pasada?");
    String pregunta10 = (System.console().readLine()).toUpperCase();
    
    if (pregunta10.equals("SI")){
      puntos += 1;
      System.out.println("Has acertado!");
    } else {
      System.out.println("Erroneo!");
    } 
    
    System.out.println("El total de las preguntas acertadas son " + puntos);
    
  }
}
