/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author alumno
 */
public class Gato extends Mamifero{
    private String raza;
    
   /* public Gato(Sexo s, String r){
        super(s);
        this.raza = r;
    }
    */
    public Gato(Sexo s){
        super(s);
        this.raza = "siames";
    }
    
    public Gato(String r){
        super(Sexo.Hembra);
        this.raza = r;
    }
    
    public Gato(){
        super(Sexo.Macho);
        raza = "arabe";
    }
    
    public void maulla(){
        System.out.println("Miiiaaaauuuu");
    }
    
    public void come(String comida){
        if(comida.equals("pescado")){
            System.out.println("Me gusta");
        }else{
            System.out.println("No quiero otra cosa");
        }
    }
    
    public void pelea(Gato contricante){
        if(this.getSexo() == Sexo. Hembra){
            System.out.println("No quiero pelear");
        }else{
            if(contricante.getSexo() == Sexo.Hembra){
                System.out.println("No pelearer contra una macho");
            }else{
                System.out.println("Ven aqui que te matare");
            }
        }
    }
    
    public void caza(){
        System.out.println("Estare esperando un ratoncito....");
    }
}
