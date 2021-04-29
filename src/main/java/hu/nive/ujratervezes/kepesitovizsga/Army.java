package hu.nive.ujratervezes.kepesitovizsga;

import java.util.ArrayList;
import java.util.List;

public class Army {

    List<MilitaryUnit> army = new ArrayList<>();

    public Army() {
        this.army = army;
    }

    public void addUnit(MilitaryUnit militaryUnit) {
        army.add(militaryUnit);
    }

    public void damageAll(int damage) {
        for (MilitaryUnit m: army) {
            if (m.doArmyDamage(damage)<25) {
                army.remove(m);
            }

        }
    }

    public int getArmySize() {
        return army.size();
    }

    public int getArmyDamage() {
        int result = 0;

        for (MilitaryUnit m: army) {
            result += m.getAttack();
        }

        return result;
    }
}
