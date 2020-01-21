package throwable;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author BrandConstantin
 */
public class HotChocolate {

    public static final double tooHot = 185;
    public static final double tooCold = 160;

    public static void drinkHotChocolate(double cocoTemp) throws TooColdException, TooHotException {
        if (cocoTemp >= tooHot) {
            throw new TooHotException();
        } else if (cocoTemp <= tooCold) {
            throw new TooColdException();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws TooColdException, TooHotException, InterruptedException {
        double currentCocoTemp = 140;
        boolean wrongTemp = true;

        while (wrongTemp) {
            try {
                drinkHotChocolate(currentCocoTemp);
                System.out.println("That cocoa was good!");
                drinkHotChocolate(currentCocoTemp);
                wrongTemp = false;
            } catch (TooHotException e1) {
                System.out.println("That's too hot!");
                currentCocoTemp = (currentCocoTemp - 5);
                wrongTemp = true;
            } catch (TooColdException e2) {
                System.out.println("That's too cold!");
                currentCocoTemp = (currentCocoTemp + 5);
                wrongTemp = true;
            }
            TimeUnit.SECONDS.sleep(2);
        }
        System.out.println("All its!");
    }

}
