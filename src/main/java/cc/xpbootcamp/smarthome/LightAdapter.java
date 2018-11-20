package cc.xpbootcamp.smarthome;

public class LightAdapter {
    Light light;

    public LightAdapter() {
    }

    void turnOffLight() {
        if (light != null) {
            light.turnOff();
        }
    }

    void turnOnLight() {
        if (light != null) {
            light.turnOn();
        }
    }
}