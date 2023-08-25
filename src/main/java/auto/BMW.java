package auto;

import auto.component.BodyBMW;
import auto.component.EngineBMW;
import auto.component.TransmissionBMW;

public class BMW extends Auto{
    public BMW(String brand, EngineBMW engine, TransmissionBMW transmission, BodyBMW body) {
        super(brand, engine, transmission, body);
    }
}
