package com.juniverse.solid.srp;

import java.util.regex.Pattern;

/**
 * Única responsabilidad: validar usuarios.
 *
 * @author ajuar
 */
public class UserValidatorService {

    /** Forma básica de un correo: algo@dominio.ext, sin espacios. */
    private static final Pattern EMAIL = Pattern.compile("^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$");

    /**
     * Comprueba que el nombre no esté vacío y que el correo tenga un formato válido.
     * @param user usuario a validar
     * @return {@code true} si es válido
     */
    public boolean validate(User user) {
        return user != null
                && user.getName() != null && !user.getName().isBlank()
                && user.getEmail() != null && EMAIL.matcher(user.getEmail()).matches();
    }
}
