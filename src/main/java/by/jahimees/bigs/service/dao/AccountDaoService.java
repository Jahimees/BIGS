package by.jahimees.bigs.service.dao;

import by.jahimees.bigs.entity.Account;
import by.jahimees.bigs.entity.Role;
import by.jahimees.bigs.facade.converter.AccountConverter;
import by.jahimees.bigs.facade.entity.AccountDto;
import by.jahimees.bigs.repository.AccountRepository;
import by.jahimees.bigs.service.abstraction.AccountService;
import by.jahimees.bigs.util.RoleEnum;
import jakarta.persistence.EntityExistsException;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AccountDaoService implements AccountService {

    private final AccountRepository accountRepository;
    private final BCryptPasswordEncoder passwordEncoder;
    private final AccountConverter accountConverter;

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

    @Override
    @Transactional
    public AccountDto saveAccount(Account account) {
        Optional<Account> accountOptional = findByUsername(account.getUsername());

        if (accountOptional.isPresent() || account.getIdAccount() != 0) {
            throw new EntityExistsException("Account with the same username already exists");
        }

        account.setRole(new Role(RoleEnum.ROLE_USER));
        account.setPassword(passwordEncoder.encode(account.getPassword()));

        return accountConverter.convertToDto(accountRepository.save(account));
    }
}
