package tema04;

/**
 * Realiza un programa que calcule el consumo calórico ideal diario de una persona según sus características
 * físicas y su actividad. El primer paso es calcular el RMB (ritmo metabólico basal) que da un número en Kcal/día
 * según la siguiente fórmula:
 * Hombres = 66,473 + (13,752 x peso en kg) + (5,0033 x altura en cm) - (6,755 x edad)
 * Mujeres = 655,0955 + (9,463 x peso en kg) + (1,8496 x altura en cm) - (4,6756 x edad)
 * A continuación, para obtener el consumo calórico ideal diario, hay que multiplicar el RMB por un número según
 * la actividad física: 1 para una persona inactiva, 1.2 para una persona con actividad física ligera, 1.4 para una
 * persona con actividad media, 1.6 para una persona muy activa y 1.8 para una persona de actividad extrema
 *
 * @author BrandConstantin
 */
import java.util.Scanner;

public class Consumo_Calorico{
  public static void main(String[] args) {
      
      Scanner datos = new Scanner(System.in);
      
      System.out.println("CONSUMO CALORICO");
      System.out.println("Si eres mujer escribe '1' y si eres hombre escribe '2'?");
      int sexo = datos.nextInt();
      
      if ((sexo == 1) || (sexo == 2)){

            System.out.println("Cual es tu peso en kg?");
            int peso = datos.nextInt();
            System.out.println("Cual es tu altura en cm?");
            int altura = datos.nextInt();
            System.out.println("Y tu edad?");
            int edad = datos.nextInt();

            double rmb = 0;

            switch (sexo){
                case 1:
                   rmb = (655.0955 + (9.463 * peso) + (1.8496 * altura) - (4.6756 * edad));  
                   System.out.printf("Tu RMB es de %.2f \n", rmb);
                    break;
                case 2:
                    rmb = (66.473 + (13.752 * peso) + (5.0033 * altura) - (6.755 * edad));
                    System.out.printf("Tu RMB es de %.2f \n", rmb);
                    break;
                default: 
            }
      
            System.out.println("Ahora vamos a ver tu consumo calorico diario");
            System.out.println("Elige el tipo de actividad fisica diaria: 1-persona inactiva, 2-actividad fisica ligera, 3-" + 
               "actividad media, 4-muy activa y 5-actividad extrema");
           double consumoCalorico;
           int actividadFisica = datos.nextInt();

                 switch (actividadFisica){
                     case 1:
                         consumoCalorico = rmb * 1;
                         System.out.println("Tu consumo calorico es de " + consumoCalorico + "Kcal/día");
                         break;
                     case 2:
                         consumoCalorico = rmb * 1.2;
                         System.out.println("Tu consumo calorico es de " + consumoCalorico  + "Kcal/día");
                         break;
                    case 3:
                         consumoCalorico = rmb * 1.4;
                         System.out.println("Tu consumo calorico es de " + consumoCalorico  + "Kcal/día");
                         break;
                    case 4:
                         consumoCalorico = rmb * 1.6;
                         System.out.println("Tu consumo calorico es de " + consumoCalorico  + "Kcal/día");
                         break;
                    case 5:
                         consumoCalorico = rmb * 1.8;
                         System.out.println("Tu consumo calorico es de " + consumoCalorico  + "Kcal/día");
                         break;
                    default: 
                         System.out.println("Otra vez numero fuera de rango!");
                         break;
                 }  
      } else {
           System.out.println("Numero fuera de rango! No podemos ver tu consumo calorico!");
      }
  }
}