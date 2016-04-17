package funciones;

/*
 * Devuelve verdadero si el número que se pasa como parámetro es capicúa y falso
 * en caso contrario.
 *
 * Un número capicúa es el que se lee igual de izquierda a derecha que de
 * derecha a izquierda.
 * 
 * @author BrinCo
 * @param  es o no capicua un número 
 * @ return verdadero si es capicua, falso en caso contrario
 * 
 */
public class VariasMate {

    public static boolean esCapicua(long x){
        
        long original = x;
        long numInvertido = 0;
        long resto;        
        boolean capicua = false;
        
        //dar vuelta número
        while(x > 0){
            resto = x % 10;
            numInvertido = (numInvertido * 10) + resto;
            x /= 10;
        }
        
        //comprobar
        if(original == numInvertido){
            capicua = true;
        }
        return capicua;
    }
    /*
     * Devuelve verdadero si el número que se pasa como parámetro es primo y falso
     * en caso contrario.
     * 
     * @author BrinCo
     * @param  es o no es número primo 
     * @ return verdadero si es primo, falso en caso contrario
     * 
     */

    public static boolean esPrimo(int x){
        
        int primo = x;
        boolean esPrimo = false;

        for(int i = 2; i < x; i++){
            if((x % i) == 0){
                return false;
            }
        }
        return true;
    } 
    
    /*
     *Devuelve el menor primo que es mayor al número que se pasa como parámetro.
     *
     *
     * @author BrinCo
     * @param  el siguiente número si es primo
     * @ return verdadero si es primo, falso en caso contrario
     * 
     */
    public static int siguientePrimo(int x){
        
        while(!esPrimo(++x)){ }
        return x;
    } 
    /*
     *Dada una base y un exponente devuelve la potencia.
     *
     *
     * @author BrinCo
     * @param  se da la base y el exponente
     * @ return potencia
     * 
     */
    public static int potencia(int expo, int base){
            
        /*int potencia = 1;
        int i = 1;

        while ( i <= expo){
            potencia *= base;
            i++;
        }*/
        int potencia = 1;

        for (int i = 1; i <= expo; i++){
        potencia *= base;
        }
        return potencia;
    }
    /*
     *Cuenta el número de dígitos de un número entero.
     *
     *
     * @author BrinCo
     * @param  se da un número
     * @ return digitos
     * 
     */
    public static int digitos(int num){
        int ultimoDigito = 0;
        
        do{
            num = num / 10;
            ultimoDigito++;
        } while (num > 0);
        return ultimoDigito;
    }
    
    /*
     *Le da la vuelta a un número.
     *
     *
     * @author BrinCo
     * @param  se da un número y se da la vuelta
     * @ return numVolteado
     * 
     */
    public static int volteado(int num){
        int numVolteado = 0;
        while (num > 0){
            numVolteado = (numVolteado * 10) + (num % 10);
            num /= 10;
        }
        return numVolteado;
    }
        
    /*
     * Devuelve el dígito que está en la posición n de un número entero. Se empieza
     * contando por el 0 y de izquierda a derecha.
     *
     *
     * @author BrinCo
     * @param  se da un número que representa la posición de un digito
     * @ return posición
     * 
     */
    public static long posicionDigito (long numIntrod, int digito){

        numIntrod = volteado((int)numIntrod);
        
        while(digito-- > 0){
            numIntrod = numIntrod / 10;
        }

        return numIntrod % 10;
    }
            
    /*
     * Da la posición de la primera ocurrencia de un dígito dentro de un número
     * entero. Si no se encuentra, devuelve -1.
     *
     *
     * @author BrinCo
     * @param  se da un número largo luego se pregunta por otro, para averiguar posición
     * @ return posición
     * 
     */
    public static long posicionOcurencia(long numIntrod, int num){
        int posicion = 1;
        numIntrod = volteado((int)numIntrod);
        
        do{
            if((numIntrod % 10) == num){
             }
            numIntrod = numIntrod / 10;
            posicion++;
            
        }while(numIntrod > 0);
        return posicion;
    }
                
