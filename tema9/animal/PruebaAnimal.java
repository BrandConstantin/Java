/*
 * 
 *
 * @author BrinCo
 */
package animal;

public class PruebaAnimal {
    public static void main(String[] args){
        Canario Tuzi = new Canario(Sexo.Macho);
        Tuzi.canta();
        Tuzi.balancea();
        Tuzi.come();
        System.out.println("----------------------------------------");
        
        Gato Fifi = new Gato(Sexo.Macho);
        Fifi.caza();
        Fifi.come();
        Fifi.maulla();
        Fifi.pelea();
        System.out.println("-----------------------------------------");
        
        Lagarto Godzila = new Lagarto(Sexo.Hembra);
        Godzila.baniar();
        Godzila.broncear();
        System.out.println("------------------------------------------");
        
        Perro Ricky = new Perro(Sexo.Macho);
        Ricky.come();
        Ricky.ladra();
        Ricky.rasca();
        Ricky.ladra();
        System.out.println("-------------------------------------------");
        
        Pinguino Linux = new Pinguino(Sexo.Macho);
        Linux.corre();
        Linux.gusta();
        Linux.nada();
    }

}
