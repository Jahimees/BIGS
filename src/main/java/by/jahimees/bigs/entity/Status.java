package by.jahimees.bigs.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import static by.jahimees.bigs.util.constant.DbConstant.*;

@Data
@Entity
@Table(name = STATUS)
public class Status implements RawEntity {

    @Id
    @Column(name = ID_STATUS)
    private int idStatus;

    @Column(name = NAME)
    private String name;
}
