package com.juniverse.solid.dip;

/**
 *
 * @author ajuar
 * 
 * 5. DEPENDENCY INVERSION PRINCIPLE (DIP)
 * Depender de abstracciones, no de implementaciones concretas.
 * 
 * Los módulos de alto nivel no deben depender de módulos de bajo nivel; 
 * ambos deben depender de abstracciones (interfaces). Las abstracciones 
 * no deben depender de detalles; los detalles deben depender de abstracciones. 
 * Esto facilita el cambio de implementaciones sin afectar el código que las usa.
 * 
 */
public class DependencyInversionPrinciple {

    /** Notifica por Gmail y por Outlook con la misma clase {@code Notificator}. */
    public void principle() {
        System.out.println("5. DEPENDENCY INVERSION PRINCIPLE (DIP)");
        Email gmail = new EmailGmail();
        Notificator notificatorGmail = new Notificator(gmail);
        notificatorGmail.notify("Hi from Gmail!");

        Email outlook = new EmailOutlook();
        Notificator notificatorOutlook = new Notificator(outlook);
        notificatorOutlook.notify("Hi from Outlook!");
    }
}
