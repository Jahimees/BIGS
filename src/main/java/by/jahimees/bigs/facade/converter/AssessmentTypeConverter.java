package by.jahimees.bigs.facade.converter;

import by.jahimees.bigs.entity.AssessmentType;
import by.jahimees.bigs.facade.converter.abstraction.Converter;
import by.jahimees.bigs.facade.entity.AssessmentTypeDto;

public class AssessmentTypeConverter implements Converter<AssessmentType, AssessmentTypeDto> {

    @Override
    public AssessmentTypeDto convertToDto(AssessmentType entity) {
        return null;
    }

    @Override
    public AssessmentType convertToEntity(AssessmentTypeDto dto) {
        return null;
    }
}
