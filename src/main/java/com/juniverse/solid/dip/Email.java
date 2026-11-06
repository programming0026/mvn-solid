package com.juniverse.solid.dip;

/**
 * Abstracción de un canal de correo (DIP: el código de alto nivel depende de esta interfaz).
 *
 * @author Java Universe
 */
public interface Email {

    /**
     * Envía un mensaje.
     * @param message texto del mensaje
     */
    void send(String message);
}
