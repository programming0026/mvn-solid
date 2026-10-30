package com.juniverse.solid.isp;

/**
 *
 * @author ajuar
 * 
 * 4. INTERFACE SEGREGATION PRINCIPLE (ISP)
 * Los clientes no deberían depender de interfaces que no usan.
 * 
 * Es mejor tener varias interfaces específicas que una interfaz general grande. 
 * Los clientes no deberían verse obligados a depender de métodos que no 
 * utilizan. Divide las interfaces grandes en otras más pequeñas y específicas.
 */
public class SegregationPrinciple {

    /** Un humano usa las cuatro capacidades; un robot solo trabaja. */
    public void principle() {
        System.out.println("4. INTERFACE SEGREGATION PRINCIPLE (ISP)");
        Human human = new Human();
        human.food();
        human.work();
        human.salary();
        human.sleep();

        Robot robot = new Robot();
        robot.work();
    }
}
