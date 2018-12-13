/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20_manejadorexcepciones;

/**
 *
 * @author brand
 */
public class ManejadorExcepciones implements Thread.
//manejador de excepciones para toda la aplicación
   UncaughtExceptionHandler{
    //implementa el método uncaughtException()
    public void uncaughtException(Thread t, Throwable e){
        System.out.printf("Thread que lanzó la excepción: %s \n", t.getName());
        //muestra en consola el hilo que produce la exceción
        e.printStackTrace();
        //muestra en consola la pila de llamadas
    }
}
