
public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleados trabajador1 = new Empleados("José Angeles");
		Empleados trabajador2 = new Empleados ("Maria Rodriguez");
		Empleados trabajador3 = new Empleados ("Antonio Garcia");
		
		System.out.println(trabajador1.getDatos());
		System.out.println(trabajador2.getDatos());
		
		trabajador1.setSeccion("Contabilidad");
		
		System.out.println(trabajador1.getDatos());
		System.out.println(trabajador2.getDatos()); 		
		System.out.println(trabajador3.getDatos());
		
		System.out.println(Empleados.nextId());
	}

}

class Empleados{
	// se utiliza final para que nada y nadie cambie el valor de esta constante
	private final String nombre;
	private String seccion;
	private int id;
	private static int addId = 1;
	
	public Empleados(String nombre) {
		super();
		this.nombre = nombre;
		seccion = "Administración";
		id = addId;
		addId++;
	}
	
	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
	
	public String getDatos() {
		return "El nombre es " + nombre + " de la sección " + seccion + " con id " + id;
	}
	
	public static String nextId() {
		return "El id siguiente es " + addId;
	}
	
}
