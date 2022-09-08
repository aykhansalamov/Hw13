import java.text.ParseException;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;



public class FamilyService {

    FamilyDao dao;

    Family fm;
    FamilyController control = new FamilyController();
    public List<Family> getAllFamilies() {

        return dao.getAllFamilies();
    }

    public Family createNewFamily(Man father, Woman mother) {
        Family family1 = new Family(mother, father);
        dao.saveFamily(family1);
        return family1;
    }

    public void deleteFamily(int index) {
        if (dao.deleteFamily(index)) System.out.println("Selected family has been deleted");
        else System.out.println("Entered family does not exist");
    }

    public void getFamilyByIndex(int index) {
        if (dao.getFamilyByIndex(index)) System.out.println(CollectionFamilyDao.family.get(index));
        else System.out.println("Entered family does not exist");
    }

    public void deleteFamily(Family family) {
        if (dao.deleteFamily(family)) System.out.println("Selected family has been deleted");
        else System.out.println("Entered family does not exist");
    }
    public List<Family> displayAllFamilies() {
        return dao.getAllFamilies();
    }
    public void displayAllFamilies1() {
    CollectionFamilyDao.family.stream().forEach(family1 -> family1.toString());
    }

    public int countFamiliesWithMemberNumber() {
        List<Family> family2 = CollectionFamilyDao.family.stream().filter(family1 -> family1.length() == 3).collect(Collectors.toList());
        int sizeFamily2 = family2.size();
        return sizeFamily2;

    }

    public void getFamiliesBiggerThan() throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input family size for displaying families bigger than the size:");
        int a = sc.nextInt();
        if (99> a){
            System.out.println(control.sampleFamilyMembers());
        } else {
            System.out.println("No any family with size of bigger than " + a);
        }
    }

    public void getFamiliesLessThan() {
        List<Family> smallerFamily = CollectionFamilyDao.family.stream().filter(family1 -> family1.length() < 3).collect(Collectors.toList());
    }


    public Family adoptChild(Human child1, Family family) {
        family.addChild(child1);
        child1.setFamily(family);
        dao.saveFamily(family);
        return family;
    }

    public int count() {
        return getAllFamilies().size();
    }
    public boolean getFamilyById(int id) {
        return dao.getFamilyByIndex(id);
    }

    public Family sampleFamilyMembers () throws ParseException {
        control.sampleFamilyMembers().getFamily1().equals(CollectionFamilyDao.family1);
    return (Family) CollectionFamilyDao.family1;}

}
