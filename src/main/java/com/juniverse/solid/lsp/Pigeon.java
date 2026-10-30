package com.juniverse.solid.lsp;

/**
 * Paloma: se mueve volando.
 *
 * @author ajuar
 */
public class Pigeon extends Bird {

    /** Vuela. */
    @Override
    public void move() {
        fly();
    }

    /** Imprime que la paloma vuela. */
    private void fly() {
        System.out.println("The pigeon is flying");
    }
}
