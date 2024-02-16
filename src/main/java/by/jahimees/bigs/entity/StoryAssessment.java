package by.jahimees.bigs.entity;

import jakarta.persistence.*;
import lombok.Data;

import static by.jahimees.bigs.util.constant.DbConstant.*;

@Data
@Entity
@Table(name = STORY_ASSESSMENT)
public class StoryAssessment implements RawEntity {

    @Id
    @Column(name = ID_STORY_ASSESSMENT)
    private int idStoryAssessment;

    @ManyToOne
    @JoinColumn(name = ID_STORY)
    private Story story;

    @ManyToOne
    @JoinColumn(name = ID_ACCOUNT)
    private Account account;

    @ManyToOne
    @JoinColumn(name = ID_ASSESSMENT_TYPE)
    private AssessmentType assessmentType;
}
