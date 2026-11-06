package com.juniverse.solid.ocp;

/**
 * Círculo.
 *
 * @author Java Universe
 */

public class Circle extends Figure {
    
    private final double radio;
    
    /**
     * Crea un círculo.
     * @param radio radio del círculo
     */
    public Circle(double radio) {
        this.radio = radio;
    }
    
    /** Área: π · r². */
    @Override
    public double calculateArea() {
        return Math.PI * radio * radio;
    }

    /** Representación en texto. */
    @Override
    public String toString() {
        return "Circle{" + "radio=" + radio + '}';
    }
    
}
