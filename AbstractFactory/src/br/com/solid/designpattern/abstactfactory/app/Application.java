package br.com.solid.designpattern.abstactfactory.app;

import br.com.solid.designpattern.abstactfactory.airCrafts.IAirCrafts;
import br.com.solid.designpattern.abstactfactory.factories.ITransportFactory;
import br.com.solid.designpattern.abstactfactory.landVehicles.ILandVehicles;
import br.com.solid.designpattern.abstactfactory.waterVehicle.IWaterVehicle;

public class Application {
    private ILandVehicles vehicles;
    private IAirCrafts airCrafts;
    private IWaterVehicle waterVehicle;

    public Application(ITransportFactory factory) {
        vehicles = factory.createTransportVehicle();
        airCrafts = factory.creteTransportAirCraft();
        waterVehicle = factory.createTransportWaterVehicle();
    }

    public void startRoute() {
        vehicles.startRoute();
        airCrafts.startRoute();
        waterVehicle.startRoute();
    }
}
