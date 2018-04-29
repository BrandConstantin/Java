/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3c1_b.Empleado;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author BrinCo
 */
public class Empleado {
    public static void main(String[] args) {
        ArrayList<DatosEmpleados> e = new ArrayList<>();
        
        DatosEmpleados e1 = new DatosEmpleados("Elba", "Lazo");
        DatosEmpleados e2 = new DatosEmpleados("Elba", "Quero");
        DatosEmpleados e3 = new DatosEmpleados("Albert", "Quero");
        DatosEmpleados e4 = new DatosEmpleados("Mario", "Neta");
        DatosEmpleados e5 = new DatosEmpleados("Yola", "Prieto");
        DatosEmpleados e6 = new DatosEmpleados("Monica", "Galindo");
        
        e2.asignaCargo("Diseñador gráfico");
        e5.asignaCargo("Programador senior");
        e6.asignaCargo("Programador junior");
        
        e.add(e1);
        e.add(e2);
        e.add(e3);
        e.add(e4);
        e.add(e5);
        e.add(e6);
        
        Collections.sort(e);
        
        for (DatosEmpleados empleadoAux : e) {
            System.out.println(empleadoAux);
        }
        
        System.out.println("DatosEmpleadoss totales: " + DatosEmpleados.getEmpleadosTotales());
        System.out.println("DatosEmpleadoss con cargo: " + DatosEmpleados.getEmpleadosConCargo());
    }
}
