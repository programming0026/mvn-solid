package com.juniverse.solid.lsp;


import java.util.logging.Logger;
import com.juniverse.solid.AppLogger;
/**
 * Paloma: se mueve volando.
 *
 * @author Java Universe
 */
public class Pigeon extends Bird {
    private static final Logger LOGGER = AppLogger.get(Pigeon.class);


    /** Vuela. */
    @Override
    public void move() {
        fly();
    }

    /** Imprime que la paloma vuela. */
    private void fly() {
        LOGGER.info("The pigeon is flying");
    }
}
