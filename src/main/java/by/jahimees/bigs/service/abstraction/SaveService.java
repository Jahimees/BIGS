package by.jahimees.bigs.service.abstraction;

import by.jahimees.bigs.entity.RawEntity;
import by.jahimees.bigs.facade.entity.DtoEntity;

/**
 * Service provides possibility to save changes in the object in the database.
 * Also, this service can create new record in the database.
 *
 * @param <E> raw entity class
 * @param <D> dto class
 */
public interface SaveService<E extends RawEntity, D extends DtoEntity> {

    /**
     * Saves changes or creates a new entity in the database
     * @param entity raw entity object
     * @return created object in database
     */
    default E save(E entity) {
        throw new UnsupportedOperationException();
    }
}
