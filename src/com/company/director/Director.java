package com.company.director;

import com.company.builder.Buider;
import com.company.cars.Type;
import com.company.componets.Engine;
import com.company.componets.GPSNavigator;
import com.company.componets.Transmission;
import com.company.componets.TripComputer;

public class Director {
    /**
     * O diretor define a ordem de construção de etapas
     * Ele funciona com um objeto construtor atraves da interface comum do construtor
     * Portanto, ele pode não saber que produto está sendo construído.
     */
    public void constructCityCar(Buider builder) {
        builder.setType(Type.CITY_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructSportsCar(Buider builder) {
        builder.setType(Type.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());

    }
}
