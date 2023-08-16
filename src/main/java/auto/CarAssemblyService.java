package auto;

import auto.component.Body;
import auto.component.Engine;
import auto.component.Transmission;

import java.util.Objects;

public class CarAssemblyService implements InterfaceAutoAssemblyService{

    @Override
    public BMW assemblingBMW(String brand, String VIN, Engine engine, Transmission transmission, Body body) {
        if(Objects.equals(brand, "BMW") && Objects.equals(VIN, engine.getVIN()) && Objects.equals(VIN, transmission.getVIN()) && Objects.equals(VIN, body.getVIN())){
            return new BMW(brand, VIN, engine, transmission, body);
        }
        return null;
    }

    @Override
    public Mercedes assemblingMercedes(String brand, String VIN, Engine engine, Transmission transmission, Body body) {
        if(Objects.equals(brand, "Mercedes") && Objects.equals(VIN, engine.getVIN()) && Objects.equals(VIN, transmission.getVIN()) && Objects.equals(VIN, body.getVIN())) {
            return new Mercedes(brand, VIN, engine, transmission, body);
        }
        return null;
    }
}
