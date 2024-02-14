package by.jahimees.bigs.entity;

import jakarta.persistence.*;
import lombok.Data;

import static by.jahimees.bigs.util.constant.DbConstant.*;

@Data
@Entity
@Table(name = STORY)
public class Story {

    @Id
    @Column(name = ID_STORY)
    private int idStory;

    @ManyToOne
    @JoinColumn(name = ID_ACCOUNT)
    private Account account;

    @Column(name = TITLE)
    private String title;

    @Column(name = TEXT)
    private String text;

    @Column(name = END)
    private String end;
}
