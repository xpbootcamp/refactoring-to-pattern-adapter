package cc.xpbootcamp.smarthome;

public class AirConditionAdapter implements Switchable {
    AirCondition airCondition;

    public AirConditionAdapter() {
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