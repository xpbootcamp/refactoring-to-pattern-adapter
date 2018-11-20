package cc.xpbootcamp.smarthome;

import java.util.ArrayList;
import java.util.List;

public class DigitalHouseKeeper {
    private List<Switchable> switches = new ArrayList<>();

    public void addSwitch(Switchable switchable) {
        switches.add(switchable);
    }

    public void hostArrivesHome() {
        switches.forEach(Switchable::turnOn);
    }

    public void hostLeavesHome() {
        switches.forEach(Switchable::turnOff);
    }
}