    /*
     * Le quita a un número n dígitos por detrás (por la derecha).
     *
     *
     * @author BrinCo
     * @param  se da un número largo luego se pregunta digitos a quitar
     * @ return numIntrod
     * 
     */
    public static int quitaPorDetras(long numIntrod, int digitos){
        
        int divisor = 1;
        while(digitos > 0){
            divisor = divisor * 10;
            digitos--;
        }
        numIntrod = numIntrod / divisor;
        return (int)numIntrod;
    }   

                    
    /*
     * Le quita a un número n dígitos por delante (por la izquierda).
     *
     *
     * @author BrinCo
     * @param  se da un número largo luego se pregunta digitos a quitar por delante
     * @ return numIntrod
     * 
     */
    public static int quitaPorDelante(long numIntrod, int digitos){
        /*int numReves = volteado((int)numIntrod);
        numReves = numReves / 10;
        numIntrod = volteado((int)numReves);*/
        
        int divisor = 1;
        int contador = digitos((int)numIntrod);
        
        while(contador > 1){
            divisor = divisor * 10;
            contador--;
        }
        
        while(digitos > 0){
            numIntrod = numIntrod % divisor;
            divisor = divisor / 10;
            digitos--;
        }
        return (int)numIntrod;
    }

                    
    /*
     * Añade un digito a un número introducido, por detras
     *
     *
     * @author BrinCo
     * @param  se da un número luego se añade un digito
     * @ return numIntrod
     * 
     */
    public static int pegaPorDetras(long numIntrod, int digitos){
        
        numIntrod = (numIntrod * 10) + digitos;
        return (int)numIntrod;
    }
    /*
     * Añade un digito a un número introducido, por detras
     *
     *
     * @author BrinCo
     * @param  se da un número luego se añade un digito
     * @ return numIntrod
     * 
     */
    public static int pegaPorDelante(long numIntrod, int digitos){
        
        long nuevoNumero = volteado((int)numIntrod);
        nuevoNumero = (nuevoNumero * 10) + digitos;
        numIntrod = volteado((int)nuevoNumero);
        
        return (int)numIntrod;
    }
    /*
     * Toma como parámetros las posiciones inicial y final dentro de un número y 
     * devuelve el trozo correspondiente.
     *
     *
     * @author BrinCo
     * @param  se dan dos numeros y muestra el trozo que hay entre ellos
     * @ return numIntrod
     * 
     */
    public static int trozoDeNumero(long numIntrod, int numInicial, int numFinal){
        
        numFinal = digitos((int)numIntrod) - numFinal;
        numIntrod = quitaPorDelante((long)numIntrod, (numInicial - 1));
        numIntrod = quitaPorDetras((long)numIntrod, numFinal);
        
        /*for(int i = 0; i < numInicial - 1; i++){
            numIntrod = quitaPorDelante(numIntrod, 1);
        }
        
        for(int i = 0; i < numFinal; i++){
            numIntrod = quitaPorDetras(numIntrod, 1);
        }
        */
        return (int)numIntrod;
    }
    /*
     * Pega dos números para formar uno.
     *
     *
     * @author BrinCo
     * @param  juntar dos números
     * @ return num
     * 
     */
    public static int juntarNumeros(long numInicial, long numFinal){
        
        int contador = 1;
        int contarDigitos = digitos((int)numFinal);
        
        while(contarDigitos > 0){
            contador *= 10;
            contarDigitos--;
        }
        
        numInicial = numInicial * contador;
        long num = numInicial + numFinal;
        
        return (int)num;
    }
    /*
     * Muestra los números primos que hay entre 1 y 1000
     *
     *
     * @author BrinCo
     * @param  números primos
     * @ return esPrimo
     * 
     */
    public static void numPrimos(){

        for (int b = 1; b <= 1000; b++){
            if (esPrimo(b)){
                System.out.print("|" + b + "");
            }
        }
    }
    /*
     * Muestra los números capicúa que hay entre 1 y 99999.
     *
     *
     * @author BrinCo
     * @param  números capicuas
     * @ return esCapicua
     * 
     */
    public static void numCapicuas(){
        
        int contador = 0;
        
        for (int b = 1; b <= 99999; b++){
            if (esCapicua(b)){
                System.out.print("|" + b + "");
                contador++;
                if(contador % 10 == 0){
                    System.out.println();
                }
            }
        }
    }
    /*
     * Escribe un programa que pase de binario a decimal.
     *
     *
     * @author BrinCo
     * @param  transformar de binario a decimal
     * @ return num
     * 
     */
    public static long binario_Decimal(long num){
        
        int longitud = digitos((int)num);
        long decimal = 0;
        
        for(int x = 0; x < longitud; x++){
            decimal += potencia(2, x) * posicionDigito(num, longitud - x - 1);
        }
        return decimal;
    }
    /*
     * Escribe un programa que pase de decimal a binario
     *
     *
     * @author BrinCo
     * @param  transformar de binario a decimal
     * @ return num
     * 
     */
    public static long decimal_Binario(long num){
        
        if(num == 0){
            return 0;
        }
        
        int decimal = 1; 
        
        while(num > 1){
            decimal = pegaPorDetras(decimal, (int)num % 2);
            num = num / 2; 
        }
        
        decimal = pegaPorDetras(decimal, 1);
        decimal = volteado(decimal);
        decimal = quitaPorDetras((long)decimal, 1);
        
        return decimal;
    }
    /*
     * Une y amplía los dos programas anteriores de tal forma que se permita  
     * convertir un número entre cualquiera de las siguientes bases: decimal, 
     * binario, hexadecimal y octal.
     *
     *
     * @author BrinCo
     * @param  transformar numero
     * @ return num
     * 
     */
    public static long transformNum(long num){
        
        if(num == 0){
            return 0;
        }
        
        int decimal = 1; 
        
        while(num > 1){
            decimal = pegaPorDetras(decimal, (int)num % 2);
            num = num / 2; 
        }
        
        decimal = pegaPorDetras(decimal, 1);
        decimal = volteado(decimal);
        decimal = quitaPorDetras((long)decimal, 1);
        
        return decimal;
    }
}