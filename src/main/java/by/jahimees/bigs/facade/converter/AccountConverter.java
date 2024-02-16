package by.jahimees.bigs.facade.converter;

import by.jahimees.bigs.entity.Account;
import by.jahimees.bigs.facade.converter.abstraction.Converter;
import by.jahimees.bigs.facade.entity.AccountDto;

public class AccountConverter implements Converter<Account, AccountDto> {

    @Override
    public AccountDto convertToDto(Account entity) {
        return null;
    }

    @Override
    public Account convertToEntity(AccountDto dto) {
        return null;
    }
}
