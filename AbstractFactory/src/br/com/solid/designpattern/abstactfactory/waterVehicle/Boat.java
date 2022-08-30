package br.com.solid.designpattern.abstactfactory.waterVehicle;

public class Boat implements IWaterVehicle{
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando o tajeto em alto mar.");
    }

    @Override
    public void getCargo() {
        System.out.println("Pegamos a carga, estamos prontos");

    }
}
