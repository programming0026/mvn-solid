package com.juniverse.solid.ocp;

import java.util.ArrayList;
import java.util.List;

import java.util.logging.Logger;
import com.juniverse.solid.AppLogger;
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
    private static final Logger LOGGER = AppLogger.get(OpenClosedPrinciple.class);

    
    /**
     * Suma las áreas de cualquier lista de figuras y las imprime; no cambia al añadir figuras nuevas.
     * @param figures figuras a sumar
     * @return área total
     */
    private double calculateTotalArea(List<Figure> figures) {
        double total = 0;
        for (Figure figure : figures) {
            total += figure.calculateArea();
            LOGGER.info(String.valueOf(figure));
        }
        return total;
    }
    
    /** Calcula el área total de un círculo, un rectángulo y un triángulo. */
    public void principle() {
        LOGGER.info("2. OPEN/CLOSED PRINCIPLE (OCP)");
        List<Figure> figures = new ArrayList<>();
        figures.add(new Circle(22));
        figures.add(new Rectangle(100, 200));
        figures.add(new Triangle(11, 22));
        double total = calculateTotalArea(figures);
        LOGGER.info(String.format("Total: %.2f", total));
    }
}
