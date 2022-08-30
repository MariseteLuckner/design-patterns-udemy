package br.com.solid.isp;

import br.com.solid.isp.vehicles.Car;
import br.com.solid.isp.vehicles.Motorcycle;

public class Main {

    private static String tupe;
    public static void main(String[] args) {

        tupe = "Car";
        if(tupe == "Car") {
            Car car = new Car("Prata", "2017", 1.6, 4);
        }else {
            Motorcycle motorcycle = new Motorcycle("Branca", "2020", 250);
        }

    }
}
