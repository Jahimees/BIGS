package by.jahimees.bigs.facade.entity;

import by.jahimees.bigs.entity.Account;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LobbyDto implements DtoEntity {

    private int idLobby;
    private AccountDto account;
    private String name;
    private String code;
    private int storyCount;
    private int playerCount;

    public LobbyDto(int idLobby, Account account, String name, String code, int storyCount, int playerCount) {
        this.idLobby = idLobby;
        this.name = name;
        this.code = code;
        this.storyCount = storyCount;
        this.playerCount = playerCount;
        this.account = new AccountDto(
                account.getIdAccount(),
                account.getUsername(),
                account.getName(),
                account.getRole()
        );
    }
}
