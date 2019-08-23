public class Main {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.setAge(8);
        Rabbit rabbitCopy = rabbit.clone();
        System.out.println("Age of first rabbit: " + rabbit.getAge());
        System.out.println("Age of second rabbit: " + rabbitCopy.getAge());
    }
}
