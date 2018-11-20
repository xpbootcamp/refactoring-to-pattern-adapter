package cc.xpbootcamp.smarthome;

public class DigitalHouseKeeper {
    private Light light;
    private AirCondition airCondition;

    public void setLight(Light light) {
        this.light = light;
    }

    public void setAirCondition(AirCondition airCondition) {
        this.airCondition = airCondition;
    }

    public void hostArrivesHome() {
        turnOnLight();
        turnOnAirCondition();
    }

    public void hostLeavesHome() {
        turnOffLight();
        turnOffAirCondition();
    }

    private void turnOffAirCondition() {
        if (airCondition != null){
            airCondition.turnOff();
        }
    }

    private void turnOffLight() {
        if (light != null) {
            light.turnOff();
        }
    }

    private void turnOnAirCondition() {
        if (airCondition != null){
            airCondition.turnOn();
        }
    }

    private void turnOnLight() {
        if (light != null) {
            light.turnOn();
        }
    }
}
