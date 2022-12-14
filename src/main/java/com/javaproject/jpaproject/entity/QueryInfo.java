package com.javaproject.jpaproject.entity;


import javax.persistence.*;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.UUID;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(builderMethodName = "queryBuilder")
@Getter @Setter
@Table(
        name = "ck_query_info",
        uniqueConstraints = @UniqueConstraint(
                name = "Name_unique",
                columnNames = "name"
        )
)
public class QueryInfo{

    @javax.persistence.Id
    @SequenceGenerator(name = "query_sequence",
            sequenceName = "query_sequence",
            allocationSize = 1)
    @GeneratedValue(
            strategy =GenerationType.SEQUENCE,
            generator = "query_sequence"
    )
    private long id;
    @Column(
            name = "name",
            nullable = false
    )
     private String name;
    private String owner;
    private String description;
    @Column(name = "creation_time")
    private String creationTime;

}
