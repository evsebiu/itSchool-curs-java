package session18;

public class Nurse extends Person {

    public Nurse(String name, String id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(getName() + " performs nursing duties.");
    }
}
