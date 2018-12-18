package functions;

/**
 *
 * @author brand
 */
public class Functions {

    /**
     * Calcular área o el volumen, según se especifica, de un cilindro
     *
     * @param mostrar area o volumen
     * @ return área, volumen
     * @author BrinCo
     */
    public static void cilindro(double radio, double altura, int opcion) {
        double volumen;
        double area;

        switch (opcion) {
            case 1:
                volumen = Math.PI * (radio * 2) * altura;
                System.out.printf("El volumen es de %.2f \n", volumen);
                break;
            case 2:
                area = (2 * Math.PI * radio * altura) + (2 * Math.PI * (radio * 2));
                System.out.printf("El área es de %.2f \n", area);
                break;
            default:
                System.out.println("Opción no valida!");
        }
    }

    ////////////////////////////////////////////////////////////////////////////
    /**
     * Calcular área o el volumen, según se especifica, de un cilindro en una
     * tabla
     *
     * @param mostrar area o volumen
     * @ return área, volumen
     * @author BrinCo
     */
    public static double[] tablaCilindro(double radio, double altura) {
        double volumen;
        double area;
        double calculo[] = new double[2];

        calculo[0] = Math.PI * (radio * 2) * altura;
        calculo[1] = (2 * Math.PI * radio * altura) + (2 * Math.PI * (radio * 2));

        return (calculo);
    }
    ////////////////////////////////////////////////////////////////////////////

    /**
     * Doblar el valor del parametro pasado por pantalla
     *
     * @param mostrar doble valor
     * @ return dobleValor
     * @author BrinCo
     */
    public static void dobleValor(int num) {
        int doble = 2;

        doble *= num;

        System.out.println("El doble es: " + doble);
    }
    ////////////////////////////////////////////////////////////////////////////

    /**
     * Escribir una función que calcule el máximo común divisor de dos números.
     *
     * @param mostrar
     * @ return divisores comun maximo
     * @author BrinCo
     */
    //primero crearemos el minimo 
    public static int minimo(int a, int b) {
        int minimo;

        if (a > b) {
            minimo = b;
        } else {
            minimo = a;
        }
        return minimo;
    }

