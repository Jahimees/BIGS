package by.jahimees.bigs.facade.converter;

import by.jahimees.bigs.entity.Lobby;
import by.jahimees.bigs.facade.converter.abstraction.Converter;
import by.jahimees.bigs.facade.entity.LobbyDto;

public class LobbyConverter implements Converter<Lobby, LobbyDto> {

    @Override
    public LobbyDto convertToDto(Lobby entity) {
        return null;
    }

    @Override
    public Lobby convertToEntity(LobbyDto dto) {
        return null;
    }
}
