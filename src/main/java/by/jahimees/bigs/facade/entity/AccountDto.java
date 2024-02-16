package by.jahimees.bigs.facade.entity;

import by.jahimees.bigs.entity.Role;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AccountDto implements DtoEntity {

    private int idAccount;
    private String username;
    private String name;
    private RoleDto role;

    public AccountDto(int idAccount, String username, String name, Role role) {
        this.idAccount = idAccount;
        this.username = username;
        this.name = name;
        this.role = new RoleDto(role.getIdRole(), role.getName());
    }
}
