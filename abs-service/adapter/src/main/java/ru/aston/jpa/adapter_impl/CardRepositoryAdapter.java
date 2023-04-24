package ru.aston.jpa.adapter_impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import ru.aston.app.repositories.CardRepository;
import ru.aston.jpa.repositories.CardJpaRepository;
import ru.aston.model.Card;

import java.util.UUID;

@Repository
@RequiredArgsConstructor
public class CardRepositoryAdapter implements CardRepository {

    private final CardJpaRepository jpaRepository;

    @Override
    public Card save(Card card) {
        return jpaRepository.save(card);
    }

    @Override
    public boolean existByUuid(UUID uuid) {
        return jpaRepository.existsByUuid(uuid);
    }

}
