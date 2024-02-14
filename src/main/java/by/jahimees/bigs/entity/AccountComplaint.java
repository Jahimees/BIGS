package by.jahimees.bigs.entity;

import jakarta.persistence.*;
import lombok.Data;

import static by.jahimees.bigs.util.constant.DbConstant.*;

@Data
@Entity
@Table(name = ACCOUNT_COMPLAINT)
public class AccountComplaint implements RawEntity {

    @Id
    @Column(name = ID_ACCOUNT_COMPLAINT)
    private int idAccountComplaint;

    @ManyToOne
    @JoinColumn(name = ID_ACCOUNT_COMPLAINER)
    private Account accountComplainer;

    @ManyToOne
    @JoinColumn(name = ID_ACCOUNT_ACCUSED)
    private Account accountAccused;

    @Column(name = TEXT)
    private String text;

    @ManyToOne
    @JoinColumn(name = ID_ACCOUNT_COMPLAINT_REASON)
    private AccountComplaintReason accountComplaintReason;

    @Column(name = CHECKED)
    private boolean checked;

    @ManyToOne
    @JoinColumn(name = ID_ACCOUNT_CHECKER)
    private Account accountChecker;

    @Column(name = CONCLUSION)
    private String conclusion;
}
