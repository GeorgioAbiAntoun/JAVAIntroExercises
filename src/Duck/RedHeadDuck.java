package Duck;

public class RedHeadDuck extends Duck implements DuckOperations{

    public int wingSpan;

    public RedHeadDuck(String gender, int age, int wingSpan) {
        super(gender, age);
        this.wingSpan = wingSpan;
    }

    public int getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(int wingSpan) {
        this.wingSpan = wingSpan;
    }

    @Override
    public void swim() {

    }

    @Override
    public String displayMessage() {
        return "this is a RedHead Duck";
    }

    @Override
    public String quack() {
        return null;
    }

    @Override
    public void fly() {

    }
}
