package by.jahimees.bigs.entity;

import jakarta.persistence.*;
import lombok.Data;

import static by.jahimees.bigs.util.constant.DbConstant.*;

@Entity
@Data
@Table(name = ACCOUNT)
public class Account implements RawEntity {

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

}
