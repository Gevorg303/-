package auto;

import auto.component.*;

public interface InterfaceAutoAssemblyService {
    BMW assemblingBMW(String brand, EngineBMW engine, TransmissionBMW transmission, BodyBMW body);
    Mercedes assemblingMercedes(String brand, EngineMercedes engine, TransmissionMercedes transmission, BodyMercedes body);
}
