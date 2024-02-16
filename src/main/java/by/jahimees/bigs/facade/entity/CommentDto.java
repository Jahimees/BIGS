package by.jahimees.bigs.facade.entity;

import by.jahimees.bigs.entity.Account;
import by.jahimees.bigs.entity.Story;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CommentDto implements DtoEntity {

    private int idComment;
    private AccountDto account;
    private StoryDto story;
    private String text;

    public CommentDto(int idComment, Account account, Story story, String text) {
        this.idComment = idComment;
        this.account = new AccountDto(
                account.getIdAccount(),
                account.getUsername(),
                account.getName(),
                account.getRole()
        );
        this.story = new StoryDto(
                story.getIdStory(),
                story.getAccount(),
                story.getTitle(),
                story.getText(),
                story.getEnd()
        );
        this.text = text;
    }
}
