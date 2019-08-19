import model.ClothingItem;
import model.Shirt;

public class Main {
    public static void main(String[] args) {
        ClothingItem item = new ClothingItem("Shirt", "L", 19.99);
        System.out.println(item);

        Shirt shirt = new Shirt("M", 14.99);
        System.out.println(shirt);
    }
}
