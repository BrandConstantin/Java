import java.util.Arrays;
import java.util.List;

public class ApiStream {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //1º Imprimir todos los elementos de la lista
//		lista
//			.stream()
//			.forEach(System.out::println);

        //2º Imprimir solo los mayores o iguales que 5
//		lista
//			.stream()
//			.filter((x) -> x >= 5)
//			.forEach(System.out::println);

        //3º Imprimir solo los mayores o iguales que 5, ordenados inversamente
//		lista
//			.stream()
//			.filter((x) -> x >= 5)
//			.sorted((n1, n2) -> -(n1.compareTo(n2)))
//			.forEach(System.out::println);

        //4º Sumar todos los elementos mayores o igual que 5
        int resultado = lista
                .stream()
                .mapToInt(v -> v.intValue())
                .filter((x) -> x >= 5)
                .sum();
        System.out.println(resultado);

    }
}
