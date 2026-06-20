package CollectionAndGenrics.enums;

public enum TrafficLight {
    RED("Stop"), GREEN("Go"), YELLOW("Ready");

    private final String action;

    TrafficLight(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }
}
