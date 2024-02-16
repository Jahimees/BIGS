package by.jahimees.bigs.entity;

import jakarta.persistence.*;
import lombok.Data;

import static by.jahimees.bigs.util.constant.DbConstant.*;

@Data
@Entity
@Table(name = LOBBY_MEMBER)
public class LobbyMember implements RawEntity {

    @Id
    @Column(name = ID_LOBBY_MEMBER)
    private int idLobbyMember;

    @ManyToOne
    @JoinColumn(name = ID_LOBBY)
    private Lobby lobby;

    @OneToOne
    @JoinColumn(name = ID_ACCOUNT)
    private Account account;
}
