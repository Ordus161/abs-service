package ru.aston.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.UUID;


@Schema(description = "New Card creation DTO")
@Data
public class CardCreationResponseDto {

    @Schema(description = "New card number")
    @NotNull
    private String cardNumber;

    @Schema(description = "Card status")
    @NotNull
    private String cardStatus;
}