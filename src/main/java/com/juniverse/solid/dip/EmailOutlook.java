package com.juniverse.solid.dip;

/**
 * Envío de correo por Outlook (simulado).
 *
 * @author ajuar
 */
public class EmailOutlook implements Email {

    /**
     * Envía el mensaje por Outlook.
     * @param message texto del mensaje
     */
    @Override
    public void send(String message) {
        System.out.println("Sending via Outlook: " + message);
    }

}
