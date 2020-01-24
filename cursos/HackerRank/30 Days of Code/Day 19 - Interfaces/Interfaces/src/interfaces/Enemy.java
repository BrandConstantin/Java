package interfaces;

/**
 *
 * @author BrandConstantin
 */
public class Enemy implements Character{
    public String weapon = "lightsaber-red";
    
    @Override
    public String getWeapon() {
        return weapon;
    }
    
    public Enemy(){}
    
    public void attack(){
        System.out.println("The enemy attacks!");
    }
    
    @Override
    public void heal(){
        System.out.println("The enemy heals himself");
    }
    
    public void weaponDraw(){
        System.out.println("Draw the weapon");
    }
}
