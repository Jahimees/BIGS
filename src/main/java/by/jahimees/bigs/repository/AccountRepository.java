package by.jahimees.bigs.repository;

import by.jahimees.bigs.entity.Account;
import by.jahimees.bigs.facade.entity.AccountDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {

    Optional<AccountDto> findDtoById(int id);
    Optional<AccountDto> findDtoByUsername(String username);
    Optional<Account> findByUsername(String name);
}
