package by.jahimees.bigs.facade.entity;

import by.jahimees.bigs.entity.Account;
import by.jahimees.bigs.entity.Story;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FavoriteDto implements DtoEntity {

    private int idFavorite;
    private AccountDto account;
    private StoryDto story;

    public FavoriteDto(int idFavorite, Account account, Story story) {
        this.idFavorite = idFavorite;
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
    }
}
