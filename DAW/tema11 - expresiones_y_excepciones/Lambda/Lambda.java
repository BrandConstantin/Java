import java.util.Arrays;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //1ª Forma: una clase que implementa comparator
        //lista.sort(new MayorAMenor());

        //2ª Forma: una clase "anónima"
        //¿Qué tal si ponemos el cursor sobre la instanciación de la clase
        //anónima y pulsamos Ctrl+1?
        //Eclipse permite convertir esto en una expresión lambda automáticamente
//		lista.sort(new Comparator<Integer>() {
//
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return -(o1.compareTo(o2));
//			}
//
//		});

        //		lista.sort((Integer n1, Integer n2) -> -(n1.compareTo(n2)));

        //3ª Forma: una expresion lambda
        //Los tipos de datos ¡no son obligatorios! Se infieren del contexto
        lista.sort((n1, n2) -> -(n1.compareTo(n2)));

        for (Integer i : lista)
            System.out.println(i);

    }
}
