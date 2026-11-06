package com.juniverse.solid.isp;


import java.util.logging.Logger;
import com.juniverse.solid.AppLogger;
/**
 * Un humano implementa las cuatro interfaces pequeñas.
 *
 * @author Java Universe
 */
public class Human implements Feedable, Payable, Restable, Workable {
    private static final Logger LOGGER = AppLogger.get(Human.class);


    /** El humano come. */
    @Override
    public void food() {
        LOGGER.info("Human eating");
    }

    /** El humano cobra. */
    @Override
    public void salary() {
        LOGGER.info("Collecting salary");
    }

    /** El humano duerme. */
    @Override
    public void sleep() {
        LOGGER.info("Sleeping human");
    }

    /** El humano trabaja. */
    @Override
    public void work() {
        LOGGER.info("Human working");
    }

}
