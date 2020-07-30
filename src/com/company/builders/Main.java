package com.company.builders;

import com.company.builder.CarBuider;
import com.company.builder.CarManualBuider;
import com.company.cars.Car;
import com.company.cars.Manual;
import com.company.director.Director;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        /**
         * O diretor pega o objeto buider do cliente
         * Isso porque a aplicação sabe melhor qual construtor usar para obter um produto específico.
         */
        CarBuider buider = new CarBuider();
        director.constructSportsCar(buider);
        /**
         * O produto final é muitas vezes puxado do builder , pois o director nao tem contato e nao depende
         * dos builders  e dos products
         */
        Car car = buider.getResult();
        System.out.println("Car built : \n" + car.getType());

        CarManualBuider manualBuider = new CarManualBuider();
        // O diretor pode conhecer varios metodos de builders
        director.constructSportsCar(manualBuider);
        Manual carManual = manualBuider.getResult();
        System.out.println("\nCar manual built :\n" + carManual.print());


        // construindo um carro  de cidade
        director.constructCityCar(buider);
        Car car1 = buider.getResult();
        System.out.println("Car built : " + car1.getType());
        director.constructCityCar(manualBuider);
        Manual carManual1 = manualBuider.getResult();
        System.out.println("\nCar manual build : \n" + carManual1.print());
    }
}
