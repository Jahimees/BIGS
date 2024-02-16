package by.jahimees.bigs.repository;

import by.jahimees.bigs.entity.LobbyMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LobbyMemberRepository extends JpaRepository<LobbyMember, Integer> {
}
