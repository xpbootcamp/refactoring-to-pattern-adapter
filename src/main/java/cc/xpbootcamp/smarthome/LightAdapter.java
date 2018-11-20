package cc.xpbootcamp.smarthome;

public class LightAdapter implements Switchable {
    private Light light;

    public LightAdapter(Light light) {
        this.light = light;
    }

    public LightAdapter() {

    }

    @Override
    public void turnOff() {
        if (light != null) {
            light.turnOff();
        }
    }

    @Override
    public void turnOn() {
        if (light != null) {
            light.turnOn();
        }
    }
}