package by.jahimees.bigs.service.dao;

import by.jahimees.bigs.entity.Account;
import by.jahimees.bigs.facade.entity.AccountDto;
import by.jahimees.bigs.repository.AccountRepository;
import by.jahimees.bigs.service.abstraction.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AccountDaoService implements AccountService {

    private final AccountRepository accountRepository;

    @Override
    public Optional<AccountDto> findDtoByUsername(String username) {
        return accountRepository.findDtoByUsername(username);
    }

    @Override
    public Optional<Account> findByUsername(String username) {
        return accountRepository.findByUsername(username);
    }

    @Override
    public Optional<AccountDto> findDtoById(int id) {
        return accountRepository.findDtoByIdAccount(id);
    }
}
