package by.jahimees.bigs.facade.converter;

import by.jahimees.bigs.entity.AccountStatus;
import by.jahimees.bigs.facade.converter.abstraction.Converter;
import by.jahimees.bigs.facade.entity.AccountStatusDto;

public class AccountStatusConverter implements Converter<AccountStatus, AccountStatusDto> {

    @Override
    public AccountStatusDto convertToDto(AccountStatus entity) {
        return null;
    }

    @Override
    public AccountStatus convertToEntity(AccountStatusDto dto) {
        return null;
    }
}
