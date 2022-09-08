import java.util.List;
import java.util.Set;


public class Family {
    private Human mother;
    private Human father;
    private Human child;
    private List<Human> children;
    private Pet pet;

    private Set<Pet> petSet;
    private List<Family> family;
    private List<Family> family1;

    public Family(Woman mother, Man father) {
    }


    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human getChild() {
        return child;
    }

    public void setChild(Human child) {
        this.child = child;
    }

    public List<Human> getChildren() {
        return children;
    }

    public void setChildren(List<Human> children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public List<Family> getFamily() {
        return family;
    }

    public void setFamily(List<Family> children) {
        this.family = family;
    }

    public List<Family> getFamily1() {
        return family1;
    }

    public void setFamily1(List<Family> children) {
        this.family1 = family1;
    }

    public Family(Human mother, Human father, List<Human> children, Set<Pet> petSet) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.petSet = petSet;
    }

    public Family(List<Family> family1) {
        this.family1 = family1;
    }


    public void addChild(Human ch) {
        this.children.add(ch);
    }

    @Override
    public String toString() {

        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + children +
                ", pet=" + petSet +
                '}';
    }

    public void add(List<Family> family1) {
    }

    public Object get(List<Family> family1) {
        return family1;
    }

    public void remove(Object o) {
    }

    public int length() {
        int a = CollectionFamilyDao.family1.size();
        return a;
    }


}