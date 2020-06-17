package top.proverbs.builders;

import top.proverbs.cars.Type;
import top.proverbs.components.Engine;
import top.proverbs.components.GPSNavigator;
import top.proverbs.components.Transmission;
import top.proverbs.components.TripComputer;

/**
 * Builder interface defines all possible ways to configure a product.
 * */
public interface Builder {
    Builder setType(Type type);
    Builder setSeats(int seats);
    Builder setEngine(Engine engine);
    Builder setTransmission(Transmission transmission);
    Builder setTripComputer(TripComputer tripComputer);
    Builder setGPSNavigator(GPSNavigator gpsNavigator);
}
