/*
 * Ejemplo de sentencia condicional con switch
 */

/**
 *
 * @author costy
 */
public class condicionalSwitch {
    public static void main(String[] args){
        int aciertos = 17;
        int errores = 3;
        int preguntas = 20;
        int nota = 0;
        String calificacion ="";
        
        //Procesamiento
        nota = ((aciertos - (errores/2)) * 10) / preguntas;
        
        switch (nota) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4: calificacion = "insuficiente";
                break;
            case 5: calificacion = "suficiente";
                break;
            case 6: calificacion = "bien";
                break;
            case 7: 
            case 8: calificacion = "notable";
                break;
            case 9:
            case 10: calificacion = "sobresaliente";
                break;
        }
        System.out.println("La nota es " + nota + " y la calificación es " + 
                calificacion);
    }
}
