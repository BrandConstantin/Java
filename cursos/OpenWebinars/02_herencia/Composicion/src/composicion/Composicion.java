/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicion;

/**
 *
 * @author BrandConstantin
 */
public class Composicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Provincia sevilla = new Provincia("Sevilla");

        sevilla.getMunicipios().add(new Municipio("Sevilla", 690576));
        sevilla.getMunicipios().add(new Municipio("Dos Hermanas", 131855));
        sevilla.getMunicipios().add(new Municipio("Mairena del Aljarafe", 45040));

        System.out.println(sevilla);
    }

}
