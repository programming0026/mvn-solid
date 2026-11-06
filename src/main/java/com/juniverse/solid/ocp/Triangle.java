package com.juniverse.solid.ocp;

/**
 * Triángulo.
 *
 * @author Java Universe
 */
public class Triangle extends Figure {

    private final double base;
    private final double height;

    /**
     * Crea un triángulo.
     * @param base base
     * @param height altura
     */
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    /** Área: base · altura / 2. */
    @Override
    public double calculateArea() {
        return (base * height) / 2;
    }

    /** Representación en texto. */
    @Override
    public String toString() {
        return "Triangle{" + "base=" + base + ", height=" + height + '}';
    }

}
