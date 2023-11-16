public class Cow implements Animal{
    private String sound;

    public String getSound() {
        sound = "Moooooo!";
        return sound;
    }

    @Override
    public boolean canSwim() {
        // TODO Auto-generated method stub
        return false;
    }
}
