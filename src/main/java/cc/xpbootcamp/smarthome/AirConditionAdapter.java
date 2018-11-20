package cc.xpbootcamp.smarthome;

public class AirConditionAdapter {
    AirCondition airCondition;

    public AirConditionAdapter() {
    }

    void turnOffAirCondition() {
        if (airCondition != null) {
            airCondition.turnOff();
        }
    }

    void turnOnAirCondition() {
        if (airCondition != null) {
            airCondition.turnOn();
        }
    }
}