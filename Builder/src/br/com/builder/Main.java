package br.com.builder;

import br.com.builder.builders.CarBuilder;
import br.com.builder.builders.SportCarBuilder;
import br.com.builder.builders.TruckBuilder;
import br.com.builder.cars.Car;
import br.com.builder.cars.SportCar;
import br.com.builder.cars.Truck;
import br.com.builder.director.Director;

public class Main {

    public static void main(String[] args) {
        Director director = new Director();

        //criando o carro
        CarBuilder builder = new CarBuilder();
        director.constructorSedanCar(builder);

        Car car = builder.getResult();
        System.out.println(car.getCarType() + " produzido com sucesso!");

        //criando um caminhão
        TruckBuilder truckBuilder = new TruckBuilder();
        director.constructorTruck(truckBuilder);

        Truck truck = truckBuilder.getResult();
        System.out.println("Caminhao: " + truck.result());

        //criando um carro esporte
        SportCarBuilder sportCarBuilder = new SportCarBuilder();
        director.constructorSportCar(sportCarBuilder);

        SportCar sportCar = sportCarBuilder.getResult();
        System.out.println(sportCar.getCarType() + " na cor " + sportCar.getColor() + " produzido com sucesso!");

    }
}
