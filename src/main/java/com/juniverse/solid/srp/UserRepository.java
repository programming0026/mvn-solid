package com.juniverse.solid.srp;

/**
 * Única responsabilidad: guardar usuarios.
 *
 * @author ajuar
 */
public class UserRepository {

    /**
     * Guarda al usuario (simulado con un mensaje en consola).
     * @param user usuario a guardar
     */
    public void save(User user) {
        System.out.println("Saving user: " + user.getName());
    }
}
