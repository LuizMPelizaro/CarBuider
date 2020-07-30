package com.company.builder;

import com.company.cars.Type;
import com.company.componets.Engine;
import com.company.componets.GPSNavigator;
import com.company.componets.Transmission;
import com.company.componets.TripComputer;

public interface Buider {
    /**
     * A interface do Buider define todas as formas de configura o produto
     */
    void setType(Type type);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);
}
