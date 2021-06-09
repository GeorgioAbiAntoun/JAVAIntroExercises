package Duck;

public class MallardDuck extends Duck implements DuckOperations{

    public String color;

    public MallardDuck(String gender, int age, String color) {
        super(gender, age);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void swim() {

    }

    @Override
    public String displayMessage() {
        return "this is a mallard Duck";
    }

    @Override
    public String quack() {
        return null;
    }

    @Override
    public void fly() {

    }
}
