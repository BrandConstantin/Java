public class CandyStore {
    private static final CandyFactory chocolateFactory = new ChocalateFactory();
    private static final CandyFactory hardCandyFactory = new HardCandyFactory();

    public static void main(String[] args) {
        chocolateFactory.getCandyPackage(7, "dark");
        hardCandyFactory.getCandyPackage(14, "lollipop");
        hardCandyFactory.getCandyPackage(50, "candy cane");
    }
}
