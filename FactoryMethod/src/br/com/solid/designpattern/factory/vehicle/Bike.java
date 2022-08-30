package br.com.solid.designpattern.factory.vehicle;

public class Bike implements IVehicle{
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando a entrega!");

    }

    @Override
    public void getCargo() {
        System.out.println("Pegamos a comida!");

    }
}
