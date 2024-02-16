package by.jahimees.bigs.facade.converter;

import by.jahimees.bigs.entity.StoryAssessment;
import by.jahimees.bigs.facade.converter.abstraction.Converter;
import by.jahimees.bigs.facade.entity.StoryAssessmentDto;

public class StoryAssessmentConverter implements Converter<StoryAssessment, StoryAssessmentDto> {

    @Override
    public StoryAssessmentDto convertToDto(StoryAssessment entity) {
        return null;
    }

    @Override
    public StoryAssessment convertToEntity(StoryAssessmentDto dto) {
        return null;
    }
}
