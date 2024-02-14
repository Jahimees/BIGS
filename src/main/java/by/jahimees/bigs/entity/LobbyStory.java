package by.jahimees.bigs.entity;

import jakarta.persistence.*;
import lombok.Data;

import static by.jahimees.bigs.util.constant.DbConstant.*;

@Data
@Entity
@Table(name = LOBBY_STORY)
public class LobbyStory {

    @Id
    @Convert(attributeName = ID_LOBBY_STORY)
    private int idLobbyStory;

    @ManyToOne
    @JoinColumn(name = ID_LOBBY_MEMBER)
    private LobbyMember lobbyMember;

    @OneToOne
    @JoinColumn(name = ID_LOBBY_STORY)
    private Story lobbyStory;

    @ManyToOne
    @JoinColumn(name = ID_LOBBY)
    private Lobby lobby;

    @Column(name = CHECKED)
    private boolean checked;

    @Column(name = VOTE_COUNT)
    private int voteCount;
}
