package by.jahimees.bigs.entity;

import by.jahimees.bigs.util.RoleEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

import static by.jahimees.bigs.util.constant.DbConstant.*;

@Data
@Entity
@Table(name = ROLE)
public class Role implements GrantedAuthority, RawEntity {

    public Role() {
    }

    public Role(RoleEnum roleEnum) {
        this.name = roleEnum.name();
        this.idRole = roleEnum.getValue();
    }

    @Id
    @Column(name = ID_ROLE)
    private int idRole;

    @Column(name = NAME)
    private String name;

    @Override
    public String getAuthority() {
        return this.name;
    }
}
