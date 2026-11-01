package com.juniverse.solid.dip;


import java.util.logging.Logger;
import com.juniverse.solid.AppLogger;
/**
 * Envío de correo por Outlook (simulado).
 *
 * @author ajuar
 */
public class EmailOutlook implements Email {
    private static final Logger LOGGER = AppLogger.get(EmailOutlook.class);


    /**
     * Envía el mensaje por Outlook.
     * @param message texto del mensaje
     */
    @Override
    public void send(String message) {
        LOGGER.info("Sending via Outlook: " + message);
    }

}
