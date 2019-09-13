package goodville_vin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class application implements CommandLineRunner{

    public static void main(String[] args) {
        SpringApplication.run(application.class, args);
    }
    
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void run(String... strings) throws Exception {
        jdbcTemplate.execute("DROP TABLE vehicleCashe IF EXISTS");
        jdbcTemplate.execute("CREATE TABLE vehicleCashe(" +
                "id SERIAL, c_vin VARCHAR(255), c_year INT(255), c_make VARCHAR(255), c_model VARCHAR(255))");

    }
}


