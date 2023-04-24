package ru.aston.app.repositories;

import ru.aston.model.Card;

import java.util.UUID;

/**
 * CardRepository Interface that is implemented by CardRepositoryAdapter
 */

public interface CardRepository {

    Card save(Card card);

    boolean existByUuid(UUID uuid);

}
