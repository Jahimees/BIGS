package by.jahimees.bigs.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import static by.jahimees.bigs.util.constant.DbConstant.*;

@Data
@Entity
@Table(name = ACCOUNT_COMPLAINT_REASON)
public class AccountComplaintReason {

    @Id
    @Column(name = ID_ACCOUNT_COMPLAINT_REASON)
    private int idAccountComplaintReason;

    @Column(name = NAME)
    private String name;
}
