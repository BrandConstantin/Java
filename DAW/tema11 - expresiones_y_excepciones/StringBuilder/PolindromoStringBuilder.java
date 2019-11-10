public class PolindromoStringBuilder {
    public static void main(String[] args) {
        String palindromo = "Dabale arroz a la zorra el abad";
        StringBuilder sb = new StringBuilder(palindromo);

        sb.reverse();  // lo invertimos
        System.out.println(sb); //llamada implícita a sb.toString().
    }
}
