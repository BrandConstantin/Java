/*
 * Crea la clase Fracción . Los atributos serán numerador y denominador . Y 
 * algunos de los métodos pueden ser invierte , simplifica , multiplica , divide 
 * , etc.
 */
package fraccion;

/**
 *
 * @author BrinCo
 */

public class Fraccion {
    //atributos
    private int signo;
    private int numerador;
    private int denominador;
    
    public Fraccion(int n, int d){
        if(d == 0){
            System.out.println("No se puede tener como denominador a un 0");
        }else{
            if(n * d < 0){
                this.signo = - 1;
            }else{
                this.signo = 1; 
            }
            this.numerador = Math.abs(n);
            this.denominador = Math.abs(d);
        }
    }
    
    int getNumerador(){
        return this.numerador;
    }
    
    int getDenominador(){
        return this.denominador;
    }
    
    public String toString(){
        if(signo == -1){
            return "-" + this.numerador + "/" + this.denominador;
        }else{
            return this.numerador + "/" + this.denominador;
        }
    }
    
    //invierta la fracción
    public Fraccion invierte(){
        return new Fraccion(this.signo * this.denominador, this.numerador);
    }
    
    //fracción multiplicada por n
    public Fraccion multiplica(int n){
        return new Fraccion(this.signo * this.numerador * n, this.denominador);
    }
    
    //multiplica fracción original por la fracción que se pasa como parametro
    public Fraccion multiplica(Fraccion f){
        return new Fraccion(this.signo * this.numerador * f.getNumerador(),
                this.denominador * f.getDenominador());
    }
    
    //se divide la fracción con el escalar n 
    public Fraccion divide(int n){
        return new Fraccion(this.signo * this.numerador, this.denominador * n);
    }
    
    //dividir la fracción con la fracción que se pasa como parametro
    public Fraccion divide(Fraccion f){
        return new Fraccion(this.signo * this.numerador * f.getDenominador(), 
                denominador * f.getNumerador());
    }
    
    //simplificar la fracción original si se puede, sino la misma fracción en 
    //caso de que la original sea irreducible
    public Fraccion simplificada(){
        int s = this.signo;
        int n = this.numerador;
        int d = this.denominador;
        
        for(int i = 2; i < Math.min(this.numerador, this.denominador); i++){
          while(((n % i) == 0) && ((d % i) == 0)){
              n /= i;
              d /= i;
          }  
        }
        return new Fraccion(s * n, d);
    }
}
