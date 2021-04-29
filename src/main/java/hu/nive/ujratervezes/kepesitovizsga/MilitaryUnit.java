package hu.nive.ujratervezes.kepesitovizsga;

public abstract class MilitaryUnit {

    private int life;
    private int attack;
    private boolean shield;

    public MilitaryUnit(int life, int attack, boolean shield) {
        this.life = life;
        this.attack = attack;
        this.shield = shield;
    }

    public int getHitPoints() {
        return life;
    }

    public int getAttack() {
        return attack;
    }

    public boolean isShield() {
        return shield;
    }

    protected int doDamage() {
        return this.getAttack();
    }

    protected int doArmyDamage(int adamage) {
        this.life = this.life - adamage;
        return this.life;
    }

    protected void sufferDamage(int damage) {
        if (this.isShield()) {
            this.life = this.life - ( damage / 2 );
        } else {
            this.life = this.life - damage;
        }
    }



}
