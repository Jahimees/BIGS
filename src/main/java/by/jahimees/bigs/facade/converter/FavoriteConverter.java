package by.jahimees.bigs.facade.converter;

import by.jahimees.bigs.entity.Favorite;
import by.jahimees.bigs.facade.converter.abstraction.Converter;
import by.jahimees.bigs.facade.entity.FavoriteDto;

public class FavoriteConverter implements Converter<Favorite, FavoriteDto> {

    @Override
    public FavoriteDto convertToDto(Favorite entity) {
        return null;
    }

    @Override
    public Favorite convertToEntity(FavoriteDto dto) {
        return null;
    }
}
