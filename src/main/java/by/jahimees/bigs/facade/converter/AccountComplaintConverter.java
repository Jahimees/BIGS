package by.jahimees.bigs.facade.converter;

import by.jahimees.bigs.entity.AccountComplaint;
import by.jahimees.bigs.facade.converter.abstraction.Converter;
import by.jahimees.bigs.facade.entity.AccountComplaintDto;

public class AccountComplaintConverter implements Converter<AccountComplaint, AccountComplaintDto> {

    @Override
    public AccountComplaintDto convertToDto(AccountComplaint entity) {
        return null;
    }

    @Override
    public AccountComplaint convertToEntity(AccountComplaintDto dto) {
        return null;
    }
}
