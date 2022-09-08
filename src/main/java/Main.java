

import java.text.ParseException;
import java.util.*;

import static java.lang.String.valueOf;


public class Main {


    public static void main(String[] args) throws ParseException{
        FamilyController control = new FamilyController();
        FamilyService service = new FamilyService();
        System.out.println("HAPPY FAMILY APPLICATION");
        System.out.println("- 1. Fill with test data \n" +
                "- 2. Display the entire list of families \n" +
                "- 3. Display a list of families where the number of people is greater than the specified number \n" +
                "- 4. Display a list of families where the number of people is less than the specified number\n" +
                "- 5. Calculate the number of families where the number of members is\n" +
                "- 6. Create a new family\n" +
                "- 7. Delete a family by its index in the general list\n" +
                "- 8. Edit a family by its index in the general list\n" +
                "- 9. Remove all children over the age of majority");
        System.out.println("Choose an action number from list above:");

        Scanner input = new Scanner(System.in);
        String menuChoise = input.nextLine();

        switch(menuChoise){
            case "1":
                System.out.println(fillData());
                break;  //optional
            case "2":
                System.out.println(control.sampleFamilyMembers()) ;

                break;  //optional
            case "3":
                service.getFamiliesBiggerThan();
                 break;
//
//            default:
                //code to be executed if all cases are not matched;
        }


    }
    public static String fillData () throws ParseException{

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

String describedFamily = "family:" + "\n" + valueOf(father) + "\n" + valueOf(mother) + "\n" + "children:" + "\n" + valueOf(child) + "\n" + "pets:" + "\n" + valueOf(d);
//        System.out.println(father + "\n" + mother + "\n" + child + "\n" + d);
return describedFamily;
    }
}