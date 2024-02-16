package by.jahimees.bigs.repository;

import by.jahimees.bigs.entity.AccountComplaint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountComplaintRepository extends JpaRepository<AccountComplaint, Integer> {
}
