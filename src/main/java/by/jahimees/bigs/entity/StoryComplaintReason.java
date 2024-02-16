package by.jahimees.bigs.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import static by.jahimees.bigs.util.constant.DbConstant.*;

@Data
@Entity
@Table(name = STORY_COMPLAINT_REASON)
public class StoryComplaintReason implements RawEntity {

    @Id
    @Column(name = ID_STORY_COMPLAINT_REASON)
    private int idStoryComplaintReason;

    @Column(name = NAME)
    private String name;
}
