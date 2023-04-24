package ru.aston.app.exception;

import java.io.Serial;
import java.util.UUID;

public class CardAlreadyRegisteredException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 45123L;
    public static final String MESSAGE = "Card with such number = (%s) has already been registered";

    public CardAlreadyRegisteredException(UUID uuid) {
        super(String.format(MESSAGE, uuid));
    }
}
