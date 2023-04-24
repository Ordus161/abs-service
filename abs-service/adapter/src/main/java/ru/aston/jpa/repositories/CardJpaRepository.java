package ru.aston.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.aston.model.Card;

import java.util.UUID;

@Repository
public interface CardJpaRepository extends JpaRepository<Card, Long> {

    boolean existsByUuid(UUID uuid);
}
