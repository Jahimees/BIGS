package by.jahimees.bigs.facade.entity;

import by.jahimees.bigs.entity.Account;
import by.jahimees.bigs.entity.Story;
import by.jahimees.bigs.entity.StoryComplaintReason;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class StoryComplaintDto implements DtoEntity {

    private int idStoryComplaint;
    private AccountDto accountComplainer;
    private StoryDto storyAccused;
    private String text;
    private StoryComplaintReasonDto storyComplaintReason;
    private boolean checked;
    private AccountDto accountChecker;
    private String conclusion;

    public StoryComplaintDto(int idStoryComplaint, Account accountComplainer, Story storyAccused,
                             String text, StoryComplaintReason storyComplaintReason,
                             boolean checked, Account accountChecker, String conclusion) {

        this.idStoryComplaint = idStoryComplaint;
        this.text = text;
        this.checked = checked;
        this.conclusion = conclusion;
        this.accountComplainer = new AccountDto(
                accountComplainer.getIdAccount(),
                accountComplainer.getUsername(),
                accountComplainer.getName(),
                accountComplainer.getRole()
        );
        this.storyAccused = new StoryDto(
                storyAccused.getIdStory(),
                storyAccused.getAccount(),
                storyAccused.getTitle(),
                storyAccused.getText(),
                storyAccused.getEnd()
        );
        this.storyComplaintReason = new StoryComplaintReasonDto(
                storyComplaintReason.getIdStoryComplaintReason(),
                storyComplaintReason.getName()
        );
        this.accountChecker = new AccountDto(
                accountChecker.getIdAccount(),
                accountChecker.getUsername(),
                accountChecker.getName(),
                accountChecker.getRole()
        );
    }
}
