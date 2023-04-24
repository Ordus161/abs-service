package ru.aston.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

@Schema(description = "New Card creation DTO")
@Data
public class NewCardCreationRequestDto {

    @Schema(description = "Client UUID")
    @NotNull
    private UUID clientUuid;

    @NotNull
    private Integer cardDuration;

}
