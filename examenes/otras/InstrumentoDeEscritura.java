/*
 * Crea un ArrayList de 5 objetos aleatorios de la clase InstrumentoDeEscritura. Un instrumento de
escritura tiene los atributos tipo (lápiz, bolígrafo o rotulador), tamaño (grande o pequeño) y color
(azul, rojo o negro). La clase InstrumentoDeEscritura debe tener un único constructor al que no se le
pasa ningún parámetro. El constructor debe generar los valores de los atributos de forma aleatoria.
Debe haber por tanto, dos ficheros, uno con nombre InstrumentoDeEscritura.java, que define la clase
InstrumentoDeEscritura, y otro fichero que es el programa donde se crea el ArrayList.
Ejemplo:
bolígrafo rojo pequeño
lápiz azul grande
lápiz negro pequeño
rotulador rojo pequeño
bolígrafo azul grande
 */
package repesca_2016;

import java.util.ArrayList;

/**
 *
 * @author BrinCo
 */
public class InstrumentoDeEscritura {
  
  private static String tipoInstru[] = {"lapiz", "boligrafo", "rotulador"};
  private static String tamanioInstru[] = {"grande", "pequeño"};
  private static String colorInstru[] = {"rojo", "azul", "negro", "verde", "amarillo", "maron", "blanco"};
  
  private String tipo;
  private String color;
  private String tamanio;
  
  //constructor
  public InstrumentoDeEscritura() {
    int aleatorioTipo = (int)(Math.random() * 3);
    this.tipo = tipoInstru[aleatorioTipo];
    int aleatorioTamanio = (int)(Math.random() * 2);
    this.tamanio = tamanioInstru[aleatorioTamanio];
    int aleatorioColor = (int)(Math.random() * 7);
    this.color = colorInstru[aleatorioColor];
  }
  
  //métodos

  //mostrar instrumentos
  @Override
  public String toString(){
      return tipo + " " + color + " " + tamanio;
  }
}
