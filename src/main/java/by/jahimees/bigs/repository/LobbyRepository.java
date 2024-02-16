package by.jahimees.bigs.repository;

import by.jahimees.bigs.entity.Lobby;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LobbyRepository extends JpaRepository<Lobby, Integer> {
}
