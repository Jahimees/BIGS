package by.jahimees.bigs.entity;

import jakarta.persistence.*;
import lombok.Data;

import static by.jahimees.bigs.util.constant.DbConstant.*;

@Data
@Entity
@Table(name = LOBBY)
public class Lobby {

    @Id
    @Column(name = ID_LOBBY)
    private int idLobby;

    @ManyToOne
    @JoinColumn(name = ID_ACCOUNT)
    private Account account;

    @Column(name = NAME)
    private String name;

    @Column(name = CODE)
    private String code;

    @Column(name = STORY_COUNT)
    private int storyCount;

    @Column(name = PLAYER_COUNT)
    private int playerCount;

}
