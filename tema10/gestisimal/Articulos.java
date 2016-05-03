/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestisimal;

/**
 *
 * @author BrinCo
 */
public class Articulos {
    private String codigo = "NO DEFINIDO";
    private String descripcion;
    private double precioCompra;
    private double precioVenta;
    private int numUnidades;
    
    public Articulos(String codigo, String descripcion, double precioCompra, 
            double precioVenta, int numUnidades){
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.numUnidades = numUnidades;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public int getNumUnidades() {
        return numUnidades;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public void setNumUnidades(int numUnidades) {
        this.numUnidades = numUnidades;
    }

    @Override
    public String toString(){
        String cadena = "\n--------------------------------";
                cadena += "\nCódigo: " + this.codigo;
                cadena += "\nDescripción: " + this.descripcion;
                cadena += "\nPrecio de Compra: " + this.precioCompra;
                cadena += "\nPrecio de Venta: " + this.precioVenta;
                cadena += "\nStrock (número de unidades): " + this.numUnidades;
                cadena += "\n-------------------------------";

        return cadena;
    }
}
