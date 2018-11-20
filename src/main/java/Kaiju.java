import behaviours.IAttack;
import behaviours.IDamage;

public abstract class Kaiju implements IDamage, IAttack {

    private String name;
    private int healthValue;
    private int attackValue;

    public Kaiju(String name, int healthValue, int attackValue) {
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String roar(){
        return "ROARRR!";
    }

    public void attack(IDamage thingAttacked){
        thingAttacked.takeDamage(this.attackValue);
    }

    public String getName() {
        return this.name;
    }

    public int getHealthValue() {
        return this.healthValue;
    }

    public int getAttackValue() {
        return this.attackValue;
    }

    public void takeDamage(int damage){
         this.healthValue -= damage;

    }

}
