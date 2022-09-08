import java.util.Set;

public class RoboCat extends Pet{
    public RoboCat(String nickName, int age, int trickLevel, Set<String> habits) {
        super(nickName, age, trickLevel, habits);
        super.setSpecies(Species.CAT);
    }

    public void respond (){
        System.out.println("Hello, owner. I am " + Species.CAT + ". I miss you!");
    }
}
