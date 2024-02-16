package by.jahimees.bigs.facade.converter;

import by.jahimees.bigs.entity.LobbyMember;
import by.jahimees.bigs.facade.converter.abstraction.Converter;
import by.jahimees.bigs.facade.entity.LobbyMemberDto;

public class LobbyMemberConverter implements Converter<LobbyMember, LobbyMemberDto> {

    @Override
    public LobbyMemberDto convertToDto(LobbyMember entity) {
        return null;
    }

    @Override
    public LobbyMember convertToEntity(LobbyMemberDto dto) {
        return null;
    }
}
