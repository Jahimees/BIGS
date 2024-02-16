package by.jahimees.bigs.facade.entity;

import by.jahimees.bigs.entity.Account;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
public class AccountStatusDto implements DtoEntity {

    private int idStatus;
    private AccountDto account;
    private String reason;
    private Timestamp expiresAt;

    public AccountStatusDto(int idStatus, Account account, String reason, Timestamp expiresAt) {
        this.idStatus = idStatus;
        this.account = new AccountDto(
                account.getIdAccount(),
                account.getUsername(),
                account.getName(),
                account.getRole());
        this.expiresAt = (Timestamp) expiresAt.clone();
    }
}