    public static int maximDivisor(int a, int b) {

        int maximDivisor = 1;
        int min = minimo(a, b);

        for (int i = 2; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                maximDivisor = i;
            }
        }
        return maximDivisor;
    }
    ////////////////////////////////////////////////////////////////////////////

    /**
     * Escribir una función que calcule el máximo común divisor de tres números.
     *
     * @param mostrar
     * @ return divisores comun maximo
     * @author BrinCo
     */
    public static int maximDivisor_3(int a, int b, int c) {

        int maximDivisor = 1;
        int min = minimo(a, minimo(b, c));

        for (int i = 2; i <= min; i++) {
            if (a % i == 0 && b % i == 0 && c % i == 0) {
                maximDivisor = i;
            }
        }
        return maximDivisor;
    }
    ////////////////////////////////////////////////////////////////////////////

    /**
     * Escribir una función que calcule el máximo común divisor y mostrarlo * en
     * una tabla.
     *
     * @param mostrar
     * @ return divisores comun maximo
     * @author BrinCo
     */
    public static int maximDivisor(int t[]) {

        int maximDivisor = 1;
        int min = t[0];
        boolean divide;

        for (int i = 0; i < t.length; i++) {
            min = functions.Functions.minimo(min, t[i]);
        }

        //maximDivisor = 1;
        for (int i = 2; i <= min; i++) {
            divide = true;

            for (int k = 0; k < t.length; k++) {
                if (t[k] % i != 0) {
                    divide = false;
                }
            }

            if (divide == true) {
                maximDivisor = i;
            }
        }
        return maximDivisor;
    }
    ////////////////////////////////////////////////////////////////////////////

    /**
     * Introducir 2 números y diceri cual es el máximo
     *
     * @param mostrar máximo
     * @ return maximo
     * @author BrinCo
     */
    public static int maximo(int a, int b) {
        int max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        return (max);
    }
    ////////////////////////////////////////////////////////////////////////////

    /**
     * Introducir 3 números y diceri cual es el máximo
     *
     * @param mostrar máximo
     * @ return maximo
     * @author BrinCo
     */
    public static int maximo(int a, int b, int c) {
        int max;
        if ((a > b) && (a > c)) {
            max = a;
        } else if ((b > a) && (b > c)) {
            max = b;
        } else {
            max = c;
        }
        return (max);
    }
    ////////////////////////////////////////////////////////////////////////////

    /**
     * Pedir un numero N y mostrar un mensaje por pantalla N veces
     *
     * @param mostrar un número n veces
     * @ return numero
     * @author BrinCo
     */
    public static void mostrarMensajes(int num) {
        int i;
        for (i = 0; i < num; i++) {
            System.out.println("Módulo ejecutandose...");
        }
    }
    ////////////////////////////////////////////////////////////////////////////

    /**
     * Mostrar numeros comprendidos entre dos enteros
     *
     * @param mostrar numeros comprendidos
     * @ return numComprendidos
     * @author BrinCo
     */
    public static void numComprendidos(int a, int b) {
        int mayor;
        int menor;

        if (a > b) {
            mayor = a;
            menor = b;
        } else {
            mayor = b;
            menor = a;
        }

        for (int i = menor; i <= mayor; i++) {
            System.out.print("|_" + i + "_|");
        }
    }
    ////////////////////////////////////////////////////////////////////////////

    /**
     * Mostrar el máximo de una tabla de n elementos
     *
     * @param mostrar máximo de una tabla
     * @ return maximo
     * @author BrinCo
     */
    public static int maximo(int t[]) {
        int max = t[0];
        for (int i = 0; i < t.length; i++) {
            if (t[i] > max) {
                max = t[i];
            }
        }
        return (max);
    }
    ////////////////////////////////////////////////////////////////////////////

    /**
     * Devolver número de divisores primos que tiene un número
     *
     * @param mostrar divisores primos
     * @ return divisores
     * @author BrinCo
     */
    public static boolean esPrimo(int num) {
        boolean primo = true;
        int i = 2;

        while (i < num && primo == true) {
            if (num % i == 0) {
                primo = false;
            }
            i++;
        }

        return (primo);
    }

    /**
     * Devolver número de divisores primos que tiene un número
     *
     * @param mostrar divisores primos
     * @ return divisores
     * @author BrinCo
     */
    public static int numDivisores(int num) {
        int cont = 1;

        for (int i = 2; i <= num; i++) {
            if (esPrimo(i) && (num % i == 0)) {
                cont++;
            }
        }

        return (cont);
    }
    ////////////////////////////////////////////////////////////////////////////

    /**
     * Devolver número de divisores primos que tiene un número
     *
     * @param mostrar divisores primos
     * @ return divisores
     * @author BrinCo
     */
    public static boolean numPrimo(int num) {
        boolean primo = true;
        int i = 2;

        if (num % i != 0) {
            primo = false;
            System.out.println("Número no primo");
        } else {
            primo = true;
            System.out.println("Número primo");
        }

        return (primo);
    }
    ////////////////////////////////////////////////////////////////////////////

    /**
     * Devolver número de divisores primos que tiene un número en una tabla
     *
     * @param mostrar divisores primos
     * @ return divisores
     * @author BrinCo
     */
    public static boolean tablaDivisores(int num) {
        boolean primo = true;
        int i = 2;
        //int cont = 1;        

        while (i < num && primo == true) {
            if (num % i == 0) {
                primo = false;
            }
        }

        return primo;
    }

    //tabla donde guardaremos los divisores 
    public static int[] divisores(int num) {
        int cont = 0;
        int div[];
        int numDiv = numDivisores(num);

        div = new int[numDiv];

        for (int i = 1; i <= num; i++) {
            if (esPrimo(i) && num % i == 0) {
                div[cont] = i;
                cont++;
            }
        }
        return div;
    }
}
