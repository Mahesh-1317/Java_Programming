package PackagesAndAM.interface1;

public abstract class Bird implements Flyable {
    private final String name;

    public Bird(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
