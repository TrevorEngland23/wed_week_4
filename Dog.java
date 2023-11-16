// Dog.java
public class Dog implements Animal { // implements = interface, extends = Classes
    private String sound;

    @Override // optional override... overidden method
    
    public String getSound() {
        sound = "Bark Bark!";
        return sound;
    }
}
