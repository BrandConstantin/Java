/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_clases;

/**
 *
 * @author BrandConstantin
 */
public class Hija extends Base {

    public Hija(String n, String a) {
        super(n, a);
    }

    public void metodo() {
        //this.nombre = Pepe;   // Imposible acceder. Nos da error
        this.setNombre("Pepe"); // Funciona perfectamente. porque se accede desde método
        this.apellidos = "Perez";
    }

    public void print() {
        System.out.println(this.getNombre() + " " + this.apellidos);
    }
}
