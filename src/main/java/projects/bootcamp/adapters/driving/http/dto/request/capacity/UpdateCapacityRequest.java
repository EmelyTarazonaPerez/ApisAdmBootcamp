package projects.bootcamp.adapters.driving.http.dto.request.capacity;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import projects.bootcamp.config.Constants;

@Data
@AllArgsConstructor
@Getter
public class UpdateCapacityRequest {
    @Valid
    private int idTechnology;

    @NotNull(message = Constants.EMPTY_FIELD_EXCEPTION_MESSAGE)
    @NotBlank(message = Constants.EMPTY_FIELD_EXCEPTION_MESSAGE)
    @Size(max = 50, message = Constants.LIMIT_STRING_NAME_TECHNOLOGY)
    private final String name;

    @NotNull(message = Constants.EMPTY_FIELD_EXCEPTION_MESSAGE)
    @NotBlank(message = Constants.EMPTY_FIELD_EXCEPTION_MESSAGE)
    @Size(max = 90, message = Constants.LIMIT_STRING_DESCRIPTION_TECHNOLOGY)
    private final String description;
}
