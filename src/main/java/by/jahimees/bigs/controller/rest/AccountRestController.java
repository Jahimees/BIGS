package by.jahimees.bigs.controller.rest;

import by.jahimees.bigs.facade.entity.AccountDto;
import by.jahimees.bigs.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/bigs/v1/accounts")
@RequiredArgsConstructor
public class AccountRestController {

    private final AccountService accountService;

    @GetMapping("/${id}")
    public ResponseEntity<AccountDto> findById(@RequestParam int id) {
        Optional<AccountDto> accountDtoOptional = accountService.findDtoById(id);

        return accountDtoOptional.map(ResponseEntity::ok).orElseGet(
                () -> ResponseEntity.notFound().build());
    }
}
