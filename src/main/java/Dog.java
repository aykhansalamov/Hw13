import java.util.Set;

public class Dog extends Pet implements AnimalFoul {



    public Dog(String nickName, int age, int trickLevel, Set<String> habits) {
        super(nickName, age, trickLevel, habits);
        super.setSpecies(Species.DOG);
    }



    public void foul() {
        System.out.println("I need to cover it up");
    }

    public void respond () {
        System.out.println("Hello, owner. I am " + Species.DOG + ". I miss you!");
    }
}
