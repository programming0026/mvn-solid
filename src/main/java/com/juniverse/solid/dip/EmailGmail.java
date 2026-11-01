package com.juniverse.solid.dip;


import java.util.logging.Logger;
import com.juniverse.solid.AppLogger;
/**
 * Envío de correo por Gmail (simulado).
 *
 * @author ajuar
 */
public class EmailGmail implements Email {
    private static final Logger LOGGER = AppLogger.get(EmailGmail.class);


    /**
     * Envía el mensaje por Gmail.
     * @param message texto del mensaje
     */
    @Override
    public void send(String message) {
        LOGGER.info("Sending via Gmail: " + message);
    }

}
