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
public interface ImprimiblePorConsola extends Imprimible {

    default public void printConsola(String s) {
        System.out.println(s);
    }
}
