package by.jahimees.bigs.facade.entity;

import by.jahimees.bigs.entity.Lobby;
import by.jahimees.bigs.entity.LobbyMember;
import by.jahimees.bigs.entity.Story;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LobbyStoryDto implements DtoEntity {

    private int idLobbyStory;
    private LobbyMemberDto lobbyMember;
    private StoryDto lobbyStory;
    private LobbyDto lobby;
    private boolean checked;
    private int voteCount;

    public LobbyStoryDto(int idLobbyStory, LobbyMember lobbyMember, Story lobbyStory, Lobby lobby,
                         boolean checked, int voteCount) {
        this.idLobbyStory = idLobbyStory;
        this.checked = checked;
        this.voteCount = voteCount;

        this.lobbyMember = new LobbyMemberDto(
                lobbyMember.getIdLobbyMember(),
                lobbyMember.getLobby(),
                lobbyMember.getAccount()
        );
        this.lobbyStory = new StoryDto(
                lobbyStory.getIdStory(),
                lobbyStory.getAccount(),
                lobbyStory.getTitle(),
                lobbyStory.getText(),
                lobbyStory.getEnd()
        );
        this.lobby = new LobbyDto(
                lobby.getIdLobby(),
                lobby.getAccount(),
                lobby.getName(),
                lobby.getCode(),
                lobby.getStoryCount(),
                lobby.getPlayerCount()
        );
    }
}
