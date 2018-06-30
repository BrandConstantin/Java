/*
 * Realiza una programa que calcule los segundos transcurridos entre dos horas de un día. Para cada hora del día
* se introduce la hora y los minutos. Se da por hecho que el usuario introduce los datos correctamente y que la
* segunda hora es posterior a la primera.
 */
package tema04;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class Segundos_TranscuridosEntre_2horas {
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    int primeraHora = 0;
    int primerosMinutos = 0;
    int segundaHora = 0;
    int segundosMinutos = 0;    
    

    while(segundaHora <= primeraHora){                
        System.out.print("Introduce la I hora: ");
        primeraHora = teclado.nextInt();
        System.out.print("Introduce los I minutos: ");
        primerosMinutos = teclado.nextInt();
        System.out.print("Introduce la II hora: ");
        segundaHora = teclado.nextInt();
        System.out.print("Introduce los II minutos: ");
        segundosMinutos = teclado.nextInt();

        if(primeraHora == 0 ){
            primeraHora = 24;
        }
        if(segundaHora == 0){
            segundaHora = 24;
        }
        
        if(segundaHora <= primeraHora){
            System.out.println("La segunda hora debe ser posterior a la primera hora");
        }
        
    }

    if((primeraHora < 0 || primeraHora > 24 || segundaHora < 0 || segundaHora > 24) || 
            (primerosMinutos < 0 || primerosMinutos > 60 || segundosMinutos < 0 || segundosMinutos > 60)){
        System.out.println("Hora o minutos incorrecta");
        System.out.println("Revisa lo que has escrito");
    }else{        
        int horaRestante = segundaHora - primeraHora;
        int minRestante1 = (horaRestante * 60);    
        int minRes1Hora = 60 - segundosMinutos;
        int minRes2Hora = 60 - primerosMinutos;
        int minRestante2;
        int minRestante;

        if(segundosMinutos > primerosMinutos){
            minRestante2 = minRes2Hora - minRes1Hora;
        }else{
            minRestante2 = minRes1Hora - minRes2Hora;
        }

        minRestante = minRestante1 + minRestante2;

        //segundos totales
        int totalSegundos = minRestante * 60;

        System.out.println("-------------------------------------");
        System.out.print("Entre " + primeraHora + ":" + primerosMinutos + " y " + segundaHora + ":" + segundosMinutos);
        System.out.println(" hay un total de " + totalSegundos);
    }
}    
}
