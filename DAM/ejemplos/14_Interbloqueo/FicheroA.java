/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg14_interbloqueo;

/**
 *
 * @author brand
 */
class FicheroA {

 /******************************************************************************
  *  métodoA: simula el acceso al ficheroA con exclusión mutua. Duerme al hilo y
  * después invoca al método que le permitirá o intentará el acceso al ficheroB
  * @param b
  */
  public synchronized void metodoA(FicheroB b) {

    //imprime en la salida el nombre del hilo que ejecuta el método
    String name = Thread.currentThread().getName();
    System.out.println("Hilo " + name + " entra en fichero_A");

    try {
      Thread.sleep(1000);
    } catch (Exception e) {}

    System.out.println("Hilo " + name + " intentando acceder a fichero_B");
    b.metodoB(this);
  }

  public synchronized void syn2() {

    System.out.println("Dentro de A.syn2");
  }
}
