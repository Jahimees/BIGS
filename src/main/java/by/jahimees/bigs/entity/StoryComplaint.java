package by.jahimees.bigs.entity;

import jakarta.persistence.*;
import lombok.Data;

import static by.jahimees.bigs.util.constant.DbConstant.*;

@Data
@Entity
@Table(name = STORY_COMPLAINT)
public class StoryComplaint {

    @Id
    @Column(name = ID_STORY_COMPLAINT)
    private int idStoryComplaint;

    @ManyToOne
    @JoinColumn(name = ID_ACCOUNT_COMPLAINER)
    private Account accountComplainer;

    @ManyToOne
    @JoinColumn(name = ID_STORY_ACCUSED)
    private Story storyAccused;

    @Column(name = TEXT)
    private String text;

    @ManyToOne
    @JoinColumn(name = ID_STORY_COMPLAINT_REASON)
    private StoryComplaintReason storyComplaintReason;

    @Column(name = CHECKED)
    private boolean checked;

    @ManyToOne
    @JoinColumn(name = ID_ACCOUNT_CHECKER)
    private Account accountChecker;

    @Column(name = CONCLUSION)
    private String conclusion;
}
