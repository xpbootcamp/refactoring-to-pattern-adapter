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
        if (light != null) {
            light.turnOn();
        }
        if (airCondition != null){
            airCondition.turnTo(26);
        }
    }

    public void hostLeavesHome() {
        light.turnOff();
    }
}
