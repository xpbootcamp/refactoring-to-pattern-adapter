package cc.xpbootcamp.smarthome;

import java.util.ArrayList;
import java.util.List;

public class DigitalHouseKeeper {
    private List<Switchable> switches = new ArrayList<>();

    public void setLight(Light light) {
        switches.add(new LightAdapter(light));
    }

    public void setAirCondition(AirCondition airCondition) {
        switches.add(new AirConditionAdapter(airCondition));
    }

    public void hostArrivesHome() {
        switches.forEach(Switchable::turnOn);
    }

    public void hostLeavesHome() {
        switches.forEach(Switchable::turnOff);
    }
}
