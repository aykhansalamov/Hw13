import java.util.Set;

public class DomesticCat extends Pet implements AnimalFoul {

    public DomesticCat(String nickName, int age, int trickLevel, Set<String> habits) {
        super(nickName, age, trickLevel, habits);
        super.setSpecies(Species.CAT);
    }

    public void foul() {
        System.out.println("I need to cover it up");
    }

    public void respond() {
        System.out.println("Hello, owner. I am " + Species.CAT + ". I miss you!");
    }
}
