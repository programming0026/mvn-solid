package com.juniverse.solid.srp;


import java.util.logging.Logger;
import com.juniverse.solid.AppLogger;
/**
 * Única responsabilidad: enviar correos.
 *
 * @author Java Universe
 */
public class EmailService {
    private static final Logger LOGGER = AppLogger.get(EmailService.class);


    /**
     * Envía un correo al usuario.
     * @param user destinatario
     */
    public void sendEmail(User user) {
        LOGGER.info("Sending email to: " + user.getEmail());
    }
}
