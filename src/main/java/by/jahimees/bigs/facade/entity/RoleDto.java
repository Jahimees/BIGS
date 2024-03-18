package by.jahimees.bigs.facade.entity;

import by.jahimees.bigs.entity.Role;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RoleDto implements DtoEntity {

    private int idRole;
    private String name;

    public RoleDto(int idRole, String name) {
        this.idRole = idRole;
        this.name = name;
    }

    public RoleDto(Role role) {
        this.idRole = role.getIdRole();
        this.name = role.getName();
    }
}
