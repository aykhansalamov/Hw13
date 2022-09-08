import java.util.Set;

public class Fish extends Pet {
    public Fish(String nickName, int age, int trickLevel, Set<String> habits) {
        super(nickName, age, trickLevel, habits);
        super.setSpecies(Species.FISH);
    }

    public void respond() {
        System.out.println("Hello, owner. I am " + Species.FISH + ". I miss you!");
    }
}
