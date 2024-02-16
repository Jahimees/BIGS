package by.jahimees.bigs.repository;

import by.jahimees.bigs.entity.StoryAssessment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoryAssessmentRepository extends JpaRepository<StoryAssessment, Integer> {
}
