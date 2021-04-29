package hu.nive.ujratervezes.kepesitovizsga;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArmyTest {

    Army army;

    @BeforeEach
    void init() {
        army = new Army();
    }

    @Test
    void testGetArmySizeEmpty() {
        assertEquals(0, army.getArmySize());
    }

    @Test
    void testAddUnit() {
        army.addUnit(new HeavyCavalry());
        assertEquals(1, army.getArmySize());
    }

    @Test
    void testGetArmyDamageEmptyArmy() {
        assertEquals(0, army.getArmyDamage());
    }

    @Test
    void testGetArmyDamage_oneOfEachKind() {
        army.addUnit(new HeavyCavalry());
        army.addUnit(new Swordsman(true));
        army.addUnit(new Archer());
        assertEquals(90, army.getArmyDamage());
    }
}