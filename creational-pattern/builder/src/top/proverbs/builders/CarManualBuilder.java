package top.proverbs.builders;

import top.proverbs.cars.Manual;
import top.proverbs.cars.Type;
import top.proverbs.components.Engine;
import top.proverbs.components.GPSNavigator;
import top.proverbs.components.Transmission;
import top.proverbs.components.TripComputer;

/**
 * Concrete builders implement steps defined in the common interface.
 * */
public class CarManualBuilder implements Builder {
    private Type type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public CarManualBuilder setType(Type type) {
        this.type = type;
        return this;
    }

    @Override
    public CarManualBuilder setSeats(int seats) {
        this.seats = seats;
        return this;
    }

    @Override
    public CarManualBuilder setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public CarManualBuilder setTransmission(Transmission transmission) {
        this.transmission = transmission;
        return this;
    }

    @Override
    public CarManualBuilder setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
        return this;
    }

    @Override
    public CarManualBuilder setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
        return this;
    }

    /**
     * getResult() can return different types as the result,
     * even if many builders are implementing the same builder interface.
     * */
    public Manual getResult() {
        return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
