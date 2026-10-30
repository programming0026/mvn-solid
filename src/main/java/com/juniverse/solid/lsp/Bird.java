package com.juniverse.solid.lsp;

/**
 * Ave: define solo lo que todas las aves comparten (moverse), así cualquier subclase puede sustituirla.
 *
 * @author ajuar
 */
public abstract class Bird {

    /** Se desplaza a su manera. */
    public abstract void move();
}
