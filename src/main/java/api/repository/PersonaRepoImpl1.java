package api.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("persona1")
public class PersonaRepoImpl1 implements IPersonaRepo{
    private static Logger LOG = LoggerFactory.getLogger(PersonaRepoImpl1.class);
    @Override
    public void registrar(String nombre) {
        LOG.info("Persona 1, se registró : " + nombre);
    }
}
