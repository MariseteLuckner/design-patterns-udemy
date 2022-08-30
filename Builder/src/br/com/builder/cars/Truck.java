package br.com.builder.cars;

import br.com.builder.components.CarType;
import br.com.builder.components.Engine;
import br.com.builder.components.Transmission;

public class Truck {

    private Transmission transmission;
    private Engine engine;
    private int seats;
    private CarType carType;


    public Truck(CarType carType,
               int seats,
               Engine engine,
               Transmission transmission){
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
    }

    public String result(){
        String truck = "truck with motor: " + engine.getPower() + "\n";
        truck += " Transmission " + transmission;

        return truck;
    }
}
