package cc.xpbootcamp.smarthome;

public class DigitalHouseKeeper {
    private Light light;

    public void setLight(Light light) {
        this.light = light;
    }

    public void hostArrivesHome() {
        light.turnOn();
    }

    public void hostLeavesHome() {
        light.turnOff();
    }
}
