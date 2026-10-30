package com.juniverse.solid.lsp;

/**
 * Pingüino: se mueve nadando (no vuela, por eso {@code Bird} no declara {@code fly()}).
 *
 * @author ajuar
 */
public class Penguin extends Bird {

    /** Nada. */
    @Override
    public void move() {
        swim();
    }

    /** Imprime que el pingüino nada. */
    private void swim() {
        System.out.println("The penguin is swimming");
    }
}
