package by.jahimees.bigs.repository;

import by.jahimees.bigs.entity.LobbyStory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LobbyStoryRepository extends JpaRepository<LobbyStory, Integer> {
}
