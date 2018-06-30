/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cubo;

/**
 *
 * @author BrinCo
 */
public class Cubo {
    //atributos
    int capacidad;
    int contenido;
    
    //metodos
    
    //constructor
    Cubo (int c){
        this.capacidad = c;
    }
    
    //métodos getter
    int getCapacidad(){
        return this.capacidad;
    }
    
    int getContenido(){
        return this.contenido;
    }
    
    //métodos setter
    void setContenido(int litros){
        this.contenido = litros;
    }
    
    //otros métodos
    void vacia(){
        this.contenido = 0;
    }
    
    //llenar el cubo al máximo 
    void llena(){
        this.contenido = this.capacidad;
    }
    
    //pintar el cubo
    void pinta(){
        for(int nivel = this.capacidad; nivel > 0; nivel--){
            if(this.contenido >= nivel){
                System.out.println("#~~~~~~#");
            }else{
                System.out.println("#      #");
            }
        }
        System.out.println("########");
    }
    
    //vuelca el contenido de un cubo
    void vuelca(Cubo destino){
        int libres = destino.getCapacidad() - destino.getContenido();
        
        if(libres > 0){
            if(this.contenido <= libres){
                destino.setContenido(destino.getContenido() + this.contenido);
                this.vacia();
            }else{
                this.contenido -= libres;
                destino.llena();
            }
        }
    }
}
