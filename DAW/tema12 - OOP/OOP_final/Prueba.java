
public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleados trabajador1 = new Empleados("José Angeles");
		Empleados trabajador2 = new Empleados ("Maria Rodriguez");
		
		System.out.println(trabajador1.getDatos());
		System.out.println(trabajador2.getDatos());
		
		trabajador1.setSeccion("Contabilidad");
		
		System.out.println(trabajador1.getDatos());
		System.out.println(trabajador2.getDatos()); 		

	}

}

class Empleados{
	// se utiliza final para que nada y nadie cambie el valor de esta constante
	private final String nombre;
	private String seccion;
	
	public Empleados(String nombre) {
		super();
		this.nombre = nombre;
		seccion = "Administración";
	}
	
	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
	
	public String getDatos() {
		return "El nombre es " + nombre + " de la sección " + seccion;
	}
	
}
