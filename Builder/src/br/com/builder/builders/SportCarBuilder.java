package br.com.builder.builders;

import br.com.builder.cars.SportCar;
import br.com.builder.components.CarType;
import br.com.builder.components.Engine;
import br.com.builder.components.Transmission;

public class SportCarBuilder implements IBuilder{

    private CarType carType;
    private int seats;
    private String color;
    private Transmission transmission;
    private Engine engine;

    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public SportCar getResult(){
        return new SportCar(carType, seats, color, engine, transmission);
    }
}
