/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Bird cardinal = new Bird();
        System.out.println(cardinal.getSound());
       

        Dog winnie = new Dog();
        System.out.println(winnie.getSound());

        Cow spotters = new Cow();
        System.out.println(spotters.getSound());

    }
}