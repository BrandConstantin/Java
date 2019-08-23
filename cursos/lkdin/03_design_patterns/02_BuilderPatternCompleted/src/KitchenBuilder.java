import java.awt.*;

public class KitchenBuilder {
    private Dimension dimensions;
    private int ceilingHeight;
    private int floorNumber;
    private Color wallColor;
    private int numberOfWindows;
    private int numberOfDoors;
    private boolean hasDishwasher;
    private boolean hasMicrowave;

    public KitchenBuilder setDimensions(Dimension dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    public KitchenBuilder setCeilingHeight(int ceilingHeight) {
        this.ceilingHeight = ceilingHeight;
        return this;
    }

    public KitchenBuilder setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
        return this;
    }

    public KitchenBuilder setWallColor(Color wallColor) {
        this.wallColor = wallColor;
        return this;
    }

    public KitchenBuilder setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
        return this;
    }

    public KitchenBuilder setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
        return this;
    }

    public KitchenBuilder setHasDishwasher(boolean hasDishwasher) {
        this.hasDishwasher = hasDishwasher;
        return this;
    }

    public KitchenBuilder setHasMicrowave(boolean hasMicrowave) {
        this.hasMicrowave = hasMicrowave;
        return this;
    }

    public Kitchen createKitchen() {
        return new Kitchen(dimensions, ceilingHeight, floorNumber, wallColor, numberOfWindows, numberOfDoors, hasDishwasher, hasMicrowave);
    }
}