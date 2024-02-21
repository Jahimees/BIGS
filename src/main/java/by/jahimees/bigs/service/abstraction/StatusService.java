package by.jahimees.bigs.service.abstraction;

import by.jahimees.bigs.facade.entity.RoleDto;
import by.jahimees.bigs.facade.entity.StatusDto;

import java.util.List;
import java.util.Optional;

public interface StatusService {

    Optional<StatusDto> findDtoById(int id);

    List<StatusDto> findAll();
}
