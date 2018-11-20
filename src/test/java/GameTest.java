import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    LizardA lizardA;
    LizardB lizardB;
    Vehicle tank;

    @Before
    public void setup(){
        lizardA = new LizardA("Whatever",150, 15);
        lizardB = new LizardB("Something",100, 25);
        tank = new Tank("Panzer", 40, 5);
    }

    @Test
    public void testRoar(){
        assertEquals("ROARRR!", lizardA.roar());
        assertEquals("ROARRR!", lizardB.roar());
    }

    @Test
    public void lizardsAttackEachOther(){
        lizardA.attack(lizardB);
        lizardB.attack(lizardA);
        assertEquals(125, lizardA.getHealthValue());
        assertEquals(85, lizardB.getHealthValue());
    }

    @Test
    public void vehicleAnnihilation(){
        lizardA.attack(tank);
        lizardB.attack(tank);
        assertEquals(0, tank.getHealthValue());
    }
}
