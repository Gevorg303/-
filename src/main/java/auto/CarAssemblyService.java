package auto;

import auto.component.*;

import java.util.Objects;

public class CarAssemblyService implements InterfaceAutoAssemblyService{

    @Override
    public BMW assemblingBMW(String brand, EngineBMW engine, TransmissionBMW transmission, BodyBMW body) {
        return new BMW(brand, engine, transmission, body);
    }

    @Override
    public Mercedes assemblingMercedes(String brand, EngineMercedes engine, TransmissionMercedes transmission, BodyMercedes body) {
        return new Mercedes(brand, engine, transmission, body);
    }
}
