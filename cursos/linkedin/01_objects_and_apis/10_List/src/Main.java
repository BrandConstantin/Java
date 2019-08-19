import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> states = new ArrayList<>();

        states.add("California");
        states.add("Oregon");
        states.add("Washington");

        for (String state: states ) {
            System.out.println(state);
        }
        System.out.println("-----------");

        states.remove(1);

        for (String state: states ) {
            System.out.println(state);
        }

        System.out.println("-----------");

        String state = states.get(0);
        System.out.println(state);
        int pos = states.indexOf("Washington");
        System.out.println(pos);
    }
}
