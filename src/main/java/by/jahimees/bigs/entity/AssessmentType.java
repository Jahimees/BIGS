package by.jahimees.bigs.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import static by.jahimees.bigs.util.constant.DbConstant.*;

@Data
@Entity
@Table(name = ASSESSMENT_TYPE)
public class AssessmentType implements RawEntity {

    @Id
    @Column(name = ID_ASSESSMENT_TYPE)
    private int idAssessmentType;

    @Column(name = NAME)
    private String name;
}
