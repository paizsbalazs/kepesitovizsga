package hu.nive.ujratervezes.kepesitovizsga;

public class HeavyCavalry extends MilitaryUnit {

    private int numberOfAttack = 1;

    public void setNumberOfAttack(int numberOfAttack) {
        this.numberOfAttack = numberOfAttack;
    }

    public HeavyCavalry() {
        super(150, 20, true);
    }

    private void countingAttack() {
        numberOfAttack++;
    }

    @Override
    protected int doDamage() {

        if (this.numberOfAttack == 1) {
            return 3*(super.doDamage());
        } else {
            return super.doDamage();
        }

    }
}
