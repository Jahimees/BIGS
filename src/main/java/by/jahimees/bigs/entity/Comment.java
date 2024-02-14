package by.jahimees.bigs.entity;

import jakarta.persistence.*;
import lombok.Data;

import static by.jahimees.bigs.util.constant.DbConstant.*;

@Data
@Entity
@Table(name = COMMENT)
public class Comment {

    @Id
    @Column(name = ID_COMMENT)
    private int idComment;

    @ManyToOne
    @JoinColumn(name = ID_ACCOUNT)
    private Account account;

    @ManyToOne
    @JoinColumn(name = ID_STORY)
    private Story story;

    @Column(name = TEXT)
    private String text;
}
