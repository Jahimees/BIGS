package by.jahimees.bigs.facade.converter;

import by.jahimees.bigs.entity.StoryComplaint;
import by.jahimees.bigs.facade.converter.abstraction.Converter;
import by.jahimees.bigs.facade.entity.StoryComplaintDto;

public class StoryComplaintConverter implements Converter<StoryComplaint, StoryComplaintDto> {

    @Override
    public StoryComplaintDto convertToDto(StoryComplaint entity) {
        return null;
    }

    @Override
    public StoryComplaint convertToEntity(StoryComplaintDto dto) {
        return null;
    }
}
