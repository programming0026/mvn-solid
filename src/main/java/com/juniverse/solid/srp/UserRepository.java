package com.juniverse.solid.srp;


import java.util.logging.Logger;
import com.juniverse.solid.AppLogger;
/**
 * Única responsabilidad: guardar usuarios.
 *
 * @author ajuar
 */
public class UserRepository {
    private static final Logger LOGGER = AppLogger.get(UserRepository.class);


    /**
     * Guarda al usuario (simulado con un mensaje en consola).
     * @param user usuario a guardar
     */
    public void save(User user) {
        LOGGER.info("Saving user: " + user.getName());
    }
}
