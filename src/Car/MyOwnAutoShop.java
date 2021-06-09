package Car;

import java.util.ArrayList;
import java.util.List;

public class MyOwnAutoShop {

    public static void main (String [] args){

        Car car1 = new Sedan(120, 10000, "Red", 21);
        Car car2 = new Ford(200, 35000, "Yellow", 2009, 12);
        Car car3 = new Ford(210, 37500, "Yellow", 2012, 5);
        Car car4 = new Car(100, 9000, "Black");

        List<Car> carList = new ArrayList<Car>();

        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);

        carList.forEach(car -> {
            System.out.printf("Car price: " + car.getSalePrice() + "%n");
        });

    }
}
