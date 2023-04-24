package ru.aston.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ru.aston.dto.request.NewCardCreationRequestDto;
import ru.aston.model.Card;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-02T18:04:06+0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 19.0.1 (Oracle Corporation)"
)
@Component
public class CardMapperImpl implements CardMapper {

    @Override
    public Card mapNewCardCreationDtoToCard(NewCardCreationRequestDto dto) {
        if ( dto == null ) {
            return null;
        }

        Card.CardBuilder card = Card.builder();

        card.clientUuid( dto.getClientUuid() );
        card.cardDuration( dto.getCardDuration() );

        return card.build();
    }
}
