package cc.xpbootcamp.smarthome;

public class AirConditionAdapter implements Switchable {
    private AirCondition airCondition;

    public AirConditionAdapter(AirCondition airCondition) {
        this.airCondition = airCondition;
    }

    @Override
    public void turnOff() {
        if (airCondition != null) {
            airCondition.turnOff();
        }
    }

    @Override
    public void turnOn() {
        if (airCondition != null) {
            airCondition.turnOn();
        }
    }
}