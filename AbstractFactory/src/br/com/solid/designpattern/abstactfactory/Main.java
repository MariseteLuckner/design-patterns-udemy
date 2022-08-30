package br.com.solid.designpattern.abstactfactory;

import br.com.solid.designpattern.abstactfactory.app.Application;
import br.com.solid.designpattern.abstactfactory.factories.BoatTransport;
import br.com.solid.designpattern.abstactfactory.factories.ITransportFactory;
import br.com.solid.designpattern.abstactfactory.factories.NineNineTransport;
import br.com.solid.designpattern.abstactfactory.factories.UberTransport;

public class Main {

    public static Application configureApplication() {
        Application app;
        ITransportFactory factory;

        String company = "Uber";

        if (company == "Uber") {
            factory = new UberTransport();
        } else if (company == "99"){
            factory = new NineNineTransport();
        }
        else  {
            factory = new BoatTransport();

        }
        app = new Application(factory);

        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.startRoute();

    }
}
