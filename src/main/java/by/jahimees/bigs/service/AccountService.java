package by.jahimees.bigs.service;

import by.jahimees.bigs.entity.Account;
import by.jahimees.bigs.facade.entity.AccountDto;
import by.jahimees.bigs.repository.AccountRepository;
import by.jahimees.bigs.service.abstraction.ComplexService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AccountService implements ComplexService<Account, AccountDto> {

    private final AccountRepository accountRepository;

    @Transactional
    public Optional<AccountDto> findDtoByUsername(String username) {
        return accountRepository.findDtoByUsername(username);
    }

    public Optional<Account> findByUsername(String username) {
        return accountRepository.findByUsername(username);
    }

    @Override
    public Optional<AccountDto> findDtoById(int id) {
        return accountRepository.findDtoById(id);
    }
}
