package com.company.cars;

import com.company.componets.Engine;
import com.company.componets.GPSNavigator;
import com.company.componets.Transmission;
import com.company.componets.TripComputer;

import java.lang.reflect.Type;

public class Manual {
    /**
     * O manual do carro é outro produto.
     * Observe que ele não tem o mesmo ancestral que um carro.
     * Isso mostra que eles não tem relacionamento
     */
    private final Type type;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;

    public Manual(Type type, int seats, Engine engine, Transmission transmission, TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.type = type;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public String print() {
        String info = "";
        info += "Type of car :" + type + "\n";
        info += "Count of seats" + seats + "\n";
        info += "Engine: volume -" + engine.getVolume() + "; mileage -" + engine.getMileage() + "\n";
        info += "Tranmission :" + transmission + "\n";
        if (this.tripComputer != null) {
            info += "Tripe Computer :  Functional" + "\n";
        } else {
            info += "Trip Computer : N/A" + "\n";
        }
        if (this.gpsNavigator != null) {
            info += "GPS Navigator : Functional";
        } else {
            info += "GPS Navigator : N/A" + "\n";
        }
        return info;
    }
}
