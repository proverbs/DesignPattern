package top.proverbs.director;

import top.proverbs.builders.Builder;
import top.proverbs.cars.Type;
import top.proverbs.components.Engine;
import top.proverbs.components.GPSNavigator;
import top.proverbs.components.Transmission;
import top.proverbs.components.TripComputer;

public class Director {
    public void constructSportsCar(Builder builder) {
        builder.setType(Type.SPORTS_CAR)
                .setSeats(2)
                .setEngine(new Engine(3.0, 0))
                .setTransmission(Transmission.SEMI_AUTOMATIC)
                .setTripComputer(new TripComputer())
                .setGPSNavigator(new GPSNavigator());
    }

    public void constructCityCar(Builder builder) {
        builder.setType(Type.CITY_CAR)
                .setSeats(2)
                .setEngine(new Engine(1.2, 0))
                .setTransmission(Transmission.AUTOMATIC)
                .setTripComputer(new TripComputer())
                .setGPSNavigator(new GPSNavigator());
    }

    public void constructSUV(Builder builder) {
        builder.setType(Type.SUV)
                .setSeats(4)
                .setEngine(new Engine(2.5, 0))
                .setTransmission(Transmission.MANUAL)
                .setGPSNavigator(new GPSNavigator());
    }
}
