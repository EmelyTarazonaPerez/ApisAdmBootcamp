package projects.bootcamp.adapters.driving.http.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;
import projects.bootcamp.adapters.driving.http.dto.request.AddTechnologyRequest;
import projects.bootcamp.adapters.driving.http.dto.request.UpdateTechnologyRequest;
import projects.bootcamp.domain.model.Technology;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE
)
public interface ITechnologyRequestMapper {

    @Mappings( value = {
            @Mapping(target = "idTechnology", ignore = true),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "description", target = "description")
    })
    Technology addRequestToTechnology(AddTechnologyRequest addTechnologyRequest);
    List<Technology> addRequestToTechnologies(List<AddTechnologyRequest> listAddTechnologyRequest);

    @Mappings( value = {
            @Mapping(source = "id", target = "idTechnology"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "description", target = "description")
    })
    Technology updateRequestToTechnology(UpdateTechnologyRequest updateTechnologyRequest);
    List<Technology> updateRequestToTechnology(List<UpdateTechnologyRequest> updateTechnologyRequest);

}
