package com.company.builder;

import com.company.cars.Car;
import com.company.cars.Type;
import com.company.componets.Engine;
import com.company.componets.GPSNavigator;
import com.company.componets.Transmission;
import com.company.componets.TripComputer;


public class CarBuider implements Buider {

    /**
     * O buider implementa as etapas definidas na  interface
     */
    private Type type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;


    @Override
    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult() {
        return new Car(
                type,
                seats,
                engine,
                transmission,
                tripComputer,
                gpsNavigator);
    }
}
