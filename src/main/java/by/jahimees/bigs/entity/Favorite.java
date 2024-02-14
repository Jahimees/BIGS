package by.jahimees.bigs.entity;

import jakarta.persistence.*;
import lombok.Data;

import static by.jahimees.bigs.util.constant.DbConstant.*;

@Data
@Entity
@Table(name = FAVORITE)
public class Favorite {

    @Id
    @Column(name = ID_FAVORITE)
    private int idFavorite;

    @ManyToOne
    @JoinColumn(name = ID_ACCOUNT)
    private Account account;

    @ManyToOne
    @JoinColumn(name = ID_STORY)
    private Story story;
}
