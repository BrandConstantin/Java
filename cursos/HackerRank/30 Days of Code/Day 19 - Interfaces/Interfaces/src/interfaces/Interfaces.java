package interfaces;

import java.util.Random;

/**
 *
 * @author BrandConstantin
 */
public class Interfaces {

    public static Character summonCharacter() {
        Random rand = new Random();

        if (Math.abs(rand.nextInt()) % 2 == 0) {
            return new Enemy();
        } else {
            return new Hero();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Enemy darthVader = new Enemy();
        Hero obiWanKenobi = new Hero();

        darthVader.attack();
        obiWanKenobi.attack();
        darthVader.heal();
        obiWanKenobi.heal();
        System.out.println(darthVader.getWeapon());
        System.out.println(obiWanKenobi.getWeapon());
    }

}
