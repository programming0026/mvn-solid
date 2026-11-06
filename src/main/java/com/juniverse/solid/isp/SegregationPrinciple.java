package com.juniverse.solid.isp;


import java.util.logging.Logger;
import com.juniverse.solid.AppLogger;
/**
 *
 * @author Java Universe
 * 
 * 4. INTERFACE SEGREGATION PRINCIPLE (ISP)
 * Los clientes no deberían depender de interfaces que no usan.
 * 
 * Es mejor tener varias interfaces específicas que una interfaz general grande. 
 * Los clientes no deberían verse obligados a depender de métodos que no 
 * utilizan. Divide las interfaces grandes en otras más pequeñas y específicas.
 */
public class SegregationPrinciple {
    private static final Logger LOGGER = AppLogger.get(SegregationPrinciple.class);


    /** Un humano usa las cuatro capacidades; un robot solo trabaja. */
    public void principle() {
        LOGGER.info("4. INTERFACE SEGREGATION PRINCIPLE (ISP)");
        Human human = new Human();
        human.food();
        human.work();
        human.salary();
        human.sleep();

        Robot robot = new Robot();
        robot.work();
    }
}
