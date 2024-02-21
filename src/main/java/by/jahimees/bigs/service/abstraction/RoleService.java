package by.jahimees.bigs.service.abstraction;

import by.jahimees.bigs.facade.entity.RoleDto;

import java.util.List;
import java.util.Optional;

public interface RoleService {
    List<RoleDto> findAllDto();

    Optional<RoleDto> findDtoById(int id);
}
