package cc.xpbootcamp.smarthome;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DigitalHouseKeeperTest {

    @Test
    void should_turn_on_light_when_host_arrives_home(){
        Light light = new Light();
        DigitalHouseKeeper digitalHouseKeeper = new DigitalHouseKeeper();
        digitalHouseKeeper.addSwitch(new LightAdapter(light));

        digitalHouseKeeper.hostArrivesHome();

        assertTrue(light.isOn());
    }

    @Test
    void should_turn_off_light_when_host_leaves_home(){
        Light light = new Light();
        DigitalHouseKeeper digitalHouseKeeper = new DigitalHouseKeeper();
        digitalHouseKeeper.addSwitch(new LightAdapter(light));

        digitalHouseKeeper.hostLeavesHome();

        assertFalse(light.isOn());
    }

    @Test
    void should_turn_on_air_condition_when_host_arrives_home(){
        AirCondition airCondition = new AirCondition();
        DigitalHouseKeeper digitalHouseKeeper = new DigitalHouseKeeper();
        digitalHouseKeeper.addSwitch(new AirConditionAdapter(airCondition));

        digitalHouseKeeper.hostArrivesHome();

        assertTrue(airCondition.isOn());
    }

    @Test
    void should_turn_off_air_condition_when_host_leaves_home(){
        AirCondition airCondition = new AirCondition();
        DigitalHouseKeeper digitalHouseKeeper = new DigitalHouseKeeper();
        digitalHouseKeeper.addSwitch(new AirConditionAdapter(airCondition));

        digitalHouseKeeper.hostLeavesHome();

        assertFalse(airCondition.isOn());
    }

    @Test
    void should_turn_on_television_when_host_arrives_home(){
        Television television = new Television();
        DigitalHouseKeeper digitalHouseKeeper = new DigitalHouseKeeper();
        digitalHouseKeeper.addSwitch(new TelevisionAdapter(television));

        digitalHouseKeeper.hostArrivesHome();

        assertTrue(television.isOn());
    }

    @Test
    void should_turn_off_television_when_host_leaves_home(){
        Television television = new Television();
        DigitalHouseKeeper digitalHouseKeeper = new DigitalHouseKeeper();
        digitalHouseKeeper.addSwitch(new TelevisionAdapter(television));

        digitalHouseKeeper.hostLeavesHome();

        assertFalse(television.isOn());
    }


}
