package com.juniverse.solid.dip;

/**
 * Envío de correo por Gmail (simulado).
 *
 * @author ajuar
 */
public class EmailGmail implements Email {

    /**
     * Envía el mensaje por Gmail.
     * @param message texto del mensaje
     */
    @Override
    public void send(String message) {
        System.out.println("Sending via Gmail: " + message);
    }

}
