/*
 * Ejemplo de sentencia condicional
 *
 *
 * @author costy
 */
public class sentenciasCondicionales {
    public static void main(String[] args){
        int aciertos = 17;
        int errores = 3;
        int preguntas = 20;
        float nota = 0;
        String calificacion ="";
        
        //Procesamiento
        nota = ((aciertos - (errores/2)) * 10) / preguntas;
        
        if (nota < 5){
            calificacion = "insuficiente";
        } else {
            if (nota >= 5 && nota < 6)
                calificacion = "suficiente";
            if (nota >=6 && nota < 7)
                calificacion = "bien";
            if (nota >= 7 && nota < 9)
                calificacion = "notable";
            if (nota >= 9 && nota <= 10)
                calificacion = "sobresaliente";
        }
        System.out.println("La nota es " + nota + " y la calificación es " + 
                calificacion);
    }
}
