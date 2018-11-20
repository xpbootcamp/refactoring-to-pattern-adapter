package cc.xpbootcamp.smarthome;

import static cc.xpbootcamp.smarthome.Television.PROGRAM_CCTV5;

public class TelevisionAdapter implements Switchable {
    private Television television;

    public TelevisionAdapter(Television television) {
        this.television = television;
    }

    @Override
    public void turnOff() {
        television.turnTo(null);
    }

    @Override
    public void turnOn() {
        television.turnTo(PROGRAM_CCTV5);
    }
}
