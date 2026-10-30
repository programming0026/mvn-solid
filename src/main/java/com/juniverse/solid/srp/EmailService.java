package com.juniverse.solid.srp;

/**
 * Única responsabilidad: enviar correos.
 *
 * @author ajuar
 */
public class EmailService {

    /**
     * Envía un correo al usuario.
     * @param user destinatario
     */
    public void sendEmail(User user) {
        System.out.println("Sending email to: " + user.getEmail());
    }
}
