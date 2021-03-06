package api;


import api.service.IPersonaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Consola implements CommandLineRunner {

    private static Logger LOG = LoggerFactory.getLogger(Consola.class);
    @Autowired
    private IPersonaService service;
    public static void main(String[] eco) {
        SpringApplication.run(Consola.class, eco);
    }

    @Override
    public void run(String... args) throws Exception {

        service.registrar("Hector Luna Arriaga");
    }
}
