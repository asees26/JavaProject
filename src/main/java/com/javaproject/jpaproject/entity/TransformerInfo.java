package com.javaproject.jpaproject.entity;


import javax.persistence.*;

import lombok.*;



@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(builderMethodName = "transformerBuilder")
@Getter @Setter
@Table(
        name = "ck_transformer_info",
        uniqueConstraints = @UniqueConstraint(
                name = "Name_unique",
                columnNames = "name"
        )
)
public class TransformerInfo{

    @javax.persistence.Id
    @SequenceGenerator(name = "transformer_sequence",
            sequenceName = "transformer_sequence",
            allocationSize = 1)
    @GeneratedValue(
            strategy =GenerationType.SEQUENCE,
            generator = "transformer_sequence"
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
    private String code;
    private String createdBy;

}
