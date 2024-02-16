package by.jahimees.bigs.repository;

import by.jahimees.bigs.entity.StoryComplaintReason;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoryComplaintReasonRepository extends JpaRepository<StoryComplaintReason, Integer> {
}
