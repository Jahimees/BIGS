package by.jahimees.bigs.facade.entity.util;

import lombok.Getter;

import java.io.Serial;
import java.io.Serializable;

@Getter
public record CustomPrincipal(int id) implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

}
