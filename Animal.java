public interface Animal {

    public String getSound();

    default public boolean canSwim(){ // by default, our animals cannot swim... without default you need to explicitly use it in the classes

        return true;
    }
}
