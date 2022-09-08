

import java.util.Set;

public abstract class Pet {
    private Species species;
    private String nickName;
    private int age;
    private static int trickLevel;

    private Set<String> habits;


    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public Set<String> getHabits() {
        return habits;
    }

    public void setHabits(String running) {
        this.habits = habits;
    }

    @Override
    public String toString() {
        return species + " {" +
                "nickName='" + nickName + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + habits +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(this + " objects collected by garbage collector in Pet class");
    }


   // Pet dog1 = new Pet("Rocky", "2", "65");

    public Pet(String nickName, int age, int trickLevel, Set habits) {

        this.nickName = nickName;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public void eat() {
        System.out.println("I'm eating.");
    }


    public abstract void respond();


    public void setHabits(String eat, String drink, String sleep) {
    }

//    public String prettyFormat() {
//        String newFormant = String.valueOf(dog1);
//        return newFormant;
//
//    }
}

