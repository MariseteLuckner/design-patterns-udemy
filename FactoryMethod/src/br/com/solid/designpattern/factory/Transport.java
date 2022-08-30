package br.com.solid.designpattern.factory;

import br.com.solid.designpattern.factory.vehicle.IVehicle;

public abstract class Transport {

    void startTransport(){
        IVehicle vehicle = creaateTransport();
        vehicle.startRoute();

    }

    protected abstract IVehicle creaateTransport();
}
