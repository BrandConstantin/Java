public class Bicicleta extends Vehiculo{
    private int piniones;
    private String tipo; //fast, montainbike, city
    
    public Bicicleta(int p){
        super();
        this.piniones = p;
    }
    
    public Bicicleta (String t){
        super();
        this.tipo = t;
    }
    
    public void pedalear(){
        System.out.println("Estoy pedaleando mi nueva bici");
    }
}

    