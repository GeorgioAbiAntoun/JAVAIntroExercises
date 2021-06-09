package Car;

public class Ford extends Car{

    public int year;
    public int manufacturerDiscount;

    public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount){

        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;

    }

    public double getSalePrice(){
        return this.getRegularPrice() * (1 - this.manufacturerDiscount/100.0);
    }



}
