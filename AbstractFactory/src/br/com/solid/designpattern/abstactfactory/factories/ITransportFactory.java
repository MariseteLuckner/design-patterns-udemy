package br.com.solid.designpattern.abstactfactory.factories;

import br.com.solid.designpattern.abstactfactory.airCrafts.IAirCrafts;
import br.com.solid.designpattern.abstactfactory.landVehicles.ILandVehicles;
import br.com.solid.designpattern.abstactfactory.waterVehicle.IWaterVehicle;

public interface ITransportFactory {
    ILandVehicles createTransportVehicle();
    IAirCrafts creteTransportAirCraft();
    IWaterVehicle createTransportWaterVehicle();
}
