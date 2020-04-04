package com.project.create.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity @Getter @Setter @ToString
public class SampleEntity {
    @Id
    private long id;
    private String name;
    private String value;
}
