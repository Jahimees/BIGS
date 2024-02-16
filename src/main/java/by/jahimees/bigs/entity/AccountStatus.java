package by.jahimees.bigs.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

import static by.jahimees.bigs.util.constant.DbConstant.*;

@Data
@Entity
@Table(name = ACCOUNT_STATUS)
public class AccountStatus implements RawEntity {

    @Id
    @Column(name = ID_STATUS)
    private int idStatus;

    @OneToOne
    @JoinColumn(name = ID_ACCOUNT)
    private Account account;

    @Column(name = REASON)
    private String reason;

    @Column(name = EXPIRES_AT)
    private Timestamp expiresAt;
}
