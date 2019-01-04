public class Insect {
    int age;
    int numberOfLegs;

    public Insect(int age, int numberOfLegs) {
        this.age = age;
        this.numberOfLegs = numberOfLegs;
    }

    public void says() {
        System.out.println("...");
    }

    public void crawl() {
        System.out.println("The insect crawled");
    }

}
