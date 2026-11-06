package com.juniverse.solid.ocp;

/**
 * Figura con área calculable. Se pueden añadir figuras nuevas sin modificar el código que las usa (OCP).
 *
 * @author Java Universe
 */

public abstract class Figure {

    /** Calcula el área de la figura. */
    public abstract double calculateArea();
}
