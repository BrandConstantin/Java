/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg14_interbloqueo;

/**
 *
 * @author brand
 */
class FicheroB  {

  /****************************************************************************
   métodoB: simula el acceso al ficheroB con exclusión mutua. Duerme al hilo y
   * después invoca al método que le permitirá o intentará el acceso al ficheroA
   *
   * @param a 
   */

  public synchronized void metodoB(FicheroA a) {

    //imprime en la salida el nombre del hilo que ejecuta el método
    String name = Thread.currentThread().getName();
    System.out.println("Hilo " + name + " entra en fichero_B");

    try {
      //lo duerme durante 1s
      Thread.sleep(1000);
    } catch (Exception e) {}
    
    //imprime en la Salida el intento de llamada al método metodoA() del objeto a
    System.out.println("Hilo " + name + " intentando entrar en fichero_A");
    a.metodoA(this);
  }
}
  
 