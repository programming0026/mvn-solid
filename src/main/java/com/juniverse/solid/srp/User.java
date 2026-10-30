package com.juniverse.solid.srp;

/**
 * Datos de un usuario.
 *
 * @author ajuar
 */
public class User {

    private final String name;
    private final String email;

    // Constructor y getters/setters
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    /** Nombre del usuario. */
    public String getName() {
        return name;
    }

    /** Correo electrónico del usuario. */
    public String getEmail() {
        return email;
    }
}
