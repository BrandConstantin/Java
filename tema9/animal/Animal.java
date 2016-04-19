/*
 * Crea las clases Animal , Mamifero , Ave , Gato , Perro , Canario , Pinguino y 
 * Lagarto . Crea, al menos, tres métodos específicos de cada clase y redefne el/los 
 * método/s cuando sea necesario. Prueba las clases creadas en un programa en el 
 * que se instancien objetos y se les apliquen métodos.
 */
package animal;

/**
 *
 * @author alumno
 */
public abstract class Animal {
    //atributos de clase
    private static int anios = 0;
    private static double altura = 0;
    private static int kgComida = 0;
    private Sexo sexo;
    
    //atributos de instancia
    private double kgComidaAnual;

    public Animal(){
        this.sexo = Sexo.Macho;
        this.kgComidaAnual = 0;
    }
    public Animal (Sexo s){
        this.sexo = s; 
    }
    public Sexo getSexo(){
        return this.sexo;
    }
    
    public double getkgComidaAnual(){
        return this.kgComidaAnual = 0;
    }
    
    public static int getAnios(){
        return Animal.anios;
    }
    
    public static double getAltura(){
        return Animal.altura;
    }
    public static int getKgComida(){
        return Animal.kgComida;
    }
    
    public void come(String comida){
        System.out.println("Estoy comiendo " + comida);
    }
}
