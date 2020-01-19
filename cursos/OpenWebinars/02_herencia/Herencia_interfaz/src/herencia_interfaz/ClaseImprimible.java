/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_interfaz;

/**
 *
 * @author BrandConstantin
 */
public class ClaseImprimible implements /*Imprimible,*/ ImprimiblePorConsola {

    @Override
    public void print(String s) {
        System.out.println(s);
    }

}
