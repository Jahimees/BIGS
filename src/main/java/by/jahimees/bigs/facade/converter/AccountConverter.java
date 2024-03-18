package by.jahimees.bigs.facade.converter;

import by.jahimees.bigs.entity.Account;
import by.jahimees.bigs.facade.converter.abstraction.Converter;
import by.jahimees.bigs.facade.entity.AccountDto;
import by.jahimees.bigs.facade.entity.RoleDto;
import org.springframework.stereotype.Service;

@Service
public class AccountConverter implements Converter<Account, AccountDto> {

    @Override
    public AccountDto convertToDto(Account entity) {
        AccountDto accountDto = new AccountDto();
        accountDto.setIdAccount(entity.getIdAccount());
        accountDto.setRole(new RoleDto(entity.getRole()));
        accountDto.setUsername(entity.getUsername());
        accountDto.setName(entity.getName());

        return accountDto;
    }

    @Override
    public Account convertToEntity(AccountDto dto) {
        return null;
    }
}
