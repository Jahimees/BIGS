package by.jahimees.bigs.facade.entity;

import by.jahimees.bigs.entity.Account;
import by.jahimees.bigs.entity.AccountComplaintReason;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AccountComplaintDto implements DtoEntity {

    private int idAccountComplaint;
    private AccountDto accountComplainer;
    private AccountDto accountAccused;
    private String text;
    private AccountComplaintReasonDto accountComplaintReason;
    private boolean checked;
    private AccountDto accountChecker;
    private String conclusion;

    public AccountComplaintDto(int idAccountComplaint, Account accountComplainer,
                               Account accountAccused, String text,
                               AccountComplaintReason accountComplaintReason,
                               boolean checked, Account accountChecker, String conclusion) {

        this.idAccountComplaint = idAccountComplaint;
        this.text = text;
        this.checked = checked;
        this.conclusion = conclusion;
        this.accountComplainer = new AccountDto(
                accountComplainer.getIdAccount(),
                accountComplainer.getUsername(),
                accountComplainer.getName(),
                accountComplainer.getRole()
        );
        this.accountAccused = new AccountDto(
                accountAccused.getIdAccount(),
                accountAccused.getUsername(),
                accountAccused.getName(),
                accountAccused.getRole()
        );
        this.accountChecker = new AccountDto(
                accountChecker.getIdAccount(),
                accountChecker.getUsername(),
                accountChecker.getName(),
                accountChecker.getRole()
        );
        this.accountComplaintReason = new AccountComplaintReasonDto(
                accountComplaintReason.getIdAccountComplaintReason(),
                accountComplaintReason.getName()
        );
    }
}
