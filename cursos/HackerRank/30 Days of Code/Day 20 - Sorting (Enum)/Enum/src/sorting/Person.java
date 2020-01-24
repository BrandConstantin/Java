package sorting;

import sorting.HairColor;
import static sorting.HairColor.*;

/**
 *
 * @author BrandConstantin
 */
public class Person {

    HairColor hairColor2 = HairColor.BLACK;
    HairColor hairColor = BLONDE;

    public Person() {

    }

    public static void main(String[] args) {
        Person peterParker = new Person();
        Person ladyGaga = new Person();

        System.out.println("Peter have the hair " + peterParker.hairColor);
        System.out.println("LG have the hair " + ladyGaga.hairColor2);
    }
}
