package itstep.learning.oop;

import itstep.learning.oop.annotations.Product;
import itstep.learning.oop.annotations.Required;

import java.util.Locale;

@Product
public class Car
        extends Vehicle
        implements Trailer {

    @Required
    private String carBody = "";

    public Car() {
    }

    public Car( String name, String type ) {
        super( name );
        this.setCarBody( type );
    }

    public String getCarBody() {
        return carBody;
    }

    public void setCarBody(String carBody) {
        this.carBody = carBody;
    }

    @Override
    public String getInfo() {
        return String.format(
                Locale.ROOT,
                "Car '%s', carBody: %s",
                super.getName(),
                this.getCarBody()
        );
    }

    @Override
    public String trailerInfo() {
        return "Сar trailer";
    }
}
