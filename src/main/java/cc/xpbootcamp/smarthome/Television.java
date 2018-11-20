package cc.xpbootcamp.smarthome;

public class Television {
    public static final  String PROGRAM_CCTV5 = "CCTV-5";

    private String program;

    public boolean isOn() {
        return PROGRAM_CCTV5.equals(program);
    }

    public void turnTo(String program) {
        this.program = program;
    }
}
