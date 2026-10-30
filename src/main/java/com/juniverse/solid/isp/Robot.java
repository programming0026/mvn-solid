package com.juniverse.solid.isp;

/**
 * Un robot solo trabaja: implementa únicamente {@link Workable}.
 *
 * @author ajuar
 */
public class Robot implements Workable {

    /** El robot trabaja. */
    @Override
    public void work() {
        System.out.println("Robot working");
    }

}
