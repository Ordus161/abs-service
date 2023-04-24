package ru.aston.facade;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.aston.app.services.CardService;
import ru.aston.dto.request.NewCardCreationRequestDto;
import ru.aston.mapper.CardMapper;
import ru.aston.model.Card;

@Component
@RequiredArgsConstructor
public class CardFacade {
    private final CardService cardService;

    private final CardMapper cardMapper;

    public Card createNewCard(NewCardCreationRequestDto dto) {
        Card card = cardMapper.mapNewCardCreationDtoToCard(dto);
        return cardService.createNewCard(card);
    }
}
