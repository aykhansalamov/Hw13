import java.util.List;

public interface FamilyDao {

     List<Family> getAllFamilies();

     boolean getFamiliesBiggerThan(Family biggerFamily);

     boolean getFamiliesLessThan(Family lessFamily);

     boolean getFamilyByIndex(int index);
     boolean deleteFamily(int index);
     boolean deleteFamily(Family family);
     void saveFamily(Family family1);
     List<Family> DisplayAllFamilies();
}
