package ru.aston.app.service_impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.aston.app.exception.CardAlreadyRegisteredException;
import ru.aston.app.repositories.CardRepository;
import ru.aston.app.services.CardService;
import ru.aston.app.services.GeneratorService;
import ru.aston.model.Card;

import java.time.LocalDate;
import java.util.UUID;

import static ru.aston.model.util.CardStatusEnum.ACTIVE;

@Service
@RequiredArgsConstructor
@Slf4j
public class CardServiceImpl implements CardService {

    private final CardRepository cardRepository;
    private final GeneratorService generator;


    /**
     * Saving the new card.
     *
     * @param card - new card data
     * @throws CardAlreadyRegisteredException - if card uuid is already taken.
     */
    @Transactional
    @Override
    public Card createNewCard(Card card) {
        UUID uuid = (UUID.randomUUID());
        if (cardRepository.existByUuid(uuid)) {
            throw new CardAlreadyRegisteredException(uuid);
        }
        card.setUuid(uuid);
        card.setAccountNumber(generator.generateNumber(30));
        card.setTransactionLimit(generator.getLimits().doubleValue());
        card.setExpirationDate(LocalDate.now().plusYears(card.getCardDuration()));
        card.setHolderName("HOLDER_NAME");
        card.setCardNumber(generator.generateNumber(16));
        card.setStatus(ACTIVE.toString());
        log.info("Activity status {} has been successfully " +
                "set for new deposit card {}", card.getStatus(), card.getCardNumber());
        return cardRepository.save(card);
    }
}
