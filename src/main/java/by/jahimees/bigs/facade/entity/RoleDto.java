package by.jahimees.bigs.facade.entity;

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
}
