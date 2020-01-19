/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulacion.servicio;

import encapsulacion.modelo.Persona;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author BrandConstantin
 */
public class Servicio {

    List<Persona> lista;

    public Servicio() {
        lista = new ArrayList<>();
    }

    public void addPersona(Persona p) {
        lista.add(p);
    }

    public void editarPersona(Persona p) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getDni().equalsIgnoreCase(p.getDni())) {
                lista.set(i, p);
            }
        }

    }

    public void eliminarPersona(Persona p) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getDni().equalsIgnoreCase(p.getDni())) {
                lista.remove(i);
            }
        }

    }

    public List<Persona> listarTodasPersonas() {
        return lista;
    }
}
