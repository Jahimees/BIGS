package by.jahimees.bigs.repository;

import by.jahimees.bigs.entity.AccountComplaintReason;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountComplaintReasonRepository extends JpaRepository<AccountComplaintReason, Integer> {
}
