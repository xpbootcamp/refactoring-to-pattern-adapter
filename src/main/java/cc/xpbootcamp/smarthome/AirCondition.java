package cc.xpbootcamp.smarthome;

public class AirCondition {
    private static final int HUMAN_SUITABLE_TEMPERATURE = 26;

    private int temperature;

    public boolean isOn() {
        return temperature == HUMAN_SUITABLE_TEMPERATURE;
    }

    public void turnTo(int temperature) {
        this.temperature = temperature;
    }
}
