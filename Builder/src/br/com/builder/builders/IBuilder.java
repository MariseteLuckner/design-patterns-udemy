package br.com.builder.builders;

import br.com.builder.components.CarType;
import br.com.builder.components.Engine;
import br.com.builder.components.Transmission;

public interface IBuilder {
    void setCarType(CarType carType);
    void setTransmission(Transmission transmission);
    void setEngine(Engine engine);
    void setSeats(int seats);
    void setColor(String color);
}
