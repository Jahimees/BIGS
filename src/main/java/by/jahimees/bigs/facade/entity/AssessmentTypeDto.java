package by.jahimees.bigs.facade.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AssessmentTypeDto implements DtoEntity {

    private int idAssessmentType;
    private String name;

    public AssessmentTypeDto(int idAssessmentType, String name) {
        this.idAssessmentType = idAssessmentType;
        this.name = name;
    }
}
