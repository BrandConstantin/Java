/*
 * Se pretende realizar un programa para gestionar la lista de participaciones 
 * en una competición de salto de longitud. El número de plazas disponible es de 10.
 * Sus datos se irán introduciendo en el mismo orden que vayan inscribiéndose 
 * los atletas. Diseñar el programa que muestre las siguientes opciones:
 * 1- Inscribir un participante.
 * 2- Mostrar listado de datos.
 * 3- Mostrar listado por marcas.
 * 4- Finalizar el programa.
 * Si se selecciona 1, se introducirán los datos de uno de los participantes: 
 * Nombre, mejor marca del 2002, mejor marca del 2001 y mejor marca del 2000.
 * Si se elige la opción 2, se debe mostrar un listado por número de dorsal.
 * La opción 3 mostrará un listado ordenado por la marca del 2002, de mayor a menor.
 * Tras procesar cada opción, se debe mostrar de nuevo el menú inicial, hasta 
 * que se seleccione la opción 4, que terminará el programa.
 */
package tema.pkg0.e.array.bidimensionales;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class Lista_Competicion {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        final int NumParticipante = 10;
        final int NumDorsal = 0;
        final int Marca0 = 0;
        final int Marca1 = 0;
        final int Marca2 = 0;
        int opcion = 0;
        int numCompetidor = 0;
        int dorsal;
        int i = 0;
        int aux;
        boolean dorsalRegistrado = false;
        boolean inter;
        int participante[][] = new int[NumParticipante][4];
        
        System.out.println("Lista Competición");
        System.out.println("============================================");
        
        do{
            System.out.println("");
            System.out.println("Introduce una opción: ");
            System.out.println("1. Inscribir participantes");
            System.out.println("2. Mostrar listado por datos");
            System.out.println("3. Mostrar listado por marcas");
            System.out.println("4. Salir");
            opcion = tec.nextInt();
            System.out.println("==========================================");
            System.out.println("");
            
            switch(opcion){
                case 1: 
                    if(numCompetidor == 20){
                        System.out.println("Listado completo!");
                    }else{
                        do{
                            System.out.println("Introduce el dorsal: ");
                            dorsal = tec.nextInt();
                            dorsalRegistrado = false;
                            i = 0;
                            if((i < numCompetidor) && (dorsalRegistrado == false)){
                                if(participante[i][NumDorsal] == dorsal){
                                    System.out.println("Dorsal Registrado");
                                    System.out.println("Intente otro número de dorsal: ");
                                    dorsalRegistrado = true;
                                }
                                i++;
                            }
                        }while(dorsalRegistrado == true);
                        if(dorsalRegistrado == false){
                            participante[numCompetidor][NumDorsal] = dorsal;
                            System.out.println("Introduzca marca del 2000: ");
                            participante[numCompetidor][Marca0] = tec.nextInt();
                            System.out.println("Introduzca marca del 2001: ");
                            participante[numCompetidor][Marca1] = tec.nextInt();
                            System.out.println("Introduzca marca del 2002: ");
                            participante[numCompetidor][Marca2] = tec.nextInt();
                            System.out.println("");
                            numCompetidor++;
                        }
                    }
                break;
                case 2: 
                    //método de ordenación por burbuja, controlado por intercambio
                    inter = true;
                    while(inter == true){
                        inter = false;
                        for(int j = 0; j <= numCompetidor - 2; j++){
                            if(participante[j][NumDorsal] > participante[j + 1][NumDorsal]){
                                for(int k = 0; k < 4; k++){
                                    aux = participante[j][k];
                                    participante[j][k] = participante[j+1][k];
                                    participante[j + 1][k] = aux;
                                }
                                inter = true;
                            }
                        }
                    }
                    System.out.println("LISTADO DE DATOS, SEGÚN DORSAL:");
                    System.out.println("dorsal - marcas");
                    for(int j = 0; j < numCompetidor; j++){
                        System.out.println("");
                        for(int k = 0; k < 4; k++){
                            System.out.print("|_" + participante[j][k] + "_|");
                        }
                    }
                break;
                case 3: 
                    inter = true;
                    while(inter == true){
                        inter = false;
                        for(int j = 0; j <= numCompetidor - 2; j++){
                            if(participante[j][Marca2] > participante[j + 1][Marca2]){
                                for(int k = 0; k < 4; k++){
                                    aux = participante[j][k];
                                    participante[j][k] = participante[j+1][k];
                                    participante[j + 1][k] = aux;
                                }
                                inter = true;
                            }
                        } 
                    }
                    System.out.println("LISTADO DE DATOS, POR MARCAS:");
                    System.out.println("dorsal - marcas");
                    for(int j = 0; j < numCompetidor; j++){
                        System.out.println("");
                        for(int k = 0; k < 4; k++){
                            System.out.print("|_" + participante[j][k] + "_|");
                        }
                    }
                break;
                case 4: 
                    System.out.println("Dejando el sistema...");
                break;
            }
        }while(opcion != 4);
    }
}
