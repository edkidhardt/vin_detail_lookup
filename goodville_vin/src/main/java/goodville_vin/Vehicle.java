package goodville_vin;

import java.util.List;
import org.springframework.web.client.RestTemplate;

public class Vehicle {

    private final String vin;
    private String year;
    private String make;
    private String model; 

    public Vehicle(String vin) {
        this.vin = vin;
    }

    public String getVin() {
        return this.vin;
    }
    
    public String getYear() {
        return this.year;
    }
    
    public String getMake() {
        return this.make;
    }
    
    public String getModel() {
        return this.model;
    }

    public String getContent() {
        return "Year:" + year + " Make:" + make + " Model:" + model;
    }
    
    
    public String getDotAttr(){
        //  get json from nhtsa
        //---------------------
        RestTemplate restTemplate = new RestTemplate();
        Dot_json dot_info = new Dot_json();
        dot_info = restTemplate.getForObject("https://vpic.nhtsa.dot.gov/api/vehicles/decodevinvalues/" + this.vin + "?format=json", Dot_json.class);
        
        List<Result> dot_list = dot_info.getResults();
        
        
        if (dot_list.get(0).getMake().equals(' ') & dot_list.get(0).getModel().equals(' ')
                & dot_list.get(0).getYear().equals(' ')){
            return "Not Found";
        }
        //  assign values to attributes
        //-----------------------------
        this.make   = dot_list.get(0).getMake();
        this.model  = dot_list.get(0).getModel();
        this.year   = dot_list.get(0).getYear();
             
        return this.getContent();
        
    }
}