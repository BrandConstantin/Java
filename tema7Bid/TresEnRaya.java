/*
 * Realiza el juego tres en raya
 *
 * @author costy 
 */

public class TresEnRaya {
    static final String JUGADOR = "•";
    static final String ORDENADOR = "X";
    
    public static void main(String[] args){
        String[][] tablero = new String[3][3];
        int x;
        int y;
        int movimientos = 0;
        boolean jugadorGana = false;
        boolean ordenadorGana = false;
        String nombreFila = "abc";
        String coordenadas;
        
        //inicializar el tablero
        for(x = 0; x < 3; x++){
            for(y = 0; y < 3; y++){
                tablero[x][y] = " ";
            }
        }
        
        //juego
        do{
            //dibuja el tablero
            System.out.println("  ░░░░░░░░░░░░░░░");
            for(x = 0; x < 3; x++){
                System.out.print(nombreFila.charAt(x) + " ░");
                for(y = 0; y < 3; y++){
                    System.out.print("░ " + tablero[x][y] + " ");
                }
                System.out.println("░░");
                System.out.println("  ░░░░░░░░░░░░░░░");
            }
            System.out.print("     1   2   3\n");
            
            //pide las coordenadas
            System.out.println("================================================");
            System.out.print("Introduce las coordenadas (ejemplo: e2)");
            coordenadas = System.console().readLine();
            int fila = nombreFila.indexOf(coordenadas.charAt(0));
            int columna = coordenadas.charAt(1) - 1 - 48;
            tablero[fila][columna] = JUGADOR;
            movimientos++;
            
            //comprobar si gana el jugador
            jugadorGana = (
                (tablero[0][0] == JUGADOR) && (tablero[0][1] == JUGADOR) && (tablero[0][2] == JUGADOR) ||
                (tablero[1][0] == JUGADOR) && (tablero[1][1] == JUGADOR) && (tablero[1][2] == JUGADOR) ||
                (tablero[2][0] == JUGADOR) && (tablero[2][1] == JUGADOR) && (tablero[2][2] == JUGADOR) ||
                (tablero[0][0] == JUGADOR) && (tablero[1][0] == JUGADOR) && (tablero[2][0] == JUGADOR) ||
                (tablero[0][1] == JUGADOR) && (tablero[1][1] == JUGADOR) && (tablero[2][1] == JUGADOR) ||
                (tablero[0][2] == JUGADOR) && (tablero[1][2] == JUGADOR) && (tablero[2][2] == JUGADOR) ||
                (tablero[0][0] == JUGADOR) && (tablero[1][1] == JUGADOR) && (tablero[2][2] == JUGADOR) ||
                (tablero[0][2] == JUGADOR) && (tablero[1][1] == JUGADOR) && (tablero[2][0] == JUGADOR)
            );
            
            if(!jugadorGana && (movimientos < 9)){
                //juega el ordenador
                do{
                    fila = (int)(Math.random() * 3);
                    columna = (int)(Math.random() * 3);
                }while(!tablero[fila][columna].equals(" "));
                
                tablero[fila][columna] = ORDENADOR;
                movimientos++;
                
                //comprueba si gana el ordenador
                ordenadorGana = (
                    (tablero[0][0] == ORDENADOR) && (tablero[0][1] == ORDENADOR) && (tablero[0][2] == ORDENADOR) ||
                    (tablero[1][0] == ORDENADOR) && (tablero[1][1] == ORDENADOR) && (tablero[1][2] == ORDENADOR) ||
                    (tablero[2][0] == ORDENADOR) && (tablero[2][1] == ORDENADOR) && (tablero[2][2] == ORDENADOR) ||
                    (tablero[0][0] == ORDENADOR) && (tablero[1][0] == ORDENADOR) && (tablero[2][0] == ORDENADOR) ||
                    (tablero[0][1] == ORDENADOR) && (tablero[1][1] == ORDENADOR) && (tablero[2][1] == ORDENADOR) ||
                    (tablero[0][2] == ORDENADOR) && (tablero[1][2] == ORDENADOR) && (tablero[2][2] == ORDENADOR) ||
                    (tablero[0][0] == ORDENADOR) && (tablero[1][1] == ORDENADOR) && (tablero[2][2] == ORDENADOR) ||
                    (tablero[0][2] == ORDENADOR) && (tablero[1][1] == ORDENADOR) && (tablero[2][0] == ORDENADOR)
                );
            }
        }while(!jugadorGana && !ordenadorGana && (movimientos < 9));
        
        //dibula el tablero
        System.out.println("  ░░░░░░░░░░░░░░░");
        for(x = 0; x < 3; x++){
            System.out.print(nombreFila.charAt(x) + " ░");
                for(y = 0; y < 3; y++){
                    System.out.print("░ " + tablero[x][y] + " ");
                }
            System.out.println("░░");
            System.out.println("  ░░░░░░░░░░░░░░░");
        }
        System.out.print("     1   2   3\n");
        
        if(jugadorGana){
            System.out.println("Has ganado!");
        }else if(ordenadorGana){
            System.out.println("Gana PC!");
        }else{
            System.out.println("Hay empate!");
        }
    }
}
