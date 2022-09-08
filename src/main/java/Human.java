import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

public class Human {


    private String name;
    private String surname;
    private int year;
    private int iq;
    private Map<DayOfWeek, String> schedule;
    Family family;
    private long birthDate;

    public static final SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

    protected void finalize()
    {
        System.out.println("Finalize method called from Human class");
    }
    // Pet pet = new Pet();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public long getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(long birthDate) {
        this.birthDate = birthDate;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Map<DayOfWeek, String> getSchedule() {
        return schedule;
    }

    public void setSchedule(Map<DayOfWeek, String> schedule) {
        this.schedule = schedule;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

//    public Pet getPet() {
//        return pet;
//    }

//    public void setPet(Pet pet) {
//        this.pet = pet;
//    }

    public void greetPet() {
        System.out.println("Hello, " + Species.DOG);
    }
    public Human(String name, String surname, String birthDate, int iq, Map<DayOfWeek, String> schedule) throws ParseException {
        this.name = name;
        this.surname = surname;
        this.birthDate = describeAge(birthDate).getTime();
        this.iq = iq;
        this.schedule = schedule;
    }




    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birth date=" + df.format(birthDate) +
                ", iq=" + iq +
                ", schedule=" + schedule +
                '}';
    }

    public Human() {
    }

    public Human(String name, String surname, String birthdate) throws ParseException {
        this.name = name;
        this.surname = surname;
        this.birthDate = describeAge(String.valueOf(birthDate)).getTime();
    }

    private Date describeAge(String birthDate) throws ParseException {
        return df.parse(birthDate);
    }

    public void describePet() {
        String slyLevel = "";
        if (family.getPet().getTrickLevel() >= 50) {
            slyLevel = "he is very sly";
        } else {
            slyLevel = "almost not sly";
        }
        System.out.println("I have a " + Species.values() + ", he is " + family.getPet().getAge() + " years old, " + slyLevel);
    }

    public void feedPet(boolean feedTime) {
        if (feedTime) {
            System.out.println("Hm... I will feed " + family.getPet().getNickName());
        } else {
            System.out.println("I think " + family.getPet().getNickName() + " is not hungry.");
        }
    }
//    public String prettyFormat() {
//        String s = (String.valueOf(family.getMother() + family.getFather()));
//        return s;
//
//    }


}
