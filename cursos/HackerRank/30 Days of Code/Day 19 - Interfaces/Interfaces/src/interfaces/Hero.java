package interfaces;

/**
 *
 * @author BrandConstantin
 */
public class Hero implements Character {
    public String weapon = "lightsaber-blue";

    public void attack() {
        System.out.println("The hero attacks!");
    }

    public void heal() {
        System.out.println("The hero heals you");
    }

    public void weaponDraw() {
        System.out.println("Draw the weapon");
    }
    
    public String getWeapon() {
        return weapon;
    }
}
