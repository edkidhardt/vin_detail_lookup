package goodville_vin;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Result {
    
    @JsonProperty("Make")
    private String make;
    
    @JsonProperty("Model")
    private String model;
    
    @JsonProperty("ModelYear")
    private String year;
    
    public Result() {
        
    }
    public String getMake() {
        return this.make;
    }
    
    public String getModel() {
        return this.model;
    }
    
    public String getYear() {
        return this.year;
    }

    public void setMake(String make) {
        this.make = make;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public void setYear(String year) {
        this.year = year;
    }


}
