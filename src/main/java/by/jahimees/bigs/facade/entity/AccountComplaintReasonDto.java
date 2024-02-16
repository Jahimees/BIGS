package by.jahimees.bigs.facade.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AccountComplaintReasonDto implements DtoEntity {

    private int idAccountComplaintReason;
    private String name;

    public AccountComplaintReasonDto(int idAccountComplaintReason, String name) {
        this.idAccountComplaintReason = idAccountComplaintReason;
        this.name = name;
    }
}
