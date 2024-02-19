package by.jahimees.bigs.service.abstraction;

import by.jahimees.bigs.entity.RawEntity;
import by.jahimees.bigs.facade.entity.DtoEntity;

/**
 * Service which provides possibility to delete objects from database
 *
 * @param <E> raw entity type
 * @param <D> dto type
 */
public interface DeleteService<E extends RawEntity, D extends DtoEntity> {

    /**
     * Deletes an object from database by id
     *
     * @param id id of the object being deleted
     */
    default void deleteById(int id) {
        throw new UnsupportedOperationException();
    }
}
