public class UsoDeSuper {
    public static void main(String[] args) {
        ClaseBase base = new ClaseBase();
//		ClaseDerivada derivada = new ClaseDerivada();
        ClaseDerivada derivada = new ClaseDerivada("Hola Mundo!"," desde una clase derivada");

        base.imprimir();
        System.out.println("");
        derivada.imprimir();
    }
}