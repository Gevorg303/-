package auto;

import auto.component.Body;
import auto.component.Engine;
import auto.component.Transmission;

public interface InterfaceAutoAssemblyService {
    BMW assemblingBMW(String brand, String VIN, Engine engine, Transmission transmission, Body body);
    Mercedes assemblingMercedes(String brand, String VIN, Engine engine, Transmission transmission, Body body);
}
