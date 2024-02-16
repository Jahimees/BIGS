package by.jahimees.bigs.facade.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class StatusDto implements DtoEntity {

    private int idStatus;
    private String name;

    public StatusDto(int idStatus, String name) {
        this.idStatus = idStatus;
        this.name = name;
    }
}
