public class Coche extends Vehiculo{
    private int hp;
    private int velocidad;
    private int puertas;
    
    public Coche(int hp, int v, int p){
        super();
        this.hp = hp;
        this.velocidad = v;
        this.puertas = p;
    }
    
    public void carrera(){
        System.out.println("Voy a hacer una carrera con mi coche!");
    }
}