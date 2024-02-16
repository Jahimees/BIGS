package by.jahimees.bigs.facade.entity;

import by.jahimees.bigs.entity.Account;
import by.jahimees.bigs.entity.Lobby;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LobbyMemberDto implements DtoEntity {

    private int idLobbyMember;
    private LobbyDto lobby;
    private AccountDto account;

    public LobbyMemberDto(int idLobbyMember, Lobby lobby, Account account) {
        this.idLobbyMember = idLobbyMember;
        this.lobby = new LobbyDto(
                lobby.getIdLobby(),
                lobby.getAccount(),
                lobby.getName(),
                lobby.getCode(),
                lobby.getStoryCount(),
                lobby.getPlayerCount()
        );
        this.account = new AccountDto(
                account.getIdAccount(),
                account.getUsername(),
                account.getName(),
                account.getRole()
        );
    }
}
