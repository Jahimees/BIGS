package by.jahimees.bigs.controller.rest;

import by.jahimees.bigs.facade.entity.StoryDto;
import by.jahimees.bigs.service.abstraction.StoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/bigs/v1/stories")
public class StoryRestController {

    private final StoryService storyService;

    @GetMapping("/{id}")
    public ResponseEntity<StoryDto> findById(@PathVariable int id) {
        Optional<StoryDto> storyDtoOptional = storyService.findDtoById(id);

        return storyDtoOptional.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
