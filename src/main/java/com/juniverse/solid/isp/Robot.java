package com.juniverse.solid.isp;


import java.util.logging.Logger;
import com.juniverse.solid.AppLogger;
/**
 * Un robot solo trabaja: implementa únicamente {@link Workable}.
 *
 * @author Java Universe
 */
public class Robot implements Workable {
    private static final Logger LOGGER = AppLogger.get(Robot.class);


    /** El robot trabaja. */
    @Override
    public void work() {
        LOGGER.info("Robot working");
    }

}
