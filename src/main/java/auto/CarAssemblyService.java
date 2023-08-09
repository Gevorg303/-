package auto;

import java.util.Objects;

public class CarAssemblyService {
    public Auto assemblyService(String brand, Component body, Component engine, Component transmission){
        if(Objects.equals(body.getBrand(), brand) && Objects.equals(engine.getBrand(), brand) && Objects.equals(transmission.getBrand(), brand)){
            return new Auto(brand, body, engine, transmission);
        }
        return null;
    }
}
