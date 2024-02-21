package by.jahimees.bigs.service.abstraction;

import by.jahimees.bigs.facade.entity.StoryDto;

import java.util.Optional;

public interface StoryService {

    Optional<StoryDto> findDtoById(int id);
}
