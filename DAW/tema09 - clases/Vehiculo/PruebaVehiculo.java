/**
 * 2. Crea la clase Vehiculo , así como las clases Bicicleta y Coche
 *    como subclases de la primera. Para la clase Vehiculo , crea los
 *    atributos de clase vehiculosCreados y kilometrosTotales , así como
 *    el atributo de instancia kilometrosRecorridos . Crea también algún
 *    método específico para cada una de las subclases. Prueba las
 *    clases creadas mediante un programa con un menú como el que se
 *    muestra a continuación:
 *    VEHÍCULOS
 *    ===================================================
 *    1. Anda con la bicicleta
 *    2. Haz el caballito con la bicicleta
 *    3. Anda con el coche
 *    4. Quema rueda con el coche
 *    5. Ver kilometraje de la bicicleta
 *    6. Ver kilometraje del coche
 *    7. Ver kilometraje total
 *    8. Salir
 *    Elige una opción (1-8):
 * 
 * @author BrinCo
 */
import java.util.Scanner;
public class PruebaVehiculo {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        int opcion = 0;
        double km;
        
        Bicicleta bici1 = new Bicicleta(15);
        Coche coche1 = new Coche(245, 310, 3);
        
        while(opcion != 8){
            System.out.println("1. Anda con la bicicleta");
            System.out.println("2. Haz el caballito con la bicicleta");
            System.out.println("3. Anda con el coche");
            System.out.println("4. Quema rueda con el coche");
            System.out.println("5. Ver kilometraje de la bicicleta");
            System.out.println("6. Ver kilometraje del coche");
            System.out.println("7. Ver kilometraje total");
            System.out.println("8. Salir");
            System.out.println("Elige una opción (1-8): ");
        
        
            opcion = Integer.parseInt(teclado.nextLine());

            switch(opcion){
                case 1:
                    System.out.println("Cuantos kilometros vas a recorrer?");
                    km = Integer.parseInt(teclado.nextLine());
                    bici1.recorre(km);
                    break;
                case 2:
                    bici1.pedalear();
                    break;
                case 3:
                    System.out.println("Cuantos kilometros vas a recorrer?");
                    km = Integer.parseInt(teclado.nextLine());
                    coche1.recorre(km);
                    break;
                case 4:
                    coche1.carrera();
                    break;
                case 5:
                    System.out.println("He andado con la bici ");
                    System.out.print(bici1.getKilometrosRecorridos() + " km");
                    break;
                case 6:
                    System.out.println("He andado con el coche ");
                    System.out.print(coche1.getKilometrosRecorridos() + " km");
                    break;
                case 7:
                    System.out.println("Los vehiculos llevan recorridos ");
                    System.out.print(Vehiculo.getKilometrosTotales()+ " km");
                    break;
                default:
            }
        }
    }
}
