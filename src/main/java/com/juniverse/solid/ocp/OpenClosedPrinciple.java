package com.juniverse.solid.ocp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ajuar
 * 
 * 2. OPEN/CLOSED PRINCIPLE (OCP)
 * Abierto para extensión, cerrado para modificación.
 * 
 * Las clases deben estar abiertas para extensión pero cerradas para modificación. 
 * Debes poder agregar nuevas funcionalidades sin modificar el código 
 * existente que ya funciona. Esto se logra mediante herencia, interfaces y polimorfismo.
 */
public class OpenClosedPrinciple {
    
    /**
     * Suma las áreas de cualquier lista de figuras y las imprime; no cambia al añadir figuras nuevas.
     * @param figures figuras a sumar
     * @return área total
     */
    private double calculateTotalArea(List<Figure> figures) {
        double total = 0;
        for (Figure figure : figures) {
            total += figure.calculateArea();
            System.out.println(figure);
        }
        return total;
    }
    
    /** Calcula el área total de un círculo, un rectángulo y un triángulo. */
    public void principle() {
        System.out.println("2. OPEN/CLOSED PRINCIPLE (OCP)");
        List<Figure> figures = new ArrayList<>();
        figures.add(new Circle(22));
        figures.add(new Rectangle(100, 200));
        figures.add(new Triangle(11, 22));
        double total = calculateTotalArea(figures);
        System.out.printf("Total: %.2f%n", total);
    }
}
