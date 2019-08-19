import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("California", "Sacramento");
        map.put("Oregon", "Salem");
        map.put("Washington", "Olympia");

        System.out.println(map);

        map.put("Alaska", "Juneau");
        System.out.println(map);

        String capitol = map.get("Oregon");
        System.out.println(capitol);

        map.remove("Washington");
        System.out.println(map);
    }
}
