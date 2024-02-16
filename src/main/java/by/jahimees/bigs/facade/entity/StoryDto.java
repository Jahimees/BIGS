package by.jahimees.bigs.facade.entity;

import by.jahimees.bigs.entity.Account;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class StoryDto implements DtoEntity {

    private int idStory;
    private AccountDto account;
    private String title;
    private String text;
    private String end;

    public StoryDto(int idStory, Account account, String title,
                    String text, String end) {
        this.idStory = idStory;
        this.account = new AccountDto(
                account.getIdAccount(),
                account.getUsername(),
                account.getName(),
                account.getRole());
        this.title = title;
        this.text = text;
        this.end = end;
    }
}
