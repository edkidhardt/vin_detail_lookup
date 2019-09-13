package goodville_vin;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Dot_json {
    
    @JsonProperty("Count")
    private Long count;
    
    @JsonProperty("Message")
    private String message;
    
    @JsonProperty("SearchCriteria")
    private String searchCriteria;
    
    @JsonProperty("Results")
    private List<Result> results;
    
    public Dot_json(){
        
    }    
    
    public Long getCount() {
        return this.count;
    }

    public void setCount(Long count) {
        this.count = count;
    }
    
    public String getMessage() {
        return this.message;
    }

    public void setCount(String message) {
        this.message = message;
    }
    
    public String getSearchCriteria() {
        return this.searchCriteria;
    }

    public void setSearchCriteria(String searchCriteria) {
        this.searchCriteria = searchCriteria;
    }
    
    public List<Result> getResults() {
        return this.results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }
}