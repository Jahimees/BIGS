package by.jahimees.bigs.service.abstraction;

import by.jahimees.bigs.entity.RawEntity;
import by.jahimees.bigs.facade.entity.DtoEntity;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

/**
 * Service provides possibility to find information in the database (readonly operation).
 * This service supports possibility to find objects with pagination
 *
 * @param <E> raw entity class
 * @param <D> dto class
 */
public interface SearchService<E extends RawEntity, D extends DtoEntity> {

    default List<D> findAllDto() {
        throw new UnsupportedOperationException();
    }

    default List<D> findAllDto(Pageable pageable) {
        throw new UnsupportedOperationException();
    }

    default Optional<D> findDtoById(int id) {
        throw new UnsupportedOperationException();
    }

    default Optional<E> findById(int id) {
        throw new UnsupportedOperationException();
    }
}
