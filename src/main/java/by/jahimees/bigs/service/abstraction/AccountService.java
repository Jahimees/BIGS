package by.jahimees.bigs.service.abstraction;

import by.jahimees.bigs.entity.Account;
import by.jahimees.bigs.facade.entity.AccountDto;

import java.util.Optional;

public interface AccountService {

    Optional<AccountDto> findDtoByUsername(String username);

    Optional<Account> findByUsername(String username);

    Optional<AccountDto> findDtoById(int id);
}
