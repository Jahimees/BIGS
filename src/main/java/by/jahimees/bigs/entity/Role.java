package by.jahimees.bigs.entity;

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
