package by.jahimees.bigs.facade.converter;

import by.jahimees.bigs.entity.Status;
import by.jahimees.bigs.facade.converter.abstraction.Converter;
import by.jahimees.bigs.facade.entity.StatusDto;

public class StatusConverter implements Converter<Status, StatusDto> {

    @Override
    public StatusDto convertToDto(Status entity) {
        return null;
    }

    @Override
    public Status convertToEntity(StatusDto dto) {
        return null;
    }
}
