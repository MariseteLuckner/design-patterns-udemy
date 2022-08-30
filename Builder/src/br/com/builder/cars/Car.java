package br.com.builder.cars;

import br.com.builder.components.CarType;
import br.com.builder.components.Engine;
import br.com.builder.components.Transmission;

public class Car {

    private final Transmission transmission;
    private final Engine engine;
    private final int seats;
    private final CarType carType;


    public Car(CarType carType,
               int seats,
               Engine engine,
               Transmission transmission){
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
    }

    public CarType getCarType(){
        return carType;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine(){
        return engine;
    }

    public Transmission getTransmission(){
        return transmission;
    }
}
