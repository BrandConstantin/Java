import java.awt.*;
import java.lang.Math;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();

        if (c instanceof Pet) {
            c.play();
        }

        if (d instanceof Pet) {
            d.play();
        }

        Pet p;
        Random rand = new Random();
        int n = rand.nextInt(2);

        if (n == 0) {
            p = new Dog();
        } else {
            p = new Cat();
        }

        p.play();

    }

}
