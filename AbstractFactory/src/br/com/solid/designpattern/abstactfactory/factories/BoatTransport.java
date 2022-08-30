package br.com.solid.designpattern.abstactfactory.factories;

import br.com.solid.designpattern.abstactfactory.airCrafts.Airplane;
import br.com.solid.designpattern.abstactfactory.airCrafts.IAirCrafts;
import br.com.solid.designpattern.abstactfactory.landVehicles.Car;
import br.com.solid.designpattern.abstactfactory.landVehicles.ILandVehicles;
import br.com.solid.designpattern.abstactfactory.waterVehicle.Boat;
import br.com.solid.designpattern.abstactfactory.waterVehicle.IWaterVehicle;

public class BoatTransport implements ITransportFactory{
    @Override
    public ILandVehicles createTransportVehicle() {
        return new Car();
    }

    @Override
    public IAirCrafts creteTransportAirCraft() {
        return new Airplane();
    }

    @Override
    public IWaterVehicle createTransportWaterVehicle() {
        return new Boat();
    }
}
