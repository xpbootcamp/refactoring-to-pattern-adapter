package cc.xpbootcamp.smarthome;

public class DigitalHouseKeeper {
    private final LightAdapter lightAdapter = new LightAdapter();
    private final AirConditionAdapter airConditionAdapter = new AirConditionAdapter();

    public void setLight(Light light) {
        this.lightAdapter.light = light;
    }

    public void setAirCondition(AirCondition airCondition) {
        this.airConditionAdapter.airCondition = airCondition;
    }

    public void hostArrivesHome() {
        lightAdapter.turnOn();
        airConditionAdapter.turnOn();
    }

    public void hostLeavesHome() {
        lightAdapter.turnOff();
        airConditionAdapter.turnOff();
    }
}
