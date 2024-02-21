package by.jahimees.bigs.controller.rest;

import by.jahimees.bigs.facade.entity.StatusDto;
import by.jahimees.bigs.service.abstraction.StatusService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/bigs/v1/statuses")
public class StatusRestController {

    private final StatusService statusService;

    @GetMapping("/{id}")
    public ResponseEntity<StatusDto> findById(@PathVariable int id) {
        Optional<StatusDto> statusDtoOptional = statusService.findDtoById(id);

        return statusDtoOptional.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<StatusDto>> findAll() {
        return ResponseEntity.ok(statusService.findAll());
    }
}
