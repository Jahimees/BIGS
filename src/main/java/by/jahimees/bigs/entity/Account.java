package by.jahimees.bigs.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

import static by.jahimees.bigs.util.constant.DbConstant.*;

@Entity
@Data
@Table(name = ACCOUNT)
public class Account implements RawEntity, UserDetails {

    @Id
    @Column(name = ID_ACCOUNT)
    private int idAccount;

    @Column(name = USERNAME)
    private String username;

    @Column(name = PASSWORD)
    private String password;

    @Column(name = NAME)
    private String name;

    @ManyToOne
    @JoinColumn(name = ID_ROLE)
    private Role role;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(role);
    }

    //TODO AccountStatus must be here
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    //TODO AccountStatus must be here
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    //TODO AccountStatus must be here
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
