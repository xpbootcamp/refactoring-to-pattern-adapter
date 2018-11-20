package cc.xpbootcamp.smarthome;

public class DigitalHouseKeeper {
    private  Switchable lightAdapter = new LightAdapter();
    private  Switchable airConditionAdapter = new AirConditionAdapter();

    public void setLight(Light light) {
        lightAdapter =  new LightAdapter(light);
    }

    public void setAirCondition(AirCondition airCondition) {
        airConditionAdapter = new AirConditionAdapter(airCondition);
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
