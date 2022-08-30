package br.com.solid.designpattern.abstactfactory.airCrafts;

public class Airplane implements IAirCrafts{
    @Override
    public void startRoute() {
        wind();
        getCargo();
        System.out.println("Iniciando a decolagem");
    }

    @Override
    public void getCargo() {
        System.out.println("Passageiros a borbo, vôo autorizado.");

    }

    @Override
    public void wind() {
        System.out.println("Ventos a 30km, ventos ok!");

    }
}
