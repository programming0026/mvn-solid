package com.juniverse.solid.isp;

/**
 * Un humano implementa las cuatro interfaces pequeñas.
 *
 * @author ajuar
 */
public class Human implements Feedable, Payable, Restable, Workable {

    /** El humano come. */
    @Override
    public void food() {
        System.out.println("Human eating");
    }

    /** El humano cobra. */
    @Override
    public void salary() {
        System.out.println("Collecting salary");
    }

    /** El humano duerme. */
    @Override
    public void sleep() {
        System.out.println("Sleeping human");
    }

    /** El humano trabaja. */
    @Override
    public void work() {
        System.out.println("Human working");
    }

}
