package Duck;

public interface DuckOperations {

    public void swim();
    public String displayMessage();
    public String quack();
    public void fly();

}

//This interface makes sure all the duck classes that implement it
//are obliged to implement all the above methods
