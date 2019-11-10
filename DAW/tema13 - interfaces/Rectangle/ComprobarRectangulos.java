public class ComprobarRectangulos {
    public static void main(String[] args) {

        RectanglePlus rectangleOne = new RectanglePlus(10, 20);
        Relatable rectangleTwo = new RectanglePlus(20, 10);

        rectangleOne.print();
        // hacer casting hacia un tipo reconocido de interface
        MyInterface rectangle2 = (MyInterface) rectangleTwo;
        rectangle2.print();

        switch (rectangleOne.isLargerThan(rectangleTwo)) {
            case -1:
                System.out.println("Es menor");
                break;
            case 0:
                System.out.println("Son iguales");
                break;
            case 1:
                System.out.println("Es mayor");
                break;
        }
    }
}
