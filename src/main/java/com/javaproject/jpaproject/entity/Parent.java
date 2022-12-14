//package com.javaproject.jpaproject.entity;
//
//
//import lombok.*;
//
//import javax.persistence.*;
//
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Builder
//@Getter
//@Setter
//@Table(name = "ck_parent")
//@MappedSuperclass
//public class Parent {
//    @javax.persistence.Id
//    @SequenceGenerator(name = "parent_sequence",
//            sequenceName = "parent_sequence",
//            allocationSize = 1)
//    @GeneratedValue(
//            strategy =GenerationType.SEQUENCE,
//            generator = "parent_sequence"
//    )
//
//    private long id;
//
//    private String lastModifiedTime;
//    private String modifiedBy;
//
//}
