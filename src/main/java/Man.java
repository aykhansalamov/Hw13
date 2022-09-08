import java.text.ParseException;
import java.util.Map;

public final class Man extends Human{

    public Man (String name, String surname, String birthDate, int iq, Map<DayOfWeek, String> schedule) throws ParseException {
        super(name, surname,birthDate, iq, schedule);
    }

    public void greetPet() {
        System.out.println("Hello, I'm a man, " + family.getPet().getNickName());
    }
    public void repairCar () {
        System.out.println("Wait me for an hour for repairing car");
    }

}
