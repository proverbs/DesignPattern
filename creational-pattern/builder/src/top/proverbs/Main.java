package top.proverbs;

import top.proverbs.builders.CarBuilder;
import top.proverbs.builders.CarManualBuilder;
import top.proverbs.cars.Car;
import top.proverbs.cars.Manual;
import top.proverbs.director.Director;

/**
 * Main class. Everything comes together here.
 * */
public class Main {

    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getType());

        CarManualBuilder manualBuilder = new CarManualBuilder();

        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}
