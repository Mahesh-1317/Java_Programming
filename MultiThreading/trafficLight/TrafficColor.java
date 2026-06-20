package MultiThreading.trafficLight;

public enum TrafficColor {
    RED(10000),
     YELLOW(2000),
      GREEN(5000);

    private int onTimeInMills;

    TrafficColor(int onTimeInMills) {
        this.onTimeInMills = onTimeInMills;
    }

    public int getOnTimeInMills() {
        return onTimeInMills;
    }
}
