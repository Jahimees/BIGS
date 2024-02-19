package by.jahimees.bigs.facade.entity;

/**
 * Interface which indicates that class which implements it has a data transfer objects.
 * These objects used for safe work with entities, because {@link by.jahimees.bigs.entity.RawEntity} is using with
 * objects which linked with database directly
 * <p>
 * New DTO MUST implement this interface because services receive generic, which implements it.
 */
public interface DtoEntity {
}
