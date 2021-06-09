package Car;

public class Sedan extends Car{

    public int length;

    public Sedan(int speed, double regularPrice, String color, int length){

        super(speed, regularPrice, color);
        this.length = length;

    }

    public double getSalePrice(){

        return this.length > 20 ? this.regularPrice * 0.95 : this.regularPrice * 0.9;

    }

}
