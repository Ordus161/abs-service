package ru.aston.mapper;

import org.mapstruct.Mapper;
import ru.aston.dto.request.NewCardCreationRequestDto;
import ru.aston.model.Card;

@Mapper(componentModel = "spring")
public interface CardMapper {

    Card mapNewCardCreationDtoToCard(NewCardCreationRequestDto dto);

}
