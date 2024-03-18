package by.jahimees.bigs.util;

import lombok.Getter;

public enum RoleEnum {
    ROLE_USER(1), ROLE_MODERATOR(2);

    RoleEnum(int i) {
        this.value = i;
    }

    private int value;

    public int getValue() {
        return value;
    }
}
