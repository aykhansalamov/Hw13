import java.text.ParseException;
import java.util.*;

public class FamilyController {
    FamilyService service;
    CollectionFamilyDao collectionFamilyDao;
    List<Family> families = new ArrayList<>();
    List<Family> family1;
    public List<Family> getAllFamilies() {

        return service.getAllFamilies();
    }

    public Family createNewFamily(Woman mother, Man father) {
        return service.createNewFamily(father, mother);
    }

    public void deleteFamily(int index) {
        service.deleteFamily(index);
    }

    public void deleteFamily(Family family) {
        service.deleteFamily(family);
    }

    public void getFamilyByIndex(int index) {
        service.getFamilyByIndex(index);
    }

    public void displayAllFamilies() {
        service.displayAllFamilies();
    }

    public void getFamiliesBiggerThan() throws ParseException {
        service.getFamiliesBiggerThan();
    }

    public void getFamiliesLessThan() {
        service.getFamiliesLessThan();
    }

    public Family adoptChild(Human child1, Family family) {
        return service.adoptChild(child1, family);
    }

    public int count() {
        return service.count();
    }

    public boolean getFamilyById(int id) {
        return service.getFamilyById(id);
    }

    public Family sampleFamilyMembers() throws ParseException {


        Map<DayOfWeek, String> fatherSchedule = new HashMap<>();
        fatherSchedule.put(DayOfWeek.MONDAY, "do exercise");
        Map<DayOfWeek, String> motherSchedule = new HashMap<>();
        motherSchedule.put(DayOfWeek.TUESDAY, "cook meal");
        Map<DayOfWeek, String> childSchedule = new HashMap<>();
        childSchedule.put(DayOfWeek.SUNDAY, "sleep");
        Man father = new Man("Vito", "Karleone", "24/05/1974",
                95,
                fatherSchedule);

        Woman mother = new Woman("Jane", "Karleone", "24/05/1976",
                85,
                motherSchedule);

        Human child = new Human("Michael", "Karleone", "24/05/2001",
                90,
                childSchedule);
        Set<String> habits = new HashSet<>();
        habits.add("sleep");
        habits.add("eat");
        Dog d = new Dog("Rock", 2, 55, habits);
        Set<Pet> petDog = new HashSet<>();
        petDog.add(d);
        List<Human> children = new ArrayList<>();
        children.add(child);

        Family family1 = new Family(mother, father, children, petDog);

        return family1;
    }
    public List<Family> Families() throws ParseException {
        families.add(sampleFamilyMembers());
        return family1;
    }

}
