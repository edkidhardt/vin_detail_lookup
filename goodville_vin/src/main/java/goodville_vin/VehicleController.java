package goodville_vin;


import java.io.IOException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehicleController { 
    
    

    @RequestMapping("/vin")
    public String vehicle(@RequestParam(value="vin", defaultValue="World") String vin) throws IOException {
        Vehicle web_vehicle = new Vehicle(vin);
        web_vehicle.getDotAttr();
        
        return web_vehicle.getContent();
    }
}
