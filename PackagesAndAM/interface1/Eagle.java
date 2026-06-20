package PackagesAndAM.interface1;

public class Eagle extends Bird {
    public Eagle(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Eagle is flying high in the sky.");
    }
}
