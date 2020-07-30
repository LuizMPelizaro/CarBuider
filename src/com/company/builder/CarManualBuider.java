package com.company.builder;

import com.company.cars.Manual;
import com.company.cars.Type;
import com.company.componets.Engine;
import com.company.componets.GPSNavigator;
import com.company.componets.Transmission;
import com.company.componets.TripComputer;


public class CarManualBuider implements Buider {
    /**
     * Ao contrário de outros padrões criacionais, o Builder pode construir produtos não relacionados, que não têm a interface comum.
     * Neste caso , foi construido um manual de usuario pa um carro , usando os mesmos passos que foram usados para construir o carro.
     * Isso permite produzir manuais para modelos de carros especificos , configurados com diferentes caracteriscas
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

    public Manual getResult() {
        return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
