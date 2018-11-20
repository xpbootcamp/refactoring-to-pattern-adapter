package cc.xpbootcamp.smarthome;

public class AirCondition {
    private static final int HUMAN_SUITABLE_TEMPERATURE = 26;
    private static final int CLOSABLE_TEMPERATURE = -1;

    private int temperature;

    public boolean isOn() {
        return temperature == HUMAN_SUITABLE_TEMPERATURE;
    }

    public void turnOff() {
        temperature = CLOSABLE_TEMPERATURE;
    }

    public void turnOn() {
        temperature = HUMAN_SUITABLE_TEMPERATURE;
    }
}
