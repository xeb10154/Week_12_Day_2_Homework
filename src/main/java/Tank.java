public class Tank extends Vehicle {


    public Tank(String type, int healthValue, int attackValue) {
        super(type, healthValue, attackValue);
    }

    public String roll(){
        return "Vroom";
    }


}
