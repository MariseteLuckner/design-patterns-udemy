package br.com.solid.designpattern.factory;

import br.com.solid.designpattern.factory.vehicle.Bike;
import br.com.solid.designpattern.factory.vehicle.IVehicle;

public class BikeTransport extends Transport{
    @Override
    protected IVehicle creaateTransport() {
        return new Bike();
    }
}
