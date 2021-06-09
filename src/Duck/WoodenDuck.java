package Duck;

public class WoodenDuck extends Duck implements DuckOperations{

    public String woodType;

    public WoodenDuck(String type, int age, String woodType) {
        super(type, age);
        this.woodType = woodType;
    }

    public String getWoodType() {
        return woodType;
    }

    public void setWoodType(String woodType) {
        this.woodType = woodType;
    }

    @Override
    public void swim() {

    }

    @Override
    public String displayMessage() {
        return "this is a wooden Duck";
    }

    @Override
    public String quack() {
        return null;
    }

    @Override
    public void fly() {

    }
}
