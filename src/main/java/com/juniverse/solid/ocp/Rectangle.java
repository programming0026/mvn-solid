package com.juniverse.solid.ocp;

/**
 * Rectángulo.
 *
 * @author ajuar
 */
public class Rectangle extends Figure {

    private final double width;
    private final double high;

    /**
     * Crea un rectángulo.
     * @param width ancho
     * @param high alto
     */
    public Rectangle(double width, double high) {
        this.width = width;
        this.high = high;
    }

    /** Área: ancho · alto. */
    @Override
    public double calculateArea() {
        return width * high;
    }

    /** Representación en texto. */
    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", high=" + high + '}';
    }

}
