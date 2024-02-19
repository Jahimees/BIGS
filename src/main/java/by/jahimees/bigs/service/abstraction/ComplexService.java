package by.jahimees.bigs.service.abstraction;

import by.jahimees.bigs.entity.RawEntity;
import by.jahimees.bigs.facade.entity.DtoEntity;

/**
 * Service which combines all the service types into one interface for better usability
 *
 * @param <E> raw entity class
 * @param <D> dto class
 */
public interface ComplexService<E extends RawEntity, D extends DtoEntity>
        extends DeleteService<E, D>, SaveService<E, D>, SearchService<E, D> {
}
