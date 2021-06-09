package Car;

public class Truck extends Car{

    public int weight;

    public Truck(int speed, double regularPrice, String color, int weight){

        super(speed, regularPrice, color);
        this.weight = weight;

    }

    public double getSalePrice(){
        return weight>2000 ? this.getRegularPrice() * 0.9 : this.getRegularPrice() * 0.8;
    }


}
