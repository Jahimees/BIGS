package by.jahimees.bigs.facade.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class StoryComplaintReasonDto implements DtoEntity {

    private int idStoryComplaintReason;
    private String name;

    public StoryComplaintReasonDto(int idStoryComplaintReason, String name) {
        this.idStoryComplaintReason = idStoryComplaintReason;
        this.name = name;
    }
}
