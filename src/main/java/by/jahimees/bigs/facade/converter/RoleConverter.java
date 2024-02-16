package by.jahimees.bigs.facade.converter;

import by.jahimees.bigs.entity.Role;
import by.jahimees.bigs.facade.converter.abstraction.Converter;
import by.jahimees.bigs.facade.entity.RoleDto;

public class RoleConverter implements Converter<Role, RoleDto> {

    @Override
    public RoleDto convertToDto(Role entity) {
        return null;
    }

    @Override
    public Role convertToEntity(RoleDto dto) {
        return null;
    }
}
