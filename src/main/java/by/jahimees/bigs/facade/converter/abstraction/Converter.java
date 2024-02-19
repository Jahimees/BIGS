package by.jahimees.bigs.facade.converter.abstraction;

import by.jahimees.bigs.entity.RawEntity;
import by.jahimees.bigs.facade.entity.DtoEntity;

/**
 * Interface designed for converters from Entity to Dto and against from Dto to Entity.
 * There are only two methods (for different convert directories), but you can create new methods, which
 * converts objects for concrete endpoint.
 *
 * @param <E> raw entity param. JPA object.
 * @param <D> data transfer object. Doesn't have a link with database
 */
public interface Converter<E extends RawEntity, D extends DtoEntity> {

    /**
     * Converts entity to Dto.
     * Entity object must not be mutated.
     * So use deep clone and other converters (like chain) to create unique object
     * with no other links to nested objects.
     *
     * @param entity raw entity
     * @return dto
     */
    D convertToDto(E entity);

    /**
     * Converts Dto to Entity.
     * Dto object must not be mutated.
     * So use deep clone and other converters to create unique object
     * with no other links to nested objects.
     * <p>
     * New object not linked with database
     *
     * @param dto data transfer object
     * @return entity
     */
    E convertToEntity(D dto);
}
