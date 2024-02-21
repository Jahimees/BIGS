package by.jahimees.bigs.service.dao;

import by.jahimees.bigs.facade.entity.StoryDto;
import by.jahimees.bigs.repository.StoryRepository;
import by.jahimees.bigs.service.abstraction.StoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StoryDaoService implements StoryService {

    private final StoryRepository storyRepository;

    @Override
    public Optional<StoryDto> findDtoById(int id) {
        return storyRepository.findDtoByIdStory(id);
    }
}
