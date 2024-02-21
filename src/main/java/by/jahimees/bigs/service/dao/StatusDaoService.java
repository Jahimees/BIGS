package by.jahimees.bigs.service.dao;

import by.jahimees.bigs.facade.entity.StatusDto;
import by.jahimees.bigs.repository.StatusRepository;
import by.jahimees.bigs.service.abstraction.StatusService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StatusDaoService implements StatusService {

    private final StatusRepository statusRepository;

    @Override
    public Optional<StatusDto> findDtoById(int id) {
        return statusRepository.findDtoByIdStatus(id);
    }

    @Override
    public List<StatusDto> findAll() {
        return statusRepository.findAllDtoBy();
    }
}
