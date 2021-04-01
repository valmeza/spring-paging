package com.pagingexample.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "character")
public class MovieCharacter {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String movie;
}
