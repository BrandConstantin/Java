/*
 * Crea la clase Tiempo con los métodos suma y resta. Los objetos de la clase Tiempo
son intervalos de tiempo y se crean de la forma Tiempo t = new Tiempo(1, 20,
30) donde los parámetros que se le pasan al constructor son las horas, los
minutos y los segundos respectivamente. Crea el método toString para ver los
intervalos de tiempo de la forma 10h 35m 5s. Si se suman por ejemplo 30m 40s y
35m 20s el resultado debería ser 1h 6m 0s. Realiza un programa de prueba para
comprobar que la clase funciona bien.
 */
package tiempo;

/**
 *
 * @author BrinCo
 */
public class Tiempo {
    //metodos
    private static int suma;
    private static int resta;
    
    //objeto de clase
    private int segundos;
    
    public Tiempo (int horas, int minutos, int segundos){
        this.segundos = (horas * 3600) + (minutos * 60) + segundos;
    }
    
    public Tiempo(int s){
        this.segundos = s;
    }
    
    public String toString(){
        int segundos = this.segundos;
        int horas = segundos/3600;
        segundos -= horas * 3600;
        int minutos = segundos / 60;
        segundos -= minutos * 60;
        
        if(this.segundos < 0){
            return " -(" + (-horas) + "h " + (-minutos) + "m " + (-segundos) + "s)";
        }else{
            return horas + "h " + minutos + "m " + segundos + "s";
        }
    }
    
    private int getSegundos(){
        return this.segundos;
    }
    
    public Tiempo suma(Tiempo t){
        return new Tiempo(this.segundos + t.getSegundos());
    }
    
    public Tiempo resta(Tiempo t){
        return new Tiempo(this.segundos + t.getSegundos());
    }
}
