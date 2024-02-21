package by.jahimees.bigs.repository;

import by.jahimees.bigs.entity.Story;
import by.jahimees.bigs.facade.entity.StoryDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StoryRepository extends JpaRepository<Story, Integer> {

    Optional<StoryDto> findDtoByIdStory(int id);
}
