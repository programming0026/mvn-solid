package com.juniverse.solid.srp;


import java.util.logging.Logger;
import com.juniverse.solid.AppLogger;
/**
 *
 * @author Java Universe
 *
 * 1. SINGLE RESPONSIBILITY PRINCIPLE (SRP) 
 * Una clase debe tener una sola responsabilidad. 
 * 
 * Cada clase debe encargarse de una única responsabilidad o funcionalidad específica. Si
 * una clase hace demasiadas cosas, se vuelve difícil de mantener y cualquier
 * cambio puede afectar múltiples funcionalidades.
 */
public class SingleResponsibilityPrinciple {
    private static final Logger LOGGER = AppLogger.get(SingleResponsibilityPrinciple.class);


    private final EmailService emailService;
    private final UserValidatorService validatorService;
    private final UserRepository userRepository;

    /** Crea los tres servicios, cada uno con una única responsabilidad. */
    public SingleResponsibilityPrinciple() {
        this.emailService = new EmailService();
        this.validatorService = new UserValidatorService();
        this.userRepository = new UserRepository();
    }

    /**
     * Valida un usuario, lo guarda y le envía un correo.
     * @throws IllegalArgumentException si el usuario no es válido
     */
    public void principle() {
        LOGGER.info("1. SINGLE RESPONSIBILITY PRINCIPLE (SRP)");

        User user = new User("name", "name@mail.com");

        if (!validatorService.validate(user)) {
            throw new IllegalArgumentException("Invalid user");
        }
        userRepository.save(user);
        emailService.sendEmail(user);
    }
}
