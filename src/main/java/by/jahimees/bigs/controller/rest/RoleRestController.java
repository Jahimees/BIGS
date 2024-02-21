package by.jahimees.bigs.controller.rest;

import by.jahimees.bigs.facade.entity.RoleDto;
import by.jahimees.bigs.service.abstraction.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/bigs/v1/roles")
@RequiredArgsConstructor
public class RoleRestController {

    private final RoleService roleDaoService;

    @GetMapping("/{id}")
    public ResponseEntity<RoleDto> findById(@PathVariable int id) {
        Optional<RoleDto> roleDtoOptional = roleDaoService.findDtoById(id);

        return roleDtoOptional.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<RoleDto>> findAll() {
        return ResponseEntity.ok(roleDaoService.findAllDto());
    }

}
