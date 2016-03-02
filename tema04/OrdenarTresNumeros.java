/**
 * Escribe un programa que ordene tres números enteros introducidos por teclado.
 *
 * @author Costy
 */
import java.util.Scanner;
public class OrdenarTresNumeros {

  public static void main(String[] args) {
    Scanner tecla = new Scanner (System.in);

    System.out.println("ORDENAR 3 NUMEROS");
    System.out.println("===============================================");
    
    System.out.print("Introduce el primer numero:");
    int num1 = tecla.nextInt();
    System.out.print("Introduce el segundo numero:");
    int num2 = tecla.nextInt();
    System.out.print("Introduce el tercer numero:");
    int num3 = tecla.nextInt();
    
    int menor;
    int medio;
    int mayor;
    
    if((num1 > num2) && (num1 > num3)){
        mayor = num1;
    } else if((num2 > num1) && (num2 > num3)){
        mayor = num2;
    } else {
        mayor = num3;
    }
    
    if((num1 < num2) && (num1 < num3)){
        menor = num1;
    } else if((num2 < num1) && (num2 < num3)){
        menor = num2;
    } else {
        menor = num3;
    } 
    
    //al introducir el primer y el segundo numeros iguales me da error el programa
    if((mayor == num1) && (menor == num3)){
        medio = num2;
    } else if ((mayor == num2) && (menor == num3)){
        medio = num1;
    } else {
        medio = num3;
    }
    
    medio = (num1 + num2 + num3) - (mayor + menor);
    System.out.println("Los numeros ordenados son: " + menor + " " + medio + " " + mayor);

  }
}
