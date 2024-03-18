package by.jahimees.bigs.controller.rest;

import by.jahimees.bigs.entity.Account;
import by.jahimees.bigs.facade.entity.AccountDto;
import by.jahimees.bigs.service.abstraction.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/bigs/v1/accounts")
@RequiredArgsConstructor
public class AccountRestController {

    private final AccountService accountDaoService;

    @GetMapping("/{id}")
    public ResponseEntity<AccountDto> findById(@PathVariable int id) {
        Optional<AccountDto> accountDtoOptional = accountDaoService.findDtoById(id);

        return accountDtoOptional.map(ResponseEntity::ok).orElseGet(
                () -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<AccountDto> create(@RequestBody Account account) {
        if (account == null || account.getUsername() == null
                || account.getPassword() == null) {
            throw new IllegalArgumentException("Account object is null or required field(s) is(are) null");
        }

        return new ResponseEntity<>(accountDaoService.saveAccount(account), HttpStatus.CREATED);
    }
}
