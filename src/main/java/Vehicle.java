import behaviours.IAttack;
import behaviours.IDamage;

public abstract class Vehicle implements IDamage, IAttack {

    private String type;
    private int healthValue;
    private int attackValue;

    public Vehicle(String type, int healthValue, int attackValue) {
        this.type = type;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String getType() {
        return type;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public void attack(IDamage thingAttacked) {
        thingAttacked.takeDamage(this.getAttackValue());
    }

    public void takeDamage(int damage) {
        this.healthValue -= damage;
    }


}
