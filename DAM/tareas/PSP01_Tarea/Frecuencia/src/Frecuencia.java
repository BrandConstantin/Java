import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Primera parte. Implementa una aplicación, llamada 'frecuencia', que dado un texto recibido a través de su entrada
 estándar obtenga la frecuencia absoluta de cada una de las vocales 'a' 'e' 'o', tanto mayúsculas como minúsculas, es
 decir, la cantidad de veces que aparece cada una de ellas. En el caso de que una de las vocales no aparezca la frecuencia
 será 0. Por ejemplo: para la palabra “estupendo” el resultado debe ser  0 2 1 (0 indica el contador de la letra 'a', 2
  indica el contador de la letra 'e', y 1 indica el contador de la letra 'o'). Otro ejemplo: parala palabra "Elefante"
  el resultado debe ser 1 3 0 como puedes observar el contador de 'e' ha tenido en cuenta tanto las mayúsculas como las
  minúsculas. Atención, el resto de vocales no nos interesan.
  */
public class Frecuencia {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//		Scanner teclado = new Scanner(System.in);
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(isr);

        String chain = "";
        char[] characters;
        int countA = 0;
        int countE = 0;
        int countO = 0;

        System.out.print("Introduzca cualquier texto: ");

        try {
//					chain = bf.readLine();
            if ((chain = bf.readLine().toLowerCase()) != null) {
                characters = chain.toCharArray();

                for (int i = 0; i < characters.length; i++) {
                    if ((characters[i] == 'a')) {
                        countA++;
                    } else if ((characters[i] == 'e')) {
                        countE++;
                    } else if ((characters[i] == 'o')) {
                        countO++;
                    }
                }
            }

//				System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println(countA + " " + countE + " " + countO);
//				System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        } catch (IOException ex) {
            System.err.println("Se ha producido un error de E/S.");
            System.err.println(ex.toString());
        }
    }

}