import java.text.ParseException;
import java.util.Map;

public final class Woman extends Human{
    public Woman (String name, String surname, String birthDate, int iq, Map<DayOfWeek, String> schedule) throws ParseException {
        super(name, surname, birthDate, iq, schedule);
    }

    public void greetPet() {
        System.out.println("Hello, I'm a woman, " + family.getPet().getNickName());
    }
    public void makeUP () {
        System.out.println("Wait me for an hour for makeup process");
    }


}
