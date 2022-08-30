package br.com.solid.designpattern.abstactfactory.airCrafts;

public class Helicopter implements IAirCrafts{
    @Override
    public void startRoute() {
        wind();
        getCargo();
        System.out.println("Iniciando a decolagem.");
    }

    @Override
    public void getCargo() {
        System.out.println("Passageiros ok, ligando hélices.");

    }

    @Override
    public void wind() {
        System.out.println("Ventos a 25km, ventos ok!");

    }
}
