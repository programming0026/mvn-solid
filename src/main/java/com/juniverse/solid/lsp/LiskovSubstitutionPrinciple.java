package com.juniverse.solid.lsp;

/**
 *
 * @author ajuar
 * 
 * 3. LISKOV SUBSTITUTION PRINCIPLE (LSP)
 * Los objetos de las subclases deben poder reemplazar a los objetos de la 
 * clase padre sin romper la funcionalidad.
 * 
 * Los objetos de una clase derivada deben poder reemplazar objetos de la clase 
 * base sin alterar el correcto funcionamiento del programa. Las clases hijas 
 * no deben romper el comportamiento esperado de la clase padre.
 */
public class LiskovSubstitutionPrinciple {

    /** Trata a una paloma y a un pingüino como {@code Bird} sin que el programa se rompa. */
    public void principle() {
        System.out.println("3. LISKOV SUBSTITUTION PRINCIPLE (LSP)");
        Bird pigeon = new Pigeon();
        Bird penguin = new Penguin();
        pigeon.move();
        penguin.move();
    }
}
