package by.jahimees.bigs.facade.entity;

import by.jahimees.bigs.entity.Account;
import by.jahimees.bigs.entity.AssessmentType;
import by.jahimees.bigs.entity.Story;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class StoryAssessmentDto implements DtoEntity {

    private int idStoryAssessment;
    private StoryDto story;
    private AccountDto account;
    private AssessmentTypeDto assessmentType;

    public StoryAssessmentDto(int idStoryAssessment, Story story, Account account, AssessmentType assessmentType) {
        this.idStoryAssessment = idStoryAssessment;
        this.story = new StoryDto(
                story.getIdStory(),
                story.getAccount(),
                story.getTitle(),
                story.getText(),
                story.getEnd()
        );
        this.account = new AccountDto(
                account.getIdAccount(),
                account.getUsername(),
                account.getName(),
                account.getRole()
        );
        this.assessmentType = new AssessmentTypeDto(
                assessmentType.getIdAssessmentType(),
                assessmentType.getName()
        );
    }
}
