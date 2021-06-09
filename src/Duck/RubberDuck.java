package Duck;

public class RubberDuck extends Duck implements DuckOperations{

    public String rubberQuality;

    public RubberDuck(String type, int age, String rubberQuality) {
        super(type, age);
        this.rubberQuality = rubberQuality;
    }

    public String getRubberQuality() {
        return rubberQuality;
    }

    public void setRubberQuality(String rubberQuality) {
        this.rubberQuality = rubberQuality;
    }

    @Override
    public void swim() {

    }

    @Override
    public String displayMessage() {
        return "this is a rubber Duck";
    }

    @Override
    public String quack() {
        return null;
    }

    @Override
    public void fly() {

    }
}
