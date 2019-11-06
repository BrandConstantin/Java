public class ArtumentosTiposRetorno {
    public static void main(String[] args) {
        imprimeMensaje("En un lugar", "de la Mancha");
        imprimeMensaje("de cuyo nombre", "no quiero recordar", "no ha mucho tiempo");
        imprimeMensaje("...");
        imprimeMensaje();
    }

    public static void imprimeMensaje(String... mensajes){ //varargs tiene que ser al final de todos las variables recibidas
        for (String mensaje: mensajes){
            System.out.print(mensaje + " ");
        }
        System.out.println(" ");
    }
}
