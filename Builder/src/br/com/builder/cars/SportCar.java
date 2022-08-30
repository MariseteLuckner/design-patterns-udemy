package br.com.builder.cars;

import br.com.builder.components.CarType;
import br.com.builder.components.Engine;
import br.com.builder.components.Transmission;

public class SportCar {

    private final Transmission transmission;
    private final Engine engine;
    private final int seats;
    private final String color;
    private final CarType carType;


    public SportCar(CarType carType,
               int seats,
               String color,
               Engine engine,
               Transmission transmission){
        this.carType = carType;
        this.seats = seats;
        this.color = color;
        this.engine = engine;
        this.transmission = transmission;
    }

    public CarType getCarType(){
        return carType;
    }

    public int getSeats(){
        return seats;
    }

    public String getColor(){
        return color;
    }

    public Engine getEngine(){
        return engine;
    }

    public Transmission getTransmission(){
        return transmission;
    }
}
