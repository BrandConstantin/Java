/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 * @author costy
 */
public class Caballo {
    //atributos
    String nombre;
    String sexo;
    String raza;
    double altura;
    double peso;
    double velocidad;
    int edad;
    int medallasGanadas;
    int descendientes;
   
    //métodos
    
    //constructor

    public Caballo(String nombre, String sexo, String raza, double altura,
                    double peso, double velocidad, int edad, int medallasGanadas,
                    int descendientes) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.raza = raza;
        this.altura = altura;
        this.peso = peso;
        this.velocidad = velocidad;
        this.edad = edad;
        this.medallasGanadas = medallasGanadas;
        this.descendientes = descendientes;
    }
    
    public Caballo(String nombre, String sexo, String raza) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.raza = raza;
    }
        
    public Caballo() {
        this.sexo = "macho";
    }
    
    public Caballo(String nombre, String sexo) {
        this.nombre = nombre;
        this.sexo = sexo;
    }
    
    //getters

    public String getNombre() {
        return nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public String getRaza() {
        return raza;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public int getEdad() {
        return edad;
    }

    public int getMedallasGanadas() {
        return medallasGanadas;
    }

    public int getDescendientes() {
        return descendientes;
    }
    
    //hacer que el caballo reaccione
    public void salta(){
        System.out.println("salto! salto! salto!");
    }
    
    public void come(String comida){
        if(comida.equals("ierba")){
            System.out.println("Quiero comer más ierba");
        }else{
            System.out.println("Manzana!! mmm que rica!");
        }
    }
        
    public void corre(){
        System.out.println("Hoy me propongo alcanzar la velocidad de 60 km");
    }
    
    public void bebe(){
        System.out.println("Luego me bebere 15 L de agua");
    }
    
    public void empareja(Caballo contricante){
        if(contricante.getSexo().equals("hembra")){
            System.out.println("Me emparejo con una campeona mundial!");
        } else {
            System.out.println("me peleare contigo por esta hembra");
        }
    }
}

