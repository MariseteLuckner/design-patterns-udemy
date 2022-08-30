package br.com.solid.designpattern.factory;

import br.com.solid.designpattern.factory.vehicle.IVehicle;
import br.com.solid.designpattern.factory.vehicle.Motorcycle;

public class MotorcycleTransport extends Transport{
    @Override
    protected IVehicle creaateTransport() {
        return new Motorcycle();
    }
}
