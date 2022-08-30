package br.com.solid.designpattern.abstactfactory.landVehicles;

public class Car implements ILandVehicles{
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando o trajeto.");

    }

    @Override
    public void getCargo() {
        System.out.println("Pegamos os passageiros, estamos prontos!");


    }
}
