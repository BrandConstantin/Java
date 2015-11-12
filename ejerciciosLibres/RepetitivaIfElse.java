/*
 * @author costy
 */

import java.util.Scanner;

public class RepetitivaIfElse {
    public static void main(String[] args){
        
        System.out.println("Calcule la masa corporal IMC");
        Scanner tecla = new Scanner(System.in);   
        System.out.println("Introduce el peso en kg");
        double peso = tecla.nextDouble();
        System.out.println("Introduce la altura en cm");
        double altura = tecla.nextDouble()/100;
        //calculamos imc
        double imc = peso / (altura*altura);
        System.out.println("Para un peso de " + peso + " kg y una altura de " +
                altura + " metros, el indice de masa corporal es de " + (int)imc);
        
        
        if (imc < 16)
            System.out.println("Necesita ingresar en hospital!");
        else if (imc < 17)
            System.out.println("Tiene infrapeso!");
        else if (imc < 18)
            System.out.println("Tiene bajo peso!");
        else if (imc < 26)
            System.out.println("Tiene peso saludable!");
        else if (imc < 30)
            System.out.println("Tiene sobrepeso de grado I!");
        else if (imc < 35)
            System.out.println("Tiene obesidad de grado II!");
        else if (imc < 40)
            System.out.println("Tiene obesidad premórbida de grado III!");
        else
            System.out.println("Tiene obesidad mórbida o de grado IV!");
    }
}
