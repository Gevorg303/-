package auto;

import auto.component.Body;
import auto.component.Engine;
import auto.component.Transmission;

public class BMW extends Auto{
    public BMW(String brand, String VIN, Engine engine, Transmission transmission, Body body) {
        super(brand, VIN, engine, transmission, body);
    }
}
