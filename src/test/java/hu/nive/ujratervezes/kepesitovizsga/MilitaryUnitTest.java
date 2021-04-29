package hu.nive.ujratervezes.kepesitovizsga;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MilitaryUnitTest {

    @Test
    void testArcher() {
        Archer archer = new Archer();
        assertEquals(20, archer.doDamage());
        archer.sufferDamage(20);
        assertEquals(30, archer.getHitPoints());
    }

    @Test
    void testHeavyCavalry() {
        HeavyCavalry heavyCavalry = new HeavyCavalry();
        assertEquals(60, heavyCavalry.doDamage());
        assertEquals(20, heavyCavalry.doDamage());
        heavyCavalry.sufferDamage(20);
        assertEquals(140, heavyCavalry.getHitPoints());
    }

}