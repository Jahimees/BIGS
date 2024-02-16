package by.jahimees.bigs.facade.converter;

import by.jahimees.bigs.entity.Story;
import by.jahimees.bigs.facade.converter.abstraction.Converter;
import by.jahimees.bigs.facade.entity.StoryDto;

public class StoryConverter implements Converter<Story, StoryDto> {

    @Override
    public StoryDto convertToDto(Story entity) {
        return null;
    }

    @Override
    public Story convertToEntity(StoryDto dto) {
        return null;
    }
}
