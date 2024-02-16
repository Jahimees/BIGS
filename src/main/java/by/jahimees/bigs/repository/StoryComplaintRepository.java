package by.jahimees.bigs.repository;

import by.jahimees.bigs.entity.StoryComplaint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoryComplaintRepository extends JpaRepository<StoryComplaint, Integer> {
}
