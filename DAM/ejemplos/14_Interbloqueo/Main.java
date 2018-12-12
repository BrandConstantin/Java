/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg14_interbloqueo;

/******************************************************************************
 *Programa ejemplo de interbloqueo o deadlock.
 * Supongamos dos hilos y que cada hilo necesita privilegios exclusivos de
 * escritura en dos archivos distintos. El hilo1 podría abrir el archivoA de
 * forma exclusiva y el hilo2 hacer lo mismo con el archivoB.
 * Estando el hilo1 en el aechivoA necesita acceso exclusivo al archivoB y
 * estando el hilo2 en archivoB necesita acceso exclusivo al archivoA.
 * Ambos hilos se obstaculizarán entre sí y se bloquean indefinidamente. Se abrá
 * producido un interbloqueo.
 * 
 * @author brand
 */
class Main {

 //Se crean ficheros de ambos tipos, A y B
  static FicheroA a = new FicheroA();
   static FicheroB b = new FicheroB();


  public static void main(String args[]) {
    //crea e inicia los hilos que ejecutarán los métodos synchronized, y que 
    //provocarán el interbloqueo
    Hilo1 hilo1 = new Hilo1(a, b);
    Hilo2 hilo2 = new Hilo2(a, b);
    hilo1.start();
    hilo2.start();
  }
}
