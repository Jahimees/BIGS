package by.jahimees.bigs.repository;

import by.jahimees.bigs.entity.Status;
import by.jahimees.bigs.facade.entity.StatusDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StatusRepository extends JpaRepository<Status, Integer> {

    Optional<StatusDto> findDtoByIdStatus(int id);

    List<StatusDto> findAllDtoBy();
}
