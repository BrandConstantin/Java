/*
 * 
 *
 * @author costy
 */
public class PruebaCaballo {
    public static void main(String[] args){
        
        Caballo caballo1 = new Caballo("Pegaso", "macho", "Puro sangre", 1.55, 270, 77, 4, 1, 0);
        
        System.out.println("Hola caballito toma una frutita");
        caballo1.come("manzana");
        caballo1.salta();
        caballo1.come("ierba");
        System.out.println("Toma agua!");
        caballo1.bebe();
        caballo1.corre();

        Caballo caballo2 = new Caballo("Spirit", "macho", "arabe");
        
        caballo2.come("ierba");
        caballo2.salta();
        caballo2.bebe();
        caballo2.corre();
        
        Caballo caballo3 = new Caballo();
        
        Caballo caballo4 = new Caballo("LLuvia", "hembra");
        caballo1.come("manzana");
        caballo1.corre();
        
        System.out.println("Que de caballos!");
        
        caballo1.bebe();
        caballo2.come("manzana");
        caballo3.corre();
        
        caballo1.empareja(caballo4);
        caballo2.empareja(caballo3);
        caballo4.empareja(caballo1);
    }
}
