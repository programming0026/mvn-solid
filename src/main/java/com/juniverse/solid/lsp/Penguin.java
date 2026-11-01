package com.juniverse.solid.lsp;


import java.util.logging.Logger;
import com.juniverse.solid.AppLogger;
/**
 * Pingüino: se mueve nadando (no vuela, por eso {@code Bird} no declara {@code fly()}).
 *
 * @author ajuar
 */
public class Penguin extends Bird {
    private static final Logger LOGGER = AppLogger.get(Penguin.class);


    /** Nada. */
    @Override
    public void move() {
        swim();
    }

    /** Imprime que el pingüino nada. */
    private void swim() {
        LOGGER.info("The penguin is swimming");
    }
}
