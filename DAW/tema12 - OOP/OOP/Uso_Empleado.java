package oop;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleado empleado1 = new Empleado("Paco Gomez", 86000, 1990, 12, 17);
		Empleado empleado2 = new Empleado("Laura Paca", 13000, 1987, 12, 02);
		Empleado empleado3 = new Empleado("Maria Martin", 186000, 1954, 2, 27);
		Empleado empleado4 = new Empleado("Juan Jesus");
		Empleado empleado5 = new Empleado("Vanesa Martin", 76000);
		Empleado empleado6 = new Empleado("Jesús Lorenzo");
		
		empleado1.subeSueldo(4);
		empleado2.subeSueldo(5);
		empleado3.subeSueldo(1);
		
		System.out.println("Nombre: " + empleado1.getNombre() + " Sueldo: " + empleado1.getSueldo() + " Fecha Alta: " + empleado1.getAltaContrato());
		System.out.println("Nombre: " + empleado2.getNombre() + " Sueldo: " + empleado2.getSueldo() + " Fecha Alta: " + empleado2.getAltaContrato());
		System.out.println("Nombre: " + empleado3.getNombre() + " Sueldo: " + empleado3.getSueldo() + " Fecha Alta: " + empleado3.getAltaContrato());
		System.out.println("Nombre: " + empleado4.getNombre() + " Sueldo: " + empleado4.getSueldo() + " Fecha Alta: " + empleado4.getAltaContrato());
		System.out.println("Nombre: " + empleado5.getNombre() + " Sueldo: " + empleado5.getSueldo() + " Fecha Alta: " + empleado5.getAltaContrato());
		System.out.println("Nombre: " + empleado6.getNombre() + " Sueldo: " + empleado6.getSueldo() + " Fecha Alta: " + empleado6.getAltaContrato());
		
		// código alternativo 
		System.out.println("----------------------------------------------------");
		
		Empleado[] misEmpleados = new Empleado[3];
		misEmpleados[0] = new Empleado("Paco Gomez", 86000, 1990, 12, 17);
		misEmpleados[1] = new Empleado("Laura Paca", 13000, 1987, 12, 02);
		misEmpleados[2] = new Empleado("Maria Martin", 186000, 1954, 2, 27);
		
		for (Empleado empleado : misEmpleados) {			
			System.out.println(empleado.getNombre() + " \tSueldo: " + empleado.getSueldo());
		}
		
		System.out.println("Subir sueldo ->");
		
		for (Empleado empleado : misEmpleados) {	
			empleado.subeSueldo(4);
			System.out.println(empleado.getNombre() + " \tSueldo: " + empleado.getSueldo());
		}
		
	}

}