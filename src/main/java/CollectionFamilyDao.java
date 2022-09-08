import java.util.ArrayList;
import java.util.List;

public class CollectionFamilyDao implements FamilyDao {
    public static List<Family> family = new ArrayList<>();
    public static List<Family> family1 = new ArrayList<>();

    @Override
    public List<Family> getAllFamilies() {
        return family;
    }

    @Override
    public void saveFamily(Family family) {
        family.add(family1);
    }



    @Override
    public boolean deleteFamily(int index) {
        family.remove(family.get(index));
        return true;

    }
    @Override
    public boolean deleteFamily(Family family) {
        family.remove(family.get(family1));
        return true;

    }

    @Override
    public boolean getFamiliesBiggerThan(Family biggerFamily) {
        return true;
    }
    @Override
    public boolean getFamiliesLessThan(Family lessFamily) {
        return true;
    }


    @Override
    public boolean getFamilyByIndex(int index) {
        family.get(index);
        return true;

    }
    @Override
    public List<Family> DisplayAllFamilies() {
        return family;
    }

}

