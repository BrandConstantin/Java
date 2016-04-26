/*
 * Realiza el programa “Colección de discos” por tu cuenta, mirando lo menos
posible el ejemplo que se proporciona. Pruébalo primero para ver cómo
funciona y luego intenta implementarlo tú mismo.
 */
package poo;

/**
 *
 * @author BrinCo
 */
public class Discos {
    private String codigo = "LIBRE";
    private String autor;
    private String titulo;
    private String genero;
    private int duracion;

    public String getCodigo() {
        return codigo;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    public String toString(){
        String cadena = "\n--------------------------------";
                cadena += "\nCódigo: " + this.codigo;
                cadena += "\nAutos: " + this.autor;
                cadena += "\nTitulo: " + this.titulo;
                cadena += "\nGénero: " + this.genero;
                cadena += "\nDuración: " + this.duracion;
                cadena += "\n-------------------------------";
                
                return cadena;
    }
}
