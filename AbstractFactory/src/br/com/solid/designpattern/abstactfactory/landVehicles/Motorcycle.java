package br.com.solid.designpattern.abstactfactory.landVehicles;

public class Motorcycle implements ILandVehicles{
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando a entrega.");
    }

    @Override
    public void getCargo() {
        System.out.println("Pegamos a encomenda!");

    }
}
