/*
 *Implementa la clase Empleado. Sobre cada empleado se quiere saber su nombre, apellido y cargo
que ostenta en la empresa. En principio, cuando se da de alta un empleado sólo se indican nombre y
apellido. Posteriormente, se puede asignar un cargo a un empleado. La ordenación de los empleados
se realiza en función del apellido; si coincide el apellido se ordena por nombre. Es necesario saber el
número total de empleados dados de alta y el número de empleados que tienen un cargo asignado.
 */
package t3c1_b.Empleado;

/**
 *
 * @author BrinCo
 */
public class DatosEmpleados implements Comparable<DatosEmpleados>{
    private static int empleadosTotales = 0;
    private static int empleadosConCargo = 0;
    
    private String nombre;
    private String apellido;
    private String cargo = " ";

    public DatosEmpleados(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        DatosEmpleados.empleadosTotales++;
    }
    
    public static int getEmpleadosTotales(){
        return empleadosTotales;
    }
    
    public static int getEmpleadosConCargo(){
        return empleadosConCargo;
    }
    
    //getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCargo() {
        return cargo;
    }
    
    public void asignaCargo(String c){
        this.cargo = c;
        DatosEmpleados.empleadosConCargo++;
    }
    
    @Override
    public String toString(){
        String cargoAux = this.cargo;
        
        if(this.cargo.equals(" ")){
            cargoAux = "sin cargo";
        }
        
        return this.apellido + " - " + this.nombre + " - " + cargoAux;
    }
    
    @Override
    public int compareTo(DatosEmpleados e){
        if(this.apellido.equals(e.getApellido())){
            return this.nombre.compareTo(e.getNombre());
        }else{
            return this.apellido.compareTo(e.getApellido());
        }
    }
}
