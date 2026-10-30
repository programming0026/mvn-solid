package com.juniverse.solid.dip;

/**
 * Notifica usando cualquier {@link Email}; la dependencia se inyecta por el constructor.
 *
 * @author ajuar
 */
public class Notificator {

    private final Email email;

    /**
     * Recibe el canal de correo (inyección de dependencias).
     * @param email canal por el que se enviará
     */
    public Notificator(Email email) {
        this.email = email; // Inyección de dependencia
    }

    /**
     * Envía la notificación por el canal inyectado.
     * @param message texto del mensaje
     */
    public void notify(String message) {
        email.send(message);
    }
}
