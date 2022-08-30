package br.com.solid.designpattern.abstactfactory.factories;

import br.com.solid.designpattern.abstactfactory.airCrafts.Helicopter;
import br.com.solid.designpattern.abstactfactory.airCrafts.IAirCrafts;
import br.com.solid.designpattern.abstactfactory.landVehicles.ILandVehicles;
import br.com.solid.designpattern.abstactfactory.landVehicles.Motorcycle;
import br.com.solid.designpattern.abstactfactory.waterVehicle.Boat;
import br.com.solid.designpattern.abstactfactory.waterVehicle.IWaterVehicle;

public class NineNineTransport implements ITransportFactory{
    @Override
    public ILandVehicles createTransportVehicle() {
        return new Motorcycle();
    }

    @Override
    public IAirCrafts creteTransportAirCraft() {
        return new Helicopter();
    }

    @Override
    public IWaterVehicle createTransportWaterVehicle() {
        return new Boat();
    }
}
