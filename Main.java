import java.util.ArrayList;


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

        User trevor = new User("Trevor");
        System.out.println(trevor);

        Instructor yessir = new Instructor("Amber");
        System.out.println(yessir);

    //     var usersList = new ArrayList<Instructor>();
    //     usersList.add(instructor);

    //     printUsers(usersList);

    // }

    // public static void printUsers(ArrayList<User> users){
    //     for(var user: users){
    //         System.out.println(user);
    //     }
    // }

    B b = new B("Apple", "Carrot", "Lettuce", "Tomato");
    System.out.println(b.present());

    System.out.println(spotters.canSwim()); // used override to change the default value of animal
}
}