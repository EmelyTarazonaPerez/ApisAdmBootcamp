package projects.bootcamp.adapters.driving.http.mapper.technology;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;
import projects.bootcamp.adapters.driving.http.dto.response.technology.TechnologyResponse;
import projects.bootcamp.domain.model.Technology;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE
)
public interface ITechnologyResponseMapper {
    @Mappings(value = {
        @Mapping(source = "idTechnology", target = "id"),
        @Mapping(source = "name", target = "name"),
        @Mapping(source = "description", target = "description"),
    })
    TechnologyResponse toTechnologyResponse (Technology technology);

    List<TechnologyResponse> toListTechnologyResponse (List<Technology> technologies);
}
