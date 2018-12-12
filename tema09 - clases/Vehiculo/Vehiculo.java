/*
 *
 * @author BrinCo
 */
public abstract class Vehiculo {
    //atributos de clase
    private static int vehiculosCreados = 0;
    private static double kilometrosTotales = 0;
    
    //atributos de instancia
    private double kilometrosRecorridos;

    public Vehiculo(){
        this.kilometrosRecorridos = 0;
    }
    
    public double getKilometrosRecorridos(){
        return this.kilometrosRecorridos = 0;
    }
    
    public static double getKilometrosTotales(){
        return Vehiculo.kilometrosTotales;
    }
    
    public void recorre(double k){
        this.kilometrosRecorridos += k;
        Vehiculo.kilometrosTotales += k;
    }
}
