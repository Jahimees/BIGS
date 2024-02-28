package by.jahimees.bigs.facade.entity.util;

import lombok.Getter;

import java.io.Serial;
import java.io.Serializable;

public record CustomPrincipal(int id) implements Serializable {

    @Getter
    @Serial
    private static final long serialVersionUID = 1L;

}
