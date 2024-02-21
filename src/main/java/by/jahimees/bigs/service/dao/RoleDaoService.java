package by.jahimees.bigs.service.dao;

import by.jahimees.bigs.facade.entity.RoleDto;
import by.jahimees.bigs.repository.RoleRepository;
import by.jahimees.bigs.service.abstraction.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RoleDaoService implements RoleService {

    private final RoleRepository roleRepository;

    @Override
    public List<RoleDto> findAllDto() {
        return roleRepository.findAllDtoBy();
    }

    @Override
    public Optional<RoleDto> findDtoById(int id) {
        return roleRepository.findDtoByIdRole(id);
    }
}
