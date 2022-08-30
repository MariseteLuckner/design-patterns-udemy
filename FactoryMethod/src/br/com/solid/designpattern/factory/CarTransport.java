package br.com.solid.designpattern.factory;

import br.com.solid.designpattern.factory.vehicle.Car;
import br.com.solid.designpattern.factory.vehicle.IVehicle;

public class CarTransport extends Transport{
    @Override
    protected IVehicle creaateTransport() {
        return new Car();
    }
}
