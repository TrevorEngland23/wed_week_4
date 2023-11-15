// Dog.java
public class Dog implements Animal {
    private String sound;

    public String getSound() {
        return sound;
    }

    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}
