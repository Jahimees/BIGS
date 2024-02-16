package by.jahimees.bigs.facade.converter.abstraction;

import by.jahimees.bigs.entity.RawEntity;
import by.jahimees.bigs.facade.entity.DtoEntity;

public interface Converter<E extends RawEntity, D extends DtoEntity> {

    D convertToDto(E entity);
    E convertToEntity(D dto);
}
